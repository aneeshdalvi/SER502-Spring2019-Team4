package compiler;
import java.io.IOException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;

import desi.DemoLexer;
import desi.DemoParser;
import desi.DesiGrammarLexer;
import desi.DesiGrammarParser;



public class CompilerMain {

	public static void main(String[] args) throws IOException {
		
		ANTLRInputStream input = new ANTLRFileStream("data/inputTestFile1.desi");
		
		DesiGrammarLexer lexer = new DesiGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DesiGrammarParser parser = new DesiGrammarParser(tokens);
		
		ParseTree tree  = parser.program();
		new DesiCompiler().visit(tree);	
		
		
		
		/*DemoLexer lexer = new DemoLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DemoParser parser = new DemoParser(tokens);
		
		ParseTree tree  = parser.addition();
		new DesiCompiler().visit(tree);	*/
		

	}

}
