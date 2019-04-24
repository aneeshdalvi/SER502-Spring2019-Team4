grammar DesiGrammar1;


program
	: 'shuru' block 'khatam'
	;

block
	:
	| command+ 
	;
	
command
	: (ifExpressn|whileExpressn|print|expression)
	;

expression
	: 'int' IDENTIFIER (EQUALSto num_expressn)?              # assignmentInteger
	| 'boolean' IDENTIFIER (EQUALSto bool_expressn)?         # assignmentBoolean
	| IDENTIFIER EQUALSto num_expressn                       # assignmentInteger
	| IDENTIFIER EQUALSto bool_expressn                      # assignmentBoolean
    ;

bool_expressn
    : bool_expressn op=(ISEquals|NotEquals) bool_expressn # expressionBoolean
    | bool_expressn op=(AND|OR) bool_expressn                # expressionBooleanConnector
    | comp_expressn                                            # expressionBooleanComparison
    | '(' bool_expressn ')'                                       # expressionBooleanParentheses
    ;
comp_expressn
    : num_expressn op=(GREATER|LESSER|MORE_or_EQU|LESS_or_EQU|ISEquals|NotEquals) num_expressn  # expressionNumberComparison
    ;

num_expressn
    : num_expressn op=(MUL|DIV) num_expressn              # expressionNumberMultiplyDivide
    | num_expressn op=(ADD|SUB) num_expressn                   # expressionNumberPlusMinus
    | '(' num_expressn ')'                                             # expressionNumberParentheses
    | SUB? DIGITS                                                         # expressionNumberOnly
    | SUB? IDENTIFIER                                                     # expressionNumberIdentifierOnly
    ;

cond_expressn
    : '(' bool_expressn ')'
    ;


ifExpressn
    : 'agar' cond_expressn 'shuru' block 'khatam' (elseIfExpressn)* (elseExpressn)? 'bas'
    ;

elseIfExpressn
    : 'magar' cond_expressn 'shuru' block 'khatam'
    ;

elseExpressn
    : 'nahitoh' 'shuru' block 'khatam'
    ;

whileExpressn
    : 'jabtak' cond_expressn 'shuru' block 'khatam' 'tabtak'
    ;


print
    : 'dikhao' '(' (DIGITS|BOOLEAN|IDENTIFIER|num_expressn|bool_expressn) ')'
    ;

// accepts numbers from 0-9 and more than that.
DIGITS
	: [1-9] [0-9]*
	| '0'
	;

// Takes Boolean value as True or false.
BOOLEAN
	: 'True'
	| 'False'
	;

ADD               : '+';
SUB              : '-';
MUL           : '*';
DIV             : '/';
AND                : '&&';
OR                 : '||';
LESSER          : '<';
GREATER       : '>';
LESS_or_EQU    : '<=';
MORE_or_EQU : '>=';
NotEquals          : '!=';
ISEquals        : '==';

// Accepts lower case and upper case letters.
IDENTIFIER
	: [a-zA-Z_] [a-zA-Z_0-9]*
	;

EQUALSto  : '=';

WS      : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
Comment : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip;
