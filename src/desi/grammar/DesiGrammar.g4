grammar DesiGrammar;


program
	: 'shuru' block 'khatam'
	;

block 
	: declaration ';' command |
	command
	;

declaration : datatype identifier ';' |
			  datatype identifier '=' digit|
			;
			
command : 'test';

unit : identifier|
		 digit
		 ;
		 
digit : '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9'
		;

datatype : 'int' | 
		   'bool'
		   ;
		   
		   
identifier : 'a'|
			 'b'|
			 'c'
			 ;


WS      : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
Comment : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip;