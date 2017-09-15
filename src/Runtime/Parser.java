package Runtime;

public class Parser {

	public static void processtokens(String [] tokens) {
		switch(tokens[0]){
		case "ADD" : 		
			Compute.calculate(tokens);
			break;
		case "SUB" : 		
			Compute.calculate(tokens);
			break;
		case "MUL" : 		
			Compute.calculate(tokens);
			break;
		case "DIV" : 		
			Compute.calculate(tokens);
			break;
		case "MOD" : 		
			Compute.calculate(tokens);
			break;
		case "GT" : 		
			Compute.calculate(tokens);
			break;
		case "GTE" : 		
			Compute.calculate(tokens);
			break;
		case "LT" : 		
			Compute.calculate(tokens);
			break;
		case "LTE" : 		
			Compute.calculate(tokens);
			break;
		case "NEQ" : 		
			Compute.calculate(tokens);
			break;
		case "EQ" : 		
			Compute.calculate(tokens);
			break;
		case "AND" : 	
			Compute.LogicalOperation(tokens);
			break;
		case "OR" : 	
			Compute.LogicalOperation(tokens);
			break;
		case "NOT" : 	
			Compute.LogicalOperation(tokens);
			break;
		case "DIS" : 		
			Compute.display(tokens);
			break;
		/*case "DEC" :
			Compute.symbolTable(tokens);
			break;
			*/
		case "ASN" :
			Compute.symbolTable(tokens);
			break;
		case "If" :
			Compute.systemStack(tokens);
			break;
		
		case "ENDif" : 	
			Readfile.storage.pop();
			Compute.endIfhandle();					   		
			break;
		case "ENDelse" : 
			Readfile.storage.pop();
			Compute.endElsehandle();
			break;
		case "WH" : // while loop
			Compute.systemStack(tokens);
			break;
		case "Endwh" :
			Readfile.storage.pop();
			Compute.endLoophandle();
			break;
		case "GOTO:" : 
			Compute.gotoHandling(tokens);
			break;
		
		default : break;
		}

	}

}