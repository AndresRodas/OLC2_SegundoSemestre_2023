package main

import (
	"Server1/Parser"
	"fmt"
	"log"
	"strconv"
	"strings"

	"github.com/antlr4-go/antlr/v4"
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
	// return ctx.A().Accept(l)
	return l.Visit(ctx.Block())
}

func (l *Visitor) VisitBlock(ctx *Parser.BlockContext) interface{} {
	for i := 0; ctx.Stmt(i) != nil; i++ {
		l.Visit(ctx.Stmt(i))
	}
	return true
}

func (l *Visitor) VisitStmt(ctx *Parser.StmtContext) interface{} {
	if ctx.Printstmt() != nil {
		return l.Visit(ctx.Printstmt())
	}
	if ctx.Ifstmt() != nil {
		// return l.Visit(ctx.Ifstmt())
		return "If Execute!"
	}
	return true
}

func (l *Visitor) VisitPrintstmt(ctx *Parser.PrintstmtContext) interface{} {
	fmt.Println(l.Visit(ctx.Expr()))
	return true
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

func main() {
	fmt.Println("hola mundo")
	code := "print((5+6+9+7-23)*4)"

	input := antlr.NewInputStream(code)
	lexer := Parser.NewSwiftLexer(input)
	tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	p := Parser.NewSwiftGrammarParser(tokens)
	p.BuildParseTrees = true
	visitor := NewVisitor()
	tree := p.S()
	visitor.Visit(tree)

}
