package compiler;

import org.antlr.v4.runtime.tree.ParseTree;

import desi.DesiGrammarBaseVisitor;
import desi.DesiGrammarParser;
import desi.DesiGrammarParser.ProgramContext;

public class DesiCompiler extends DesiGrammarBaseVisitor{

	@Override
	public Object visitProgram(ProgramContext ctx) {
		return visitChildren(ctx); 
	}
	
	@Override
	public Object visitBlock(DesiGrammarParser.BlockContext ctx)
	{
		return null;
	}
	
	
	@Override
	public Object visitExpression(DesiGrammarParser.ExpressionContext ctx)
	{
		return null;
	}
	
	@Override
	public Object visitExpression1(DesiGrammarParser.Expression1Context ctx)
	{
		return null;
	}
	
}
