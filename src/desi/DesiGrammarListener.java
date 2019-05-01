package desi;
// Generated from ./src/desi/grammar/DesiGrammar.g4 by ANTLR 4.7.1
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
	 * Enter a parse tree produced by the {@code assignmentInteger}
	 * labeled alternative in {@link DesiGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentInteger(DesiGrammarParser.AssignmentIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentInteger}
	 * labeled alternative in {@link DesiGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentInteger(DesiGrammarParser.AssignmentIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentBoolean}
	 * labeled alternative in {@link DesiGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentBoolean(DesiGrammarParser.AssignmentBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentBoolean}
	 * labeled alternative in {@link DesiGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentBoolean(DesiGrammarParser.AssignmentBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBooleanParentheses}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBooleanParentheses(DesiGrammarParser.ExpressionBooleanParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBooleanParentheses}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBooleanParentheses(DesiGrammarParser.ExpressionBooleanParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBoolean}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBoolean(DesiGrammarParser.ExpressionBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBoolean}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBoolean(DesiGrammarParser.ExpressionBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBooleanComparison}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBooleanComparison(DesiGrammarParser.ExpressionBooleanComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBooleanComparison}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBooleanComparison(DesiGrammarParser.ExpressionBooleanComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBooleanConnector}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBooleanConnector(DesiGrammarParser.ExpressionBooleanConnectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBooleanConnector}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBooleanConnector(DesiGrammarParser.ExpressionBooleanConnectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBooleanIdentifierOnly}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBooleanIdentifierOnly(DesiGrammarParser.ExpressionBooleanIdentifierOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBooleanIdentifierOnly}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBooleanIdentifierOnly(DesiGrammarParser.ExpressionBooleanIdentifierOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBooleanOnly}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBooleanOnly(DesiGrammarParser.ExpressionBooleanOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBooleanOnly}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBooleanOnly(DesiGrammarParser.ExpressionBooleanOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNumberComparison}
	 * labeled alternative in {@link DesiGrammarParser#comp_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNumberComparison(DesiGrammarParser.ExpressionNumberComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNumberComparison}
	 * labeled alternative in {@link DesiGrammarParser#comp_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNumberComparison(DesiGrammarParser.ExpressionNumberComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNumberParentheses}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNumberParentheses(DesiGrammarParser.ExpressionNumberParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNumberParentheses}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNumberParentheses(DesiGrammarParser.ExpressionNumberParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNumberPlusMinus}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNumberPlusMinus(DesiGrammarParser.ExpressionNumberPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNumberPlusMinus}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNumberPlusMinus(DesiGrammarParser.ExpressionNumberPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNumberMultiplyDivide}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNumberMultiplyDivide(DesiGrammarParser.ExpressionNumberMultiplyDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNumberMultiplyDivide}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNumberMultiplyDivide(DesiGrammarParser.ExpressionNumberMultiplyDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNumberIdentifierOnly}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNumberIdentifierOnly(DesiGrammarParser.ExpressionNumberIdentifierOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNumberIdentifierOnly}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNumberIdentifierOnly(DesiGrammarParser.ExpressionNumberIdentifierOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNumberOnly}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNumberOnly(DesiGrammarParser.ExpressionNumberOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNumberOnly}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNumberOnly(DesiGrammarParser.ExpressionNumberOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#cond_expressn}.
	 * @param ctx the parse tree
	 */
	void enterCond_expressn(DesiGrammarParser.Cond_expressnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#cond_expressn}.
	 * @param ctx the parse tree
	 */
	void exitCond_expressn(DesiGrammarParser.Cond_expressnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#ifExpressn}.
	 * @param ctx the parse tree
	 */
	void enterIfExpressn(DesiGrammarParser.IfExpressnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#ifExpressn}.
	 * @param ctx the parse tree
	 */
	void exitIfExpressn(DesiGrammarParser.IfExpressnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#elseIfExpressn}.
	 * @param ctx the parse tree
	 */
	void enterElseIfExpressn(DesiGrammarParser.ElseIfExpressnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#elseIfExpressn}.
	 * @param ctx the parse tree
	 */
	void exitElseIfExpressn(DesiGrammarParser.ElseIfExpressnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#elseExpressn}.
	 * @param ctx the parse tree
	 */
	void enterElseExpressn(DesiGrammarParser.ElseExpressnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#elseExpressn}.
	 * @param ctx the parse tree
	 */
	void exitElseExpressn(DesiGrammarParser.ElseExpressnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#whileExpressn}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpressn(DesiGrammarParser.WhileExpressnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#whileExpressn}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpressn(DesiGrammarParser.WhileExpressnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesiGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DesiGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesiGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DesiGrammarParser.PrintContext ctx);
}