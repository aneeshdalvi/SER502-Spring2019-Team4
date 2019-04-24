package compiler;

import desi.DesiGrammarParser.AssignmentIntegerContext;
import desi.DesiGrammarParser.BlockContext;
import desi.DesiGrammarParser.CommandContext;
import desi.DesiGrammarParser.ExpressionNumberIdentifierOnlyContext;
import desi.DesiGrammarParser.ExpressionNumberOnlyContext;
import desi.DesiGrammarParser.ExpressionNumberPlusMinusContext;
import desi.DesiGrammarParser.ProgramContext;
import desi.DesiGrammarBaseVisitor;
import desi.DesiGrammarParser;

public class DesiCompiler extends DesiGrammarBaseVisitor{

	private class IntermediateCodeGenerator {
        private String IntermediateOutput = "";
        private void addIntermediateOutput(String output) {
            this.IntermediateOutput += output + "\n";
        }
    }
	
	private IntermediateCodeGenerator intermediateCodeGenerator = new IntermediateCodeGenerator();
	
	public String getOutput() {
		return intermediateCodeGenerator.IntermediateOutput;
	}
	
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
		return visitChildren(ctx);
	}

	
	@Override
	public Object visitAssignmentInteger(AssignmentIntegerContext ctx) {
		
		String indentifier = ctx.IDENTIFIER().getText();
		if(ctx.EQUALSto()!= null)
		{
			//if initialization and assignment done in the same statement
			visit(ctx.num_expressn());
			intermediateCodeGenerator.addIntermediateOutput("LOAD " + indentifier + " ACC");
		}
		else {
			//if no assignment to the variable is done. Default value is can be 0
			intermediateCodeGenerator.addIntermediateOutput("LOAD " + indentifier + " NULL");
		}
		return null;
	}
	
	@Override
	public Object visitExpressionNumberPlusMinus(ExpressionNumberPlusMinusContext ctx) {
		
		visit(ctx.num_expressn(1));
		intermediateCodeGenerator.addIntermediateOutput("LOAD A ACC");
		visit(ctx.num_expressn(0));
		intermediateCodeGenerator.addIntermediateOutput("LOAD B ACC");
		
		switch(ctx.op.getType()) {
			case DesiGrammarParser.ADD:
				intermediateCodeGenerator.addIntermediateOutput("ADD ACC A B");
				break;
			case DesiGrammarParser.SUB:
				intermediateCodeGenerator.addIntermediateOutput("SUB ACC C B");
				break;
		}
		return null; 
	}
	
	@Override
	public Object visitExpressionNumberIdentifierOnly(ExpressionNumberIdentifierOnlyContext ctx) {
		String identifier = ctx.IDENTIFIER().getText();
		intermediateCodeGenerator.addIntermediateOutput("LOAD ACC " + identifier);
		if(ctx.SUB() != null)
		{
			intermediateCodeGenerator.addIntermediateOutput("UNARY ACC");
		}
		return null;
	}
	
	@Override
	public Object visitExpressionNumberOnly(ExpressionNumberOnlyContext ctx) {
		String value = ctx.DIGITS().getText();
		Double doubleValue = Double.parseDouble(value);
		if(ctx.SUB() != null) {
			doubleValue = -doubleValue;
		}
		intermediateCodeGenerator.addIntermediateOutput("LOAD ACC "+ doubleValue);
		return null; 
	}
}

