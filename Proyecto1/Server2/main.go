package main

import (
	"Server2/environment"
	"Server2/interfaces"
	"Server2/parser"
	"fmt"

	"github.com/antlr4-go/antlr/v4"
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

/* func handleInterpreter(c *fiber.Ctx) error {
	var message Message
	if err := c.BodyParser(&message); err != nil {
		return err
	}

	response := Resp{
		Output:  out.(string),
		Flag:    true,
		Message: "<3 Ejecución realizada con éxito <3",
	}
	return c.Status(fiber.StatusOK).JSON(response)
} */

func main() {

	//Entrada
	code := "print(10+1*1/85)"
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
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitS(ctx *parser.SContext) {
	this.Code = ctx.GetCode()
}
