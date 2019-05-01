package runtime;

import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class DesiRuntimeMain {
	public static void main(String[] args) throws IOException {
        if (args.length > 0) {
        	String path = args[0];
        	CharStream code = CharStreams.fromFileName(path);
	        PrintWriter writer = new PrintWriter(path.replace("vdesi", "output"), "UTF-8");
	        try {
	        	DesiRuntime runtime = new DesiRuntime(code.toString().replaceAll("\r", ""));
	            runtime.execute();
	            System.out.println("Output of the program \n"+runtime.getOutputData());
	            writer.println("Output of the program ");
	            writer.println(runtime.getOutputData());
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	        writer.close();
        }
	}
}
