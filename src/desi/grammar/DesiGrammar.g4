grammar DesiGrammar;


program
	: 'shuru' block 'khatam'
	;

block 
	: declaration ';' command |
	command
	;

declaration : 'test';
command : 'test';

WS      : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
Comment : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip;