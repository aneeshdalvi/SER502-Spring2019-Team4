package compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import desi.DemoBaseVisitor;
import desi.DemoParser.AdditionContext;
import desi.DesiGrammarParser.BlockContext;
import desi.DesiGrammarParser.ProgramContext;
import desi.DesiGrammarBaseVisitor;

public class DesiCompiler extends DesiGrammarBaseVisitor{

	
	@Override
		public Object visitProgram(ProgramContext ctx) {
		
			System.out.println("program");
			return visitChildren(ctx);
			
			
			/*System.out.println("Program Shuru");
			System.out.println(ctx.getChildCount());
			
			System.out.println(ctx.getChild(0));
			
			System.out.println(ctx.getChild(1).getChild(0).getChild(0).getChild(0));
			System.out.println(ctx.getChild(1).getChild(0).getChild(0).getChild(1));
			System.out.println(ctx.getChild(1).getChild(0).getChild(0).getChild(2));
			
			System.out.println(ctx.getChild(1).getChild(0).getChild(0).getChild(3));
			System.out.println(ctx.getChild(1).getChild(0).getChild(0).getChild(3).getChild(0));
			
			
			System.out.println(ctx.getChild(2));
			System.out.println("Program Khatam");*/
		}
	
		@Override
		public Object visitBlock(BlockContext ctx) {
			
			
			System.out.println("in block");
			System.out.println(ctx.getChildCount());
			System.out.println(ctx.getChild(0).getChild(0).getChild(0));
			System.out.println("out block");
			
			
			return super.visitBlock(ctx);
		}
	
	
	
	/*
@Override
public Object visitAddition(AdditionContext ctx) {
	System.out.println("in here");
	visitChildren(ctx);
	if(ctx.getChildCount() == 1)
	{
		System.out.println("in 1st if");
		System.out.println(ctx.getChild(0));
	}
	else
	{
		System.out.println(ctx.getChild(2));
		System.out.println("addition");
	}
	
	return null;
}	*/
	
	
}

