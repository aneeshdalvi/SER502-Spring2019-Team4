package runtime;

import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class DesiRuntimeMain {
	
	public static void main(String[] args) throws IOException {
		
		
		 String inputFile = "DesiArithmeticExpr.vdesi";

	        String inputPath = "./src/data/";

	        String path = inputPath + inputFile;
	        System.out.println(path);

	        if (args.length > 0) {
	            path = args[0];
	        }

	        CharStream code = CharStreams.fromFileName(path);

	        PrintWriter writer = new PrintWriter(path.replace("vdesi", "output"), "UTF-8");

	        try {

	            DesiRuntime runtime = new DesiRuntime(code.toString());
	            runtime.execute();
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
		
	}

}
