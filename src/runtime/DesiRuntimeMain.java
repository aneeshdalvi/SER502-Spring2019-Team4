package runtime;

import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
/**
 * This class is main class for the runtime module.
 * 
 * @author Viraj Talaty
 * @since April-10-2019
 * @version 1.0
 */
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
