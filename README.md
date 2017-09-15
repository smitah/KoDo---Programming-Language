# SER502--Spring2017-Team7
## KODO LANGUAGE
KODO a high level language which is compiled to a simple assembly level
interpreter language and then output is displayed .
● Design of the language is inspired from Visual Basic and Java.

Java 1.8 and ANTLR 4.7 are the tools used for compilation and execution of Kodo.
The compiler was built on MacOS and the runtime is built on Windows.

# Parse Tree Generation

The BaseListener is used for the translation to the intermediate code. The high level language with the help of grammar file is taken as input by ANTLR to generate the parse tree for Kodo.

# Intermediate Code Generation

The Compiler code takes the high level language which is the .kd file as input to generate the Intermediate code which is stored in a file with .kin extension.

# Display the Output

The Intermediate code is taken as input in the Java Runtime environment to display the final output. The symbol table and stack model are used for the intermediate code execution. A hashmap is used to maintain the symbol table while the stack datastructure executes the intermediate code. The intermediate code execution starts at Readfile.java class.


# EXECUTION

Download the repo,
set your JAVA environment variables and execute 
- $ JAVA -jar <PATH_TO_KODO_REPO>/kodo.jar <PATH_TO_KODO_REPO>/data/Pgm1.kd


kodo writes the intermediate code to the default 'Kodo_Program.kin' file in the root directory, much like the ./a.out in C. 
you can view the Kodo_Program.kin file after executing the java command above or, 

we have a command line flag '-i' to generate the intermediate code for the program as the program_name.kin 


- $cd SER502--Spring2017-Team7
- $touch ruth.kd

write the program to ruth.kd file and then, run the prgrom like this :
- $java -jar kodo.jar ruth.kd -i
- $cat ruth.kin

the ruth.kin file has the intermediate code generated. 



# YOUTUBE LINK
https://youtu.be/D9miYonLdIE
