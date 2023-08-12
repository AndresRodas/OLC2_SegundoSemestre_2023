package main

import (
	"Server2/environment"
	"Server2/interfaces"
	"Server2/parser"
	"fmt"

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
	//ejecución
	for _, inst := range Code {
		inst.(interfaces.Instruction).Ejecutar(&Ast, nil)
	}
	fmt.Println(Ast.GetPrint())
	response := Resp{
		Output:  Ast.GetPrint(),
		Flag:    true,
		Message: "<3 Ejecución realizada con éxito <3",
	}
	return c.Status(fiber.StatusOK).JSON(response)
}

func main() {

	fmt.Println("OLC2 ;)")
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
