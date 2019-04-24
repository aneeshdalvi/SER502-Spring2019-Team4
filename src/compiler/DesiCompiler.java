package compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import desi.DesiGrammarParser.AssignmentIntegerContext;
import desi.DesiGrammarParser.BlockContext;
import desi.DesiGrammarParser.CommandContext;
import desi.DesiGrammarParser.ExpressionNumberOnlyContext;
import desi.DesiGrammarParser.ProgramContext;
import desi.DesiGrammarBaseVisitor;

public class DesiCompiler extends DesiGrammarBaseVisitor{

	
	@Override
	public Object visitProgram(ProgramContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Object visitBlock(BlockContext ctx) {

		return visitChildren(ctx);
	}

	@Override
	public Object visitCommand(CommandContext ctx) {
		//System.out.println("command");
		return visitChildren(ctx);
	}

	
	@Override
	public Object visitAssignmentInteger(AssignmentIntegerContext ctx) {
		
		if(ctx.getChildCount()==4)
		{
			visitChildren(ctx);
			System.out.println("LOAD "  + ctx.getChild(1) + " ACC");
		}
		else if(ctx.getChildCount()==3)
		{
			System.out.println("in 3");
			
			visitChildren(ctx);
			System.out.println("LOAD A ACC");
			
			System.out.println("temp " + ctx.getChild(0));
			System.out.println("temp " + ctx.getChild(1));
			System.out.println("temp " + ctx.getChild(2));
		}
		return null;
		
		
	}
	
	@Override
	public Object visitExpressionNumberOnly(ExpressionNumberOnlyContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("child count" + ctx.getChildCount() );
		System.out.println("LOAD ACC " + ctx.getChild(0));
		return super.visitExpressionNumberOnly(ctx);
	}
}

