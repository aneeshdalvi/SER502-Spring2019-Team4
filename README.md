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
    
