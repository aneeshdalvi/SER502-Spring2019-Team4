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

        if (args.length > 0) {
            String path = args[0];
            
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
    	        PrintWriter writer = new PrintWriter(path.replace("desi", "vdesi"), "UTF-8");
    			for(int i=0; i<intermediateCode.size();i++)
    			{
    				writer.println(intermediateCode.get(i));
    			}
    			writer.close();
    		}

        }
	}
}