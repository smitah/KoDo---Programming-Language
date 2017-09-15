/** This is a grammar file for Kodo language 
@author : Team 7 SER 502 class */


grammar KodoGrammar;

entryPoint : program EOF;

//parser rules

program: statement*;

statement :   assignment
			| variableDeclare
			| display
			| whileblockstatement
			| ifblockstatement
			;

assignment : Variable Assign expr ; 

display :    Display expr;

variableDeclare : 	  Number  Variable 					   #numvariable
			        | Binary Variable 					   #binvariable 
			        | String Variable					   #strvariable
                    ;
                    
whileblockstatement : While expr  program End;

ifblockstatement : 	ifstatement (elseifstatement)* elsestatement End;
elseifstatement : 	Elseif expr program;
elsestatement : 	Else program;
ifstatement : 		If expr program ;

expr : 	      expr Multiplication expr  		 	#mulexpr
			| expr Division expr			 		#divexpr
			| expr Modulus expr 					#modexpr
			| expr Addition expr 					#addexpr
			| expr Substraction expr 				#subexpr
			| expr GreaterThan expr 				#gtexpr
			| expr LessThan expr 					#ltexpr
			| expr LTEqual expr 					#lteexpr
			| expr GTEqual expr 					#gteexpr
			| expr Equal expr 						#eqexpr
			| expr NEqual expr 						#neqexpr 
			| Not expr 						        #notexpr
			| expr And expr 						#andexpr
			| expr Or expr 							#orpexpr 
			| binary								#binaryexpr
			| integer								#intexpr
			| string								#strexpr
			| Variable								#varexpr
			;
			
binary  : True | False;
integer : Integer;
string  : Word;

//Lexer rules

While : 			'While';
If : 				'If';
Else : 				'Else';
Elseif : 			'ElseIf';
End : 				'End';
Display : 			'Display';
Number : 			'Number';
Binary : 			'Binary';
String : 			'String';
Equal : 			'==';
Assign : 			'=';
Addition : 			'+';
Substraction : 		'-';
Multiplication : 	'*';
Division :			'/';
Modulus :			'%';
GreaterThan : 		'>';
LessThan : 			'<';
GTEqual : 			'>=';
LTEqual : 			'<=';
NEqual : 			'!=';
Not : 				'!' ;
And : 				'&';
Or : 				'|';
True:				'true'|'True';
False :			    'false'|'False';

Variable : [A-Za-z][a-zA-Z0-9_]*;

Word : ["] (~["\r\n] | '\\\\' | '\\"')* ["];

Comment: ('%%' ~[\r\n]* | '%//' .*? '%//') -> skip;

Whitespace: [ \t\n\r] -> skip;

Integer: [0-9] Digit* | '0';

fragment Digit : [0-9];

