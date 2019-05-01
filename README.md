# SER502-Spring2019-Team4

## DESI LANGUAGE

We are proud to create and name this new programming language by incorporating the keywords of Hindi language to incorporate our culture with it.  

### Tools used - 
    Eclipse, 
    Antlr, 
    Git.

## System which are used to build compiler and runtime -
    Linux, 
    Windows, 
    MacOS

## How to Install:

  Follow the below steps to install this git project:
    
    1. Clone this git project or
    2. Download this git project and Unzip the project in a new folder.
    3. Open the project in Eclipse using following steps:
        Files >> Open Project From File System. Browser your project folder here upto extracted project directory.

## Building the language:

  Compiler and Runtime library of our new programming language can be build using jar files.
  Follow below steps to generate two seperate jar files:
  
    1. Right click on the project folderat the top.
    2. Under the Java Option, select Runnable JAR File option. Click Next.
    3. Select the destination directory in which you want to export the jar.
         Note that there are 2 JAR's being created. 
            One for compilation which gives the intermediate code from source code and 
            One for runtime which evaluates this intermediate code to get the final output.
    4. Under the option Launch Configuration, select the respective files for the respective JAR's:
        - for desiCompiler.jar select CompilerMain.java
        - for desiRuntime.jar select DesiRuntimeMain.java
        
  ## How to run any program using this custom language

  1. Run via Eclipse:
  
    a. To enter a custom code, navigate to the package 'data' and change or create the file of type inputTestFile1.desi
        Paste your code in this file that you want to run for the language. 
        You can also select sample codes available in the same package.
        Note : File extension should be desi for your source code
    b. Under the default package, right click on CompilerMain.java and click Run.
    c. The intermediate code of the program can be obtained by navigating to the file "inputFile.intermediate" in 'data' package.
    d. Now, under the runtime package, right click on RunTimeMain.java and click Run. The output of the program can be obtained by navigating to the file "inputFile.output" in 'data' package.
    
  2. Run via JAR:
  
    a. In the terminal, navigate to the directory where the race.jar is available.
    b. Create a file inputFile.race and paste the code that needs to be run. Note that the file should be in the same directory where the race.jar is present.
    c. Run the command: "java -jar raceCompiler.jar inputFile.race".
    d. The intermediate code of the program can be obtained by navigating to the file "inputFile.intermediate" in same directory.
    e. Now run the command "java -jar raceRunTime.jar inputFile.intermediate".
    f. The output of the program can be obtained by navigating to the file "inputFile.output" in same directory.
  
  
Terminal Commands to run the compiler:
  
     Run the command: 
     java -jar desiCompiler.jar inputTestFile1.desi
     java -jar desiRuntime.jar inputTestFile1.vdesi
     
 
Link to Youtube Video

    
