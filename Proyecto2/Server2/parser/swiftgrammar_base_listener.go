// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // SwiftGrammar
import "github.com/antlr4-go/antlr/v4"

// BaseSwiftGrammarListener is a complete listener for a parse tree produced by SwiftGrammarParser.
type BaseSwiftGrammarListener struct{}

var _ SwiftGrammarListener = &BaseSwiftGrammarListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseSwiftGrammarListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseSwiftGrammarListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseSwiftGrammarListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseSwiftGrammarListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterS is called when production s is entered.
func (s *BaseSwiftGrammarListener) EnterS(ctx *SContext) {}

// ExitS is called when production s is exited.
func (s *BaseSwiftGrammarListener) ExitS(ctx *SContext) {}

// EnterBlock is called when production block is entered.
func (s *BaseSwiftGrammarListener) EnterBlock(ctx *BlockContext) {}

// ExitBlock is called when production block is exited.
func (s *BaseSwiftGrammarListener) ExitBlock(ctx *BlockContext) {}

// EnterInstruction is called when production instruction is entered.
func (s *BaseSwiftGrammarListener) EnterInstruction(ctx *InstructionContext) {}

// ExitInstruction is called when production instruction is exited.
func (s *BaseSwiftGrammarListener) ExitInstruction(ctx *InstructionContext) {}

// EnterStructCreation is called when production structCreation is entered.
func (s *BaseSwiftGrammarListener) EnterStructCreation(ctx *StructCreationContext) {}

// ExitStructCreation is called when production structCreation is exited.
func (s *BaseSwiftGrammarListener) ExitStructCreation(ctx *StructCreationContext) {}

// EnterListStructDec is called when production listStructDec is entered.
func (s *BaseSwiftGrammarListener) EnterListStructDec(ctx *ListStructDecContext) {}

// ExitListStructDec is called when production listStructDec is exited.
func (s *BaseSwiftGrammarListener) ExitListStructDec(ctx *ListStructDecContext) {}

// EnterFunction is called when production function is entered.
func (s *BaseSwiftGrammarListener) EnterFunction(ctx *FunctionContext) {}

// ExitFunction is called when production function is exited.
func (s *BaseSwiftGrammarListener) ExitFunction(ctx *FunctionContext) {}

// EnterListParamsFunc is called when production listParamsFunc is entered.
func (s *BaseSwiftGrammarListener) EnterListParamsFunc(ctx *ListParamsFuncContext) {}

// ExitListParamsFunc is called when production listParamsFunc is exited.
func (s *BaseSwiftGrammarListener) ExitListParamsFunc(ctx *ListParamsFuncContext) {}

// EnterAssignment is called when production assignment is entered.
func (s *BaseSwiftGrammarListener) EnterAssignment(ctx *AssignmentContext) {}

// ExitAssignment is called when production assignment is exited.
func (s *BaseSwiftGrammarListener) ExitAssignment(ctx *AssignmentContext) {}

// EnterPrintstmt is called when production printstmt is entered.
func (s *BaseSwiftGrammarListener) EnterPrintstmt(ctx *PrintstmtContext) {}

// ExitPrintstmt is called when production printstmt is exited.
func (s *BaseSwiftGrammarListener) ExitPrintstmt(ctx *PrintstmtContext) {}

// EnterIfstmt is called when production ifstmt is entered.
func (s *BaseSwiftGrammarListener) EnterIfstmt(ctx *IfstmtContext) {}

// ExitIfstmt is called when production ifstmt is exited.
func (s *BaseSwiftGrammarListener) ExitIfstmt(ctx *IfstmtContext) {}

// EnterDeclarationstmt is called when production declarationstmt is entered.
func (s *BaseSwiftGrammarListener) EnterDeclarationstmt(ctx *DeclarationstmtContext) {}

// ExitDeclarationstmt is called when production declarationstmt is exited.
func (s *BaseSwiftGrammarListener) ExitDeclarationstmt(ctx *DeclarationstmtContext) {}

// EnterTypes is called when production types is entered.
func (s *BaseSwiftGrammarListener) EnterTypes(ctx *TypesContext) {}

// ExitTypes is called when production types is exited.
func (s *BaseSwiftGrammarListener) ExitTypes(ctx *TypesContext) {}

// EnterExpr is called when production expr is entered.
func (s *BaseSwiftGrammarListener) EnterExpr(ctx *ExprContext) {}

// ExitExpr is called when production expr is exited.
func (s *BaseSwiftGrammarListener) ExitExpr(ctx *ExprContext) {}

// EnterListParams is called when production listParams is entered.
func (s *BaseSwiftGrammarListener) EnterListParams(ctx *ListParamsContext) {}

// ExitListParams is called when production listParams is exited.
func (s *BaseSwiftGrammarListener) ExitListParams(ctx *ListParamsContext) {}

// EnterListArray is called when production listArray is entered.
func (s *BaseSwiftGrammarListener) EnterListArray(ctx *ListArrayContext) {}

// ExitListArray is called when production listArray is exited.
func (s *BaseSwiftGrammarListener) ExitListArray(ctx *ListArrayContext) {}

// EnterCallFunction is called when production callFunction is entered.
func (s *BaseSwiftGrammarListener) EnterCallFunction(ctx *CallFunctionContext) {}

// ExitCallFunction is called when production callFunction is exited.
func (s *BaseSwiftGrammarListener) ExitCallFunction(ctx *CallFunctionContext) {}

// EnterListParamsCall is called when production listParamsCall is entered.
func (s *BaseSwiftGrammarListener) EnterListParamsCall(ctx *ListParamsCallContext) {}

// ExitListParamsCall is called when production listParamsCall is exited.
func (s *BaseSwiftGrammarListener) ExitListParamsCall(ctx *ListParamsCallContext) {}

// EnterListStructExp is called when production listStructExp is entered.
func (s *BaseSwiftGrammarListener) EnterListStructExp(ctx *ListStructExpContext) {}

// ExitListStructExp is called when production listStructExp is exited.
func (s *BaseSwiftGrammarListener) ExitListStructExp(ctx *ListStructExpContext) {}
