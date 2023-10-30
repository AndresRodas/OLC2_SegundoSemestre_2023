// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // SwiftGrammar
import "github.com/antlr4-go/antlr/v4"

// import "Server2/interfaces"
// import "Server2/environment"
// import "Server2/expressions"
// import "Server2/instructions"
// import "strings"

// A complete Visitor for a parse tree produced by SwiftGrammarParser.
type SwiftGrammarVisitor interface {
	antlr.ParseTreeVisitor

	// Visit a parse tree produced by SwiftGrammarParser#s.
	VisitS(ctx *SContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#block.
	VisitBlock(ctx *BlockContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#instruction.
	VisitInstruction(ctx *InstructionContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#structCreation.
	VisitStructCreation(ctx *StructCreationContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#listStructDec.
	VisitListStructDec(ctx *ListStructDecContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#function.
	VisitFunction(ctx *FunctionContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#listParamsFunc.
	VisitListParamsFunc(ctx *ListParamsFuncContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#assignment.
	VisitAssignment(ctx *AssignmentContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#printstmt.
	VisitPrintstmt(ctx *PrintstmtContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#ifstmt.
	VisitIfstmt(ctx *IfstmtContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#declarationstmt.
	VisitDeclarationstmt(ctx *DeclarationstmtContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#types.
	VisitTypes(ctx *TypesContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#expr.
	VisitExpr(ctx *ExprContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#listParams.
	VisitListParams(ctx *ListParamsContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#listArray.
	VisitListArray(ctx *ListArrayContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#listAccessArray.
	VisitListAccessArray(ctx *ListAccessArrayContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#callFunction.
	VisitCallFunction(ctx *CallFunctionContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#listParamsCall.
	VisitListParamsCall(ctx *ListParamsCallContext) interface{}

	// Visit a parse tree produced by SwiftGrammarParser#listStructExp.
	VisitListStructExp(ctx *ListStructExpContext) interface{}
}
