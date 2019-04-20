package desi;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DesiGrammarParser}.
 */
public interface DesiGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DesiGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DesiGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DesiGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DesiGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DesiGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DesiGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(DesiGrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(DesiGrammarParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DesiGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DesiGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(DesiGrammarParser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(DesiGrammarParser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DesiGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DesiGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(DesiGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(DesiGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(DesiGrammarParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(DesiGrammarParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(DesiGrammarParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(DesiGrammarParser.BooleanexpContext ctx);
}