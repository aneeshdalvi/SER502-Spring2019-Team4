package desi;


// Generated from ./src/desi/grammar/DesiGrammar.g4 by ANTLR 4.7.1
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
	 * Visit a parse tree produced by {@link DesiGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DesiGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(DesiGrammarParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DesiGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(DesiGrammarParser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(DesiGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DesiGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(DesiGrammarParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesiGrammarParser#booleanexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanexp(DesiGrammarParser.BooleanexpContext ctx);
}