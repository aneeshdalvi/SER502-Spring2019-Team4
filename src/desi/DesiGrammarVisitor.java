package desi;

/**
 * This class is Generated from ./src/desi/grammar/DesiGrammar.g4 by ANTLR 4.7.1
 * @author Viraj Talaty, Aneesh Dalvi
 * @since April-10-2019
 * @version 1.0
 */
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DesiGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DesiGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DesiGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DesiGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(DesiGrammarParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentInteger}
	 * labeled alternative in {@link DesiGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentInteger(DesiGrammarParser.AssignmentIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentBoolean}
	 * labeled alternative in {@link DesiGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentBoolean(DesiGrammarParser.AssignmentBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionBooleanParentheses}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBooleanParentheses(DesiGrammarParser.ExpressionBooleanParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionBoolean}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBoolean(DesiGrammarParser.ExpressionBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionBooleanComparison}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBooleanComparison(DesiGrammarParser.ExpressionBooleanComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionBooleanConnector}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBooleanConnector(DesiGrammarParser.ExpressionBooleanConnectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionBooleanOnly}
	 * labeled alternative in {@link DesiGrammarParser#bool_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBooleanOnly(DesiGrammarParser.ExpressionBooleanOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNumberComparison}
	 * labeled alternative in {@link DesiGrammarParser#comp_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNumberComparison(DesiGrammarParser.ExpressionNumberComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNumberParentheses}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNumberParentheses(DesiGrammarParser.ExpressionNumberParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNumberPlusMinus}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNumberPlusMinus(DesiGrammarParser.ExpressionNumberPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNumberMultiplyDivide}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNumberMultiplyDivide(DesiGrammarParser.ExpressionNumberMultiplyDivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNumberIdentifierOnly}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNumberIdentifierOnly(DesiGrammarParser.ExpressionNumberIdentifierOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNumberOnly}
	 * labeled alternative in {@link DesiGrammarParser#num_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNumberOnly(DesiGrammarParser.ExpressionNumberOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#cond_expressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expressn(DesiGrammarParser.Cond_expressnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#ifExpressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpressn(DesiGrammarParser.IfExpressnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#elseIfExpressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfExpressn(DesiGrammarParser.ElseIfExpressnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#elseExpressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseExpressn(DesiGrammarParser.ElseExpressnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#whileExpressn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpressn(DesiGrammarParser.WhileExpressnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DesiGrammarParser.PrintContext ctx);
}