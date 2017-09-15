package Compiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KodoGrammarParser}.
 */
public interface KodoGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#entryPoint}.
	 * @param ctx the parse tree
	 */
	void enterEntryPoint(KodoGrammarParser.EntryPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#entryPoint}.
	 * @param ctx the parse tree
	 */
	void exitEntryPoint(KodoGrammarParser.EntryPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(KodoGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(KodoGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KodoGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KodoGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(KodoGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(KodoGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(KodoGrammarParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(KodoGrammarParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numvariable}
	 * labeled alternative in {@link KodoGrammarParser#variableDeclare}.
	 * @param ctx the parse tree
	 */
	void enterNumvariable(KodoGrammarParser.NumvariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numvariable}
	 * labeled alternative in {@link KodoGrammarParser#variableDeclare}.
	 * @param ctx the parse tree
	 */
	void exitNumvariable(KodoGrammarParser.NumvariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binvariable}
	 * labeled alternative in {@link KodoGrammarParser#variableDeclare}.
	 * @param ctx the parse tree
	 */
	void enterBinvariable(KodoGrammarParser.BinvariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binvariable}
	 * labeled alternative in {@link KodoGrammarParser#variableDeclare}.
	 * @param ctx the parse tree
	 */
	void exitBinvariable(KodoGrammarParser.BinvariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strvariable}
	 * labeled alternative in {@link KodoGrammarParser#variableDeclare}.
	 * @param ctx the parse tree
	 */
	void enterStrvariable(KodoGrammarParser.StrvariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strvariable}
	 * labeled alternative in {@link KodoGrammarParser#variableDeclare}.
	 * @param ctx the parse tree
	 */
	void exitStrvariable(KodoGrammarParser.StrvariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#whileblockstatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileblockstatement(KodoGrammarParser.WhileblockstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#whileblockstatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileblockstatement(KodoGrammarParser.WhileblockstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#ifblockstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfblockstatement(KodoGrammarParser.IfblockstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#ifblockstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfblockstatement(KodoGrammarParser.IfblockstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#elseifstatement}.
	 * @param ctx the parse tree
	 */
	void enterElseifstatement(KodoGrammarParser.ElseifstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#elseifstatement}.
	 * @param ctx the parse tree
	 */
	void exitElseifstatement(KodoGrammarParser.ElseifstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void enterElsestatement(KodoGrammarParser.ElsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void exitElsestatement(KodoGrammarParser.ElsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(KodoGrammarParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(KodoGrammarParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLtexpr(KodoGrammarParser.LtexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLtexpr(KodoGrammarParser.LtexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lteexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLteexpr(KodoGrammarParser.LteexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lteexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLteexpr(KodoGrammarParser.LteexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqexpr(KodoGrammarParser.EqexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqexpr(KodoGrammarParser.EqexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neqexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeqexpr(KodoGrammarParser.NeqexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neqexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeqexpr(KodoGrammarParser.NeqexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotexpr(KodoGrammarParser.NotexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotexpr(KodoGrammarParser.NotexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarexpr(KodoGrammarParser.VarexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarexpr(KodoGrammarParser.VarexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(KodoGrammarParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(KodoGrammarParser.AddexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivexpr(KodoGrammarParser.DivexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivexpr(KodoGrammarParser.DivexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr(KodoGrammarParser.AndexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr(KodoGrammarParser.AndexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntexpr(KodoGrammarParser.IntexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntexpr(KodoGrammarParser.IntexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStrexpr(KodoGrammarParser.StrexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStrexpr(KodoGrammarParser.StrexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orpexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrpexpr(KodoGrammarParser.OrpexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orpexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrpexpr(KodoGrammarParser.OrpexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModexpr(KodoGrammarParser.ModexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModexpr(KodoGrammarParser.ModexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulexpr(KodoGrammarParser.MulexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulexpr(KodoGrammarParser.MulexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGtexpr(KodoGrammarParser.GtexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGtexpr(KodoGrammarParser.GtexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryexpr(KodoGrammarParser.BinaryexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryexpr(KodoGrammarParser.BinaryexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubexpr(KodoGrammarParser.SubexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubexpr(KodoGrammarParser.SubexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gteexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGteexpr(KodoGrammarParser.GteexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gteexpr}
	 * labeled alternative in {@link KodoGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGteexpr(KodoGrammarParser.GteexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(KodoGrammarParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(KodoGrammarParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(KodoGrammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(KodoGrammarParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KodoGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(KodoGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link KodoGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(KodoGrammarParser.StringContext ctx);
}