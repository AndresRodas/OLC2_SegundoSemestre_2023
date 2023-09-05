// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // SwiftGrammar
import "github.com/antlr4-go/antlr/v4"

// SwiftGrammarListener is a complete listener for a parse tree produced by SwiftGrammarParser.
type SwiftGrammarListener interface {
	antlr.ParseTreeListener

	// EnterS is called when entering the s production.
	EnterS(c *SContext)

	// EnterBlock is called when entering the block production.
	EnterBlock(c *BlockContext)

	// EnterInstruction is called when entering the instruction production.
	EnterInstruction(c *InstructionContext)

	// EnterStructCreation is called when entering the structCreation production.
	EnterStructCreation(c *StructCreationContext)

	// EnterListStructDec is called when entering the listStructDec production.
	EnterListStructDec(c *ListStructDecContext)

	// EnterFunction is called when entering the function production.
	EnterFunction(c *FunctionContext)

	// EnterListParamsFunc is called when entering the listParamsFunc production.
	EnterListParamsFunc(c *ListParamsFuncContext)

	// EnterAssignment is called when entering the assignment production.
	EnterAssignment(c *AssignmentContext)

	// EnterPrintstmt is called when entering the printstmt production.
	EnterPrintstmt(c *PrintstmtContext)

	// EnterIfstmt is called when entering the ifstmt production.
	EnterIfstmt(c *IfstmtContext)

	// EnterDeclarationstmt is called when entering the declarationstmt production.
	EnterDeclarationstmt(c *DeclarationstmtContext)

	// EnterTypes is called when entering the types production.
	EnterTypes(c *TypesContext)

	// EnterExpr is called when entering the expr production.
	EnterExpr(c *ExprContext)

	// EnterListParams is called when entering the listParams production.
	EnterListParams(c *ListParamsContext)

	// EnterListArray is called when entering the listArray production.
	EnterListArray(c *ListArrayContext)

	// EnterCallFunction is called when entering the callFunction production.
	EnterCallFunction(c *CallFunctionContext)

	// EnterListParamsCall is called when entering the listParamsCall production.
	EnterListParamsCall(c *ListParamsCallContext)

	// EnterListStructExp is called when entering the listStructExp production.
	EnterListStructExp(c *ListStructExpContext)

	// ExitS is called when exiting the s production.
	ExitS(c *SContext)

	// ExitBlock is called when exiting the block production.
	ExitBlock(c *BlockContext)

	// ExitInstruction is called when exiting the instruction production.
	ExitInstruction(c *InstructionContext)

	// ExitStructCreation is called when exiting the structCreation production.
	ExitStructCreation(c *StructCreationContext)

	// ExitListStructDec is called when exiting the listStructDec production.
	ExitListStructDec(c *ListStructDecContext)

	// ExitFunction is called when exiting the function production.
	ExitFunction(c *FunctionContext)

	// ExitListParamsFunc is called when exiting the listParamsFunc production.
	ExitListParamsFunc(c *ListParamsFuncContext)

	// ExitAssignment is called when exiting the assignment production.
	ExitAssignment(c *AssignmentContext)

	// ExitPrintstmt is called when exiting the printstmt production.
	ExitPrintstmt(c *PrintstmtContext)

	// ExitIfstmt is called when exiting the ifstmt production.
	ExitIfstmt(c *IfstmtContext)

	// ExitDeclarationstmt is called when exiting the declarationstmt production.
	ExitDeclarationstmt(c *DeclarationstmtContext)

	// ExitTypes is called when exiting the types production.
	ExitTypes(c *TypesContext)

	// ExitExpr is called when exiting the expr production.
	ExitExpr(c *ExprContext)

	// ExitListParams is called when exiting the listParams production.
	ExitListParams(c *ListParamsContext)

	// ExitListArray is called when exiting the listArray production.
	ExitListArray(c *ListArrayContext)

	// ExitCallFunction is called when exiting the callFunction production.
	ExitCallFunction(c *CallFunctionContext)

	// ExitListParamsCall is called when exiting the listParamsCall production.
	ExitListParamsCall(c *ListParamsCallContext)

	// ExitListStructExp is called when exiting the listStructExp production.
	ExitListStructExp(c *ListStructExpContext)
}
