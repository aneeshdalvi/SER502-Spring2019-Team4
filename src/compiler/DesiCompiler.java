package compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import desi.DesiGrammarBaseVisitor;

import desi.DesiGrammarParser;
import desi.DesiGrammarParser.BooleanexpContext;
import desi.DesiGrammarParser.CommandContext;
import desi.DesiGrammarParser.DeclarationContext;
import desi.DesiGrammarParser.FactorContext;
import desi.DesiGrammarParser.ProgramContext;
import desi.DesiGrammarParser.TermContext;
import desi.DesiGrammarParser.UnitContext;

public class DesiCompiler extends DesiGrammarBaseVisitor{

	

	private class IntermediateCode {
        private String IntermediateOutput = "";
        private void addIntermediateOutput(String output) {
            this.IntermediateOutput += output + "\n";
        }
    }
	
	private IntermediateCode intermediateCodeGenerator = new IntermediateCode();
	
	public String getOutput() {
		return intermediateCodeGenerator.IntermediateOutput;
	}
	
	
	
	
	
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
	public Object visitDeclaration(DeclarationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDeclaration(ctx);
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
	
	public Object visitTerm(TermContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTerm(ctx);
	}
	
	
	@Override
	public Object visitFactor(FactorContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFactor(ctx);
	}
	

	@Override
	public Object visitCommand(CommandContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCommand(ctx);
	}
	
	@Override
	public Object visitUnit(UnitContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUnit(ctx);
	}
	
	@Override
	public Object visitBooleanexp(BooleanexpContext ctx) {
		// TODO Auto-generated method stub
		return super.visitBooleanexp(ctx);
	}
	
}
