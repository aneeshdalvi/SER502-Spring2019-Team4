package compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import desi.DesiGrammarParser.AssignmentIntegerContext;
import desi.DesiGrammarParser.BlockContext;
import desi.DesiGrammarParser.CommandContext;
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

			return visitChildren(ctx);
		}
	
		@Override
		public Object visitCommand(CommandContext ctx) {
			// TODO Auto-generated method stub
			
//			System.out.println(ctx.getChildCount());
//			System.out.println(ctx.getChild(0).getChild(0));
			System.out.println("out command");
			
			return visitChildren(ctx);
		}
	
		
		@Override
		public Object visitAssignmentInteger(AssignmentIntegerContext ctx) {
			// TODO Auto-generated method stub
			System.out.println("in assign");
			System.out.println(ctx.getChildCount());
			System.out.println(ctx.getChild(0));
			System.out.println(ctx.getChild(1));
			System.out.println(ctx.getChild(2));
			System.out.println(ctx.getChild(3));
			System.out.println("out assign");
			return super.visitAssignmentInteger(ctx);
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

