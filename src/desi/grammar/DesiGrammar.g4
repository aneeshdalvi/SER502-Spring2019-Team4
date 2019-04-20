grammar DesiGrammar;


program
	: SHURU block KHATAM
	;

block 
	: declaration KHATAMOFSTATEMENT command |
	command
	;

declaration : DATATYPE IDENTIFIER KHATAMOFSTATEMENT |
			  DATATYPE IDENTIFIER ASSIGNMENT DIGIT|
			  DATATYPE IDENTIFIER ASSIGNMENT booleanexp|
			  DATATYPE IDENTIFIER KHATAMOFSTATEMENT declaration |
			  DATATYPE IDENTIFIER ASSIGNMENT DIGIT KHATAMOFSTATEMENT declaration |
			  DATATYPE IDENTIFIER ASSIGNMENT booleanexp KHATAMOFSTATEMENT declaration
			;
			
			
command : expression KHATAMOFSTATEMENT |
		  SHURU block KHATAM |
		  WHILE  booleanexp SHURU block KHATAM KHATAMWHILE |
		  IF booleanexp SHURU block KHATAM ELSE SHURU block KHATAM KHATAMIF |
		  IF booleanexp SHURU block KHATAM KHATAMIF |
		  expression GREATERTHAN expression |
		  expression LESSTHAN expression |
		  expression EQUALS expression
		  ;

expression : IDENTIFIER ASSIGNMENT expression | expression1;
expression1 : term ADD expression |
			  term SUB expression |
			  term
			  ;
term : factor MUL term |
	   factor DIV term |
	   factor 
	   ;
factor : OPENPARA expression CLOSEPARA |
		unit
		;


unit : IDENTIFIER|
		 DIGIT
		 ;
		 
DATATYPE : 'int' | 
		   'bool'
		   ;
		 
// accepts numbers from 0-9 and more than that.	 
DIGIT 
	: [1-9] [0-9]* |
	'0'
	;
	
// Takes Boolean value as True or false.
booleanexp
	: 'TRUE'
	| 'FALSE'
	| expression ASSIGNMENT expression
	| NOTEQUALTO booleanexp
	;
		   
// Accepts lower case and upper case letters.   
IDENTIFIER 
		: [a-zA-Z_] [a-zA-Z_0-9]*
		;

SHURU : 'shuru';
KHATAM : 'khatam';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
ASSIGNMENT : '=';
EQUALS : '==';
GREATERTHAN : '>';
LESSTHAN : '<' ;
NOTEQUALTO : '!';
KHATAMOFSTATEMENT : ';';
WHILE : 'jabtak';
KHATAMWHILE : 'tabtak';
IF : 'agar';
ELSE : 'nahitoh';
KHATAMIF : 'bas';
OPENPARA : '(';
CLOSEPARA : ')';

WS      : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
Comment : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip;