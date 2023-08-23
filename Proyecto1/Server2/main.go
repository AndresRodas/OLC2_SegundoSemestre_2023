package main

import (
	"Server2/environment"
	"Server2/interfaces"
	"Server2/parser"

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
}

type Message struct {
	Content string `json:"content"`
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
	//ejecución
	for _, inst := range Code {
		inst.(interfaces.Instruction).Ejecutar(&Ast, globalEnv)
	}
	var ConsoleOut = ""
	if Ast.GetErrors() == "" {
		ConsoleOut = Ast.GetPrint()
	} else {
		ConsoleOut = Ast.GetErrors()
	}
	response := Resp{
		Output:  ConsoleOut,
		Flag:    true,
		Message: "<3 Ejecución realizada con éxito <3",
	}
	return c.Status(fiber.StatusOK).JSON(response)
}

func main() {
	app := fiber.New()
	app.Use(cors.New())
	app.Post("/Interpreter", handleInterpreter)
	app.Listen(":3002")
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitS(ctx *parser.SContext) {
	this.Code = ctx.GetCode()
}
