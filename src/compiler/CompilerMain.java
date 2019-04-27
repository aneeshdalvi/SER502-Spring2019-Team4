package compiler;
import java.io.IOException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;

import desi.DesiGrammarLexer;
import desi.DesiGrammarParser;


public class CompilerMain {

	public static void main(String[] args) throws IOException {
		
		ANTLRInputStream input = new ANTLRFileStream("data/test.desi");
		
		DesiGrammarLexer lexer = new DesiGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DesiGrammarParser parser = new DesiGrammarParser(tokens);
		
		ParseTree tree  = parser.program();
		DesiCompiler d = new DesiCompiler();
		d.visit(tree);
		Trees.inspect(tree, parser);
		System.out.println(d.getOutput());
	}
}
