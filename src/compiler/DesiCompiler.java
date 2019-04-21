package compiler;

import org.antlr.v4.runtime.tree.ParseTree;

import desi.DesiGrammarBaseVisitor;
import desi.DesiGrammarParser.ProgramContext;

public class DesiCompiler extends DesiGrammarBaseVisitor{

	@Override
	public Object visitProgram(ProgramContext ctx) {
		return visitChildren(ctx); 
	}
	
}
