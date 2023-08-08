package main

import (
	"Server1/Parser"
	"fmt"
	"log"
	"strconv"
	"strings"

	"github.com/antlr4-go/antlr/v4"
	"github.com/gofiber/fiber/v2"
	"github.com/gofiber/fiber/v2/middleware/cors"
)

type Visitor struct {
	antlr.ParseTreeVisitor
	memory map[string]interface{}
}

func NewVisitor() Parser.SwiftGrammarVisitor {
	return &Visitor{
		ParseTreeVisitor: &Parser.BaseSwiftGrammarVisitor{},
	}

}

func (l *Visitor) VisitS(ctx *Parser.SContext) interface{} {
	return l.Visit(ctx.Block())
}

func (l *Visitor) VisitBlock(ctx *Parser.BlockContext) interface{} {
	out := ""
	for i := 0; ctx.Stmt(i) != nil; i++ {
		out += strconv.FormatInt(l.Visit(ctx.Stmt(i)).(int64), 10) + " "
	}
	return out
}

func (l *Visitor) VisitStmt(ctx *Parser.StmtContext) interface{} {
	if ctx.Printstmt() != nil {
		return l.Visit(ctx.Printstmt())
	}
	if ctx.Ifstmt() != nil {
		// return l.Visit(ctx.Ifstmt())
		return "If Execute!"
	}
	return nil
}

func (l *Visitor) VisitPrintstmt(ctx *Parser.PrintstmtContext) interface{} {
	returnValue := l.Visit(ctx.Expr())
	return returnValue
}

func (l *Visitor) VisitIfstmt(ctx *Parser.IfstmtContext) interface{} {
	fmt.Println("If Implements..")
	return true
}

func (l *Visitor) VisitOpExpr(ctx *Parser.OpExprContext) interface{} {
	m := l.Visit(ctx.GetLeft()).(int64)
	r := l.Visit(ctx.GetRight()).(int64)
	op := ctx.GetOp().GetText()
	switch op {
	case "+":
		return m + r
	case "-":
		return m - r
	case "*":
		return m * r
	case "/":
		return m / r
	case "<":
		if m < r {
			return true
		} else {
			return false
		}
	}
	return true
}

func (l *Visitor) VisitParExpr(ctx *Parser.ParExprContext) interface{} {
	return l.Visit(ctx.Expr())
}

func (l *Visitor) VisitPrimExpr(ctx *Parser.PrimExprContext) interface{} {
	return l.Visit(ctx.Primitivo())
}

func (l *Visitor) VisitNumExpr(ctx *Parser.NumExprContext) interface{} {
	i, _ := strconv.ParseInt(ctx.GetText(), 10, 64)
	return i
}

func (l *Visitor) VisitIdExpr(ctx *Parser.IdExprContext) interface{} {
	id := ctx.GetText()
	value, ok := l.memory[id]
	if ok {
		return value
	} else {
		panic("no existe la variable " + id)
	}
	return nil
}

func (l *Visitor) VisitStrExpr(ctx *Parser.StrExprContext) interface{} {
	value := strings.Trim(ctx.GetText(), "\"")
	return value
}

func (l *Visitor) VisitBoolExpr(ctx *Parser.BoolExprContext) interface{} {
	value := strings.Trim(ctx.GetText(), "\"")
	return value
}

// Funcion visitar
func (l *Visitor) Visit(tree antlr.ParseTree) interface{} {
	switch val := tree.(type) {
	case *antlr.ErrorNodeImpl:
		log.Fatal(val.GetText())
		return nil
	default:
		nodo := tree.Accept(l)
		return nodo
	}
}

type Resp struct {
	Output  string
	Flag    bool
	Message string
}

type Message struct {
	Content string `json:"content"`
}

func handleVisitor(c *fiber.Ctx) error {

	var message Message
	if err := c.BodyParser(&message); err != nil {
		return err
	}
	code := message.Content
	input := antlr.NewInputStream(code)
	lexer := Parser.NewSwiftLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	p := Parser.NewSwiftGrammarParser(tokens)
	p.BuildParseTrees = true
	visitor := NewVisitor()
	tree := p.S()
	out := visitor.Visit(tree)
	response := Resp{
		Output:  out.(string),
		Flag:    true,
		Message: "<3 Ejecución realizada con éxito <3",
	}
	return c.Status(fiber.StatusOK).JSON(response)
}

func main() {
	fmt.Println("OLC2 ;)")
	app := fiber.New()
	app.Use(cors.New())
	app.Post("/Visitor", handleVisitor)
	app.Listen(":3001")

}
