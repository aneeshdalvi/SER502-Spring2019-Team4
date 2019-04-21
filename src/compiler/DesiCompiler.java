package compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import desi.DesiGrammarBaseVisitor;
import desi.DesiGrammarParser.DeclarationContext;
import desi.DesiGrammarParser.FactorContext;
import desi.DesiGrammarParser.ProgramContext;
import desi.DesiGrammarParser.TermContext;

public class DesiCompiler extends DesiGrammarBaseVisitor{

	@Override
	public Object visitProgram(ProgramContext ctx) {
		return visitChildren(ctx); 
	}
	
	
	
	@Override
	public Object visitDeclaration(DeclarationContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDeclaration(ctx);
	}
	
	
	@Override
	public Object visitTerm(TermContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTerm(ctx);
	}
	
	
	@Override
	public Object visitFactor(FactorContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFactor(ctx);
	}
	
	
}
