package compiler;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;


public class CompilerMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String inputFile = "inputTestFile1.desi";

        String inputPath = "./data/";

        String path = inputPath + inputFile;

        if (args.length > 0) {
            path = args[0];
        }

        CharStream code = CharStreams.fromFileName(path);
        
        System.out.println(code.toString());
        System.out.println(code.size());

	}

}
