package compiler;

import java.io.IOException;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import desi.DesiGrammarLexer;
import desi.DesiGrammarParser;

public class CompilerMain {

	public static void main(String[] args) throws IOException {

		int lastOccurance = 0;
		
		String file = args[0];
		//String file = "data\\test.desi";
		
		lastOccurance = file.lastIndexOf('\\');
		String inputPath = file.substring(0,lastOccurance+1);
		String fileName = file.substring(lastOccurance+1);
		
		String inputFileName = fileName.split("\\.")[0];
		String inputFileExtension = "." + fileName.split("\\.")[1];
		
		//Output file config
		String outputPath = inputPath;
		String outputFileExtension = ".vdesi";

		String path = inputPath + inputFileName+inputFileExtension;
		
		if (args.length > 0) {
            path = args[0];
        }

		CharStream code = CharStreams.fromFileName(path);
		
		DesiGrammarLexer lexer = new DesiGrammarLexer(code);
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