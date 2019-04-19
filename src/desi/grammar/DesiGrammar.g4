grammar DesiGrammar;


program
	: 'shuru' block 'khatam'
	;

block 
	: declaration ';' command |
	command
	;

declaration : datatype IDENTIFIER ';' |
			  datatype IDENTIFIER '=' DIGIT|
			  datatype IDENTIFIER '=' BOOLEAN|
			  datatype IDENTIFIER ';' declaration |
			  datatype IDENTIFIER '=' DIGIT ';' declaration |
			  datatype IDENTIFIER '=' BOOLEAN ';' declaration
			;
			
command : 'test';

unit : IDENTIFIER|
		 DIGIT
		 ;
		 
datatype : 'int' | 
		   'bool'
		   ;
		 
// accepts numbers from 0-9 and more than that.	 
DIGIT 
	: [1-9] [0-9]* |
	'0'
	;
	
// Takes Boolean value as True or false.
BOOLEAN
	: 'TRUE'
	| 'FALSE'
	;
		   
// Accepts lower case and upper case letters.   
IDENTIFIER 
		: [a-zA-Z_] [a-zA-Z_0-9]*
		;


WS      : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
Comment : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip;