# SER502-Spring2019-Team4

## DESI LANGUAGE

We are proud to create and name this new programming language by incorporating the keywords of Hindi language to add essence of our culture in it.  

## Tools used - 
    - Eclipse
    - Antlr
    - Git

## System which are used to build compiler and runtime -
    - Linux 
    - Windows 
    - MacOS

## Directions/instructions to install our language

  Follow the below steps to install this git project:
    
    1. Clone this git project or
    2. Download this git project and Unzip the project in a new folder.
    3. Open the project in Eclipse using following steps:
        Files >> Open Project From File System. Browser your project folder here upto extracted project directory.

## How to build jars of our programming language

  Compiler and Runtime library of our new programming language can be build using jar files.
  Follow below steps to generate two seperate jar files:
  
    1. Right click on the project folder at the top.
    2. Click on Export -> Under the Java Option, select Runnable JAR File option. -> Click Next.
    3. Select the destination directory in which you want to export the jar.
         Note that there are 2 JAR's being created. 
            One for compilation which gives the intermediate code from source code and 
            One for runtime which evaluates this intermediate code to get the final output.
    4. Under Library handling chose "package required libraries into generated Jar" 
    5. Under the option Launch Configuration, select the respective files for the respective JAR's:
        - for desiCompiler.jar select CompilerMain.java
        - for desiRuntime.jar select DesiRuntimeMain.java
    6. Click on Finish 
    Note : Jar will be generated under selected destination folder mentioned in step 3
    For MacOs, this jar will not have default run permission. Follow below steps to make it executable
        1. Navigate to folder in which jars are generated
        2. run below unix command 
            chmod 755 desiCompiler.jar
            chmod 755 desiRuntime.jar   
        
## How to run any program using this custom language

  1. Run via Eclipse:
  
    a. To enter a custom code, navigate to the package 'data' and change or create the file of type inputTestFile1.desi
        Paste your code in this file that you want to run for the language. 
        You can also select sample codes available in the same package.
        # Note : File extension should be desi for your source code
    b. Under the src -> compiler package, right click on CompilerMain.java and click Run.
    c. The intermediate code of the program can be obtained by navigating to the file "inputTestFile1.vdesi" in 'data' package.
    d. Now, under the src -> runtime package, right click on DesiRuntimeMain.java and click Run. 
    The output of the program can be obtained by navigating to the file "inputTestFile1.output" in 'data' package.
    
  2. Run via JAR:
  
    a. In the terminal, navigate to the directory where the desiCompiler.jar is present.
    b. Create a file inputTestFile1.desi and paste the code that needs to be run. 
        Note that the file should be in the same directory as the desiCompiler jar.
    c. Run the command: "java -jar desiCompiler.jar inputTestFile1.desi" from terminal.
    d. The intermediate code of the program can be obtained by navigating to the file "inputTestFile1.vdesi" in same directory.
    e. Now run the command "java -jar desiRuntime.jar inputTestFile1.vdesi".
    f. The output of the program can be obtained by navigating to the file "inputTestFile1.output" in same directory.
  
  
## Terminal Commands to run the compiler:
  
     Run the command to generate compiler jar: 
        java -jar desiCompiler.jar inputTestFile1.desi
     
     Run the command to generate runtime jar:
        java -jar desiRuntime.jar inputTestFile1.vdesi
     
 
## Link to Youtube Video

    
