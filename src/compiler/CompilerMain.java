package compiler;
import java.io.IOException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.Trees;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;

import desi.DesiGrammarLexer;
import desi.DesiGrammarParser;


public class CompilerMain {

	public static void main(String[] args) throws IOException {

		//Output file config
		String outputPath = "./src/data/";
		String outputFileExtension = ".vdesi";

		//Input file config
		String inputPath = "data/";
		String inputFileName = "test";
		String inputFileExtension = ".desi";
		
		ANTLRInputStream input = new ANTLRFileStream(inputPath + inputFileName + inputFileExtension);
		
		
		DesiGrammarLexer lexer = new DesiGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DesiGrammarParser parser = new DesiGrammarParser(tokens);
		ParseTree tree  = parser.program();
		
		DesiCompiler d = new DesiCompiler();
		d.visit(tree);
		List<String> intermediateCode = Arrays.asList(d.getOutput().split("\\n"));
		if(intermediateCode.size()>1)
		{
			PrintWriter writer = new PrintWriter(outputPath + inputFileName + outputFileExtension, "UTF-8");
			for(int i=0; i<intermediateCode.size();i++)
			{
				writer.println(intermediateCode.get(i));
			}
			writer.close();
		}
		
	}
}
