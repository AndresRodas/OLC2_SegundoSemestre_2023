package main

import (
	"Server2/environment"
	"Server2/generator"
	"Server2/interfaces"
	"Server2/parser"
	"fmt"
	"regexp"
	"strings"

	"github.com/antlr4-go/antlr/v4"
	"github.com/gofiber/fiber/v2"
	"github.com/gofiber/fiber/v2/middleware/cors"
)

type TreeShapeListener struct {
	*parser.BaseSwiftGrammarListener
	Code []interface{}
}

type Resp struct {
	Output  string
	Flag    bool
	Message string
	ArrCode []interface{}
}

type Message struct {
	Content string `json:"content"`
}

type ArrMessage struct {
	Content []string `json:"content"`
}

func validateLineRule1(line string) bool {
	patron := `^t\d+\s*=\s*(t\d+|\d+)\s*[+\-\*/]\s*(t\d+|\d+)$`
	regex := regexp.MustCompile(patron)
	flag := regex.MatchString(line)
	return flag
}

func getTokensRule1(line string) (string, string, string, string) {
	tempArr := strings.Split(line, " ")
	return tempArr[0], tempArr[2], tempArr[3], tempArr[4]
}

func cleanLineRule1(line string) string {
	noJump := strings.ReplaceAll(line, "\n", "")
	noTab := strings.ReplaceAll(noJump, "\t", "")
	newLine := strings.ReplaceAll(noTab, ";", "")
	return newLine
}

func Rule1(arr []string) []string { //Eliminación de instrucciones red. de carga y almacenamiento
	//se recorre el arreglo
	for i := 0; i < len(arr); i++ {
		//leyendo entrada
		line := cleanLineRule1(arr[i])
		//comprobando
		if validateLineRule1(line) {
			//obteniendo tokens
			target1, left1, op1, right1 := getTokensRule1(line)
			//continuando recorrido
			for j := i + 1; j < len(arr); j++ {
				//leyendo nueva entrada
				line2 := cleanLineRule1(arr[j])
				if validateLineRule1(line2) {
					target2, left2, op2, right2 := getTokensRule1(line2)
					//validación 1
					if target2 == target1 || target2 == left1 || target2 == right1 {
						break
					}
					//validación 2
					if left1+op1+right1 == left2+op2+right2 || left1+op1+right1 == right2+op2+left2 {
						//sustituir
						arr[j] = "\t" + target2 + " = " + target1 + ";\n"
						continue
					}
				}

			}
		}
	}
	return arr
}

func handleInterpreter(c *fiber.Ctx) error {
	var message Message
	if err := c.BodyParser(&message); err != nil {
		return err
	}
	//Entrada
	code := message.Content
	//Leyendo entrada
	input := antlr.NewInputStream(code)
	lexer := parser.NewSwiftLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	//creacion de parser
	p := parser.NewSwiftGrammarParser(tokens)
	p.BuildParseTrees = true
	tree := p.S()
	//listener
	var listener *TreeShapeListener = NewTreeShapeListener()
	antlr.ParseTreeWalkerDefault.Walk(listener, tree)
	Code := listener.Code
	//create ast
	var Ast environment.AST
	//create env
	var globalEnv environment.Environment = environment.NewEnvironment(nil, "GLOBAL")
	//create generator
	var Generator generator.Generator
	Generator = generator.NewGenerator()
	//running main
	Generator.MainCode = true
	//ejecución
	for _, bloc := range Code {
		if strings.Contains(fmt.Sprintf("%T", bloc), "instructions") {
			resInst := bloc.(interfaces.Instruction).Ejecutar(&Ast, globalEnv, &Generator)
			if resInst != nil {
				//agregando etiquetas de salida
				for _, lvl := range resInst.(environment.Value).OutLabel {
					Generator.AddLabel(lvl.(string))
				}
			}
		}
	}

	//add headers, natives & main
	Generator.GenerateFinalCode()
	var ConsoleOut = ""
	if Ast.GetErrors() == "" {
		for _, item := range Generator.GetFinalCode() {
			ConsoleOut += item.(string)
		}
	} else {
		ConsoleOut = Ast.GetErrors()
	}
	response := Resp{
		Output:  ConsoleOut,
		Flag:    true,
		Message: "<3 Ejecución realizada con éxito <3",
		ArrCode: Generator.GetFinalCode(),
	}
	return c.Status(fiber.StatusOK).JSON(response)
}

func handleOptimize(c *fiber.Ctx) error {
	var message ArrMessage
	if err := c.BodyParser(&message); err != nil {
		return err
	}
	//Array entrada
	code := message.Content
	//evaluando regla1
	codeR1 := Rule1(code)

	//salida
	var ConsoleOut = ""
	for _, item := range codeR1 {
		ConsoleOut += item
	}
	response := Resp{
		Output:  ConsoleOut,
		Flag:    true,
		Message: "<3 Ejecución realizada con éxito <3",
		ArrCode: nil,
	}
	return c.Status(fiber.StatusOK).JSON(response)
}

func main() {
	app := fiber.New()
	app.Use(cors.New())
	app.Post("/Interpreter", handleInterpreter)
	app.Post("/Optimizer", handleOptimize)
	app.Listen(":3002")
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitS(ctx *parser.SContext) {
	this.Code = ctx.GetCode()
}
