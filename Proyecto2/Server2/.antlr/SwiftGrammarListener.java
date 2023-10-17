// Generated from c:/Users/darkm/OneDrive/Documentos/Proyectos/OLC2_SegundoSemestre_2023/Proyecto2/Server2/SwiftGrammar.g4 by ANTLR 4.13.1

    import "Server2/interfaces"
    import "Server2/environment"
    import "Server2/expressions"
    import "Server2/instructions"
    import "strings"

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SwiftGrammarParser}.
 */
public interface SwiftGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(SwiftGrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(SwiftGrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SwiftGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SwiftGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(SwiftGrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(SwiftGrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#structCreation}.
	 * @param ctx the parse tree
	 */
	void enterStructCreation(SwiftGrammarParser.StructCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#structCreation}.
	 * @param ctx the parse tree
	 */
	void exitStructCreation(SwiftGrammarParser.StructCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listStructDec}.
	 * @param ctx the parse tree
	 */
	void enterListStructDec(SwiftGrammarParser.ListStructDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listStructDec}.
	 * @param ctx the parse tree
	 */
	void exitListStructDec(SwiftGrammarParser.ListStructDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SwiftGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SwiftGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listParamsFunc}.
	 * @param ctx the parse tree
	 */
	void enterListParamsFunc(SwiftGrammarParser.ListParamsFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listParamsFunc}.
	 * @param ctx the parse tree
	 */
	void exitListParamsFunc(SwiftGrammarParser.ListParamsFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SwiftGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SwiftGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(SwiftGrammarParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(SwiftGrammarParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(SwiftGrammarParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(SwiftGrammarParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#declarationstmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationstmt(SwiftGrammarParser.DeclarationstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#declarationstmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationstmt(SwiftGrammarParser.DeclarationstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(SwiftGrammarParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(SwiftGrammarParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SwiftGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SwiftGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listParams}.
	 * @param ctx the parse tree
	 */
	void enterListParams(SwiftGrammarParser.ListParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listParams}.
	 * @param ctx the parse tree
	 */
	void exitListParams(SwiftGrammarParser.ListParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listArray}.
	 * @param ctx the parse tree
	 */
	void enterListArray(SwiftGrammarParser.ListArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listArray}.
	 * @param ctx the parse tree
	 */
	void exitListArray(SwiftGrammarParser.ListArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(SwiftGrammarParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(SwiftGrammarParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listParamsCall}.
	 * @param ctx the parse tree
	 */
	void enterListParamsCall(SwiftGrammarParser.ListParamsCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listParamsCall}.
	 * @param ctx the parse tree
	 */
	void exitListParamsCall(SwiftGrammarParser.ListParamsCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftGrammarParser#listStructExp}.
	 * @param ctx the parse tree
	 */
	void enterListStructExp(SwiftGrammarParser.ListStructExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftGrammarParser#listStructExp}.
	 * @param ctx the parse tree
	 */
	void exitListStructExp(SwiftGrammarParser.ListStructExpContext ctx);
}