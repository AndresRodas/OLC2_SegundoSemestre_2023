// Code generated from SwiftGrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // SwiftGrammar
import "github.com/antlr4-go/antlr/v4"

type BaseSwiftGrammarVisitor struct {
	*antlr.BaseParseTreeVisitor
}

func (v *BaseSwiftGrammarVisitor) VisitS(ctx *SContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitBlock(ctx *BlockContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitInstruction(ctx *InstructionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitStructCreation(ctx *StructCreationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitListStructDec(ctx *ListStructDecContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitFunction(ctx *FunctionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitListParamsFunc(ctx *ListParamsFuncContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitAssignment(ctx *AssignmentContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitPrintstmt(ctx *PrintstmtContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitIfstmt(ctx *IfstmtContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitDeclarationstmt(ctx *DeclarationstmtContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitTypes(ctx *TypesContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitExpr(ctx *ExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitListParams(ctx *ListParamsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitListArray(ctx *ListArrayContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitListAccessArray(ctx *ListAccessArrayContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitCallFunction(ctx *CallFunctionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitListParamsCall(ctx *ListParamsCallContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseSwiftGrammarVisitor) VisitListStructExp(ctx *ListStructExpContext) interface{} {
	return v.VisitChildren(ctx)
}
