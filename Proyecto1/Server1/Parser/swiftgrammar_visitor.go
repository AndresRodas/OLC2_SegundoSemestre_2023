// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package Parser // SwiftGrammar
import "github.com/antlr4-go/antlr/v4"

// A complete Visitor for a parse tree produced by SwiftGrammarParser.
type SwiftGrammarVisitor interface {
	antlr.ParseTreeVisitor

	// Visit a parse tree produced by SwiftGrammarParser#s.
	VisitS(ctx *SContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#block.
	VisitBlock(ctx *BlockContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#stmt.
	VisitStmt(ctx *StmtContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#printstmt.
	VisitPrintstmt(ctx *PrintstmtContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#ifstmt.
	VisitIfstmt(ctx *IfstmtContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#ParExpr.
	VisitParExpr(ctx *ParExprContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#PrimExpr.
	VisitPrimExpr(ctx *PrimExprContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#OpExpr.
	VisitOpExpr(ctx *OpExprContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#NumExpr.
	VisitNumExpr(ctx *NumExprContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#IdExpr.
	VisitIdExpr(ctx *IdExprContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#StrExpr.
	VisitStrExpr(ctx *StrExprContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#BoolExpr.
	VisitBoolExpr(ctx *BoolExprContext) interface{}
}
