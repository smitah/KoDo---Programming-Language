package Runtime;

import java.util.HashMap;
import java.util.Stack;


public class Compute {

	static HashMap<String, Datawrapper> variableDetail = new HashMap<String, Datawrapper>();
	public static Stack<String> temp = new Stack<String>();
	public static String indicator = "";
	
	public static void display(String [] tokens){
		
		if(tokens[1].equalsIgnoreCase("\"") && tokens[tokens.length-1].equalsIgnoreCase("\"") 
				&& tokens.length > 3){
			String str = "" + tokens[2];
			for(int j = 3; j < tokens.length-1; j++ ){
				str = str + " " + tokens[j];
			}
			System.out.println(str);
		}
		else{
			Datawrapper obj = variableDetail.get(tokens[1]);
			System.out.println(obj.getValue());
		}
	}
	
	public static void symbolTable(String [] tokens){
		if(tokens[0].equals("ASN")){
			Datawrapper object = new Datawrapper(tokens[2], tokens[1]);
			variableDetail.put(tokens[1], object);
		}
	}

	public static void calculate(String [] tokens){
		switch(tokens[0]){
			case "ADD" : 
				int valAdd = Integer.parseInt(variableDetail.get(tokens[1]).getValue()) +
							 Integer.parseInt(variableDetail.get(tokens[2]).getValue());
				String resultAdd = Integer.toString(valAdd);
				updateVariableDetail(resultAdd, tokens[1]);
				break;
			case "SUB" : 		
				int valSub = Integer.parseInt(variableDetail.get(tokens[1]).getValue()) -
				 		     Integer.parseInt(variableDetail.get(tokens[2]).getValue());
				String resultSub = Integer.toString(valSub);
				updateVariableDetail(resultSub, tokens[1]);
				break;
			case "MUL" : 		
				int valMul = Integer.parseInt(variableDetail.get(tokens[1]).getValue()) *
				 		     Integer.parseInt(variableDetail.get(tokens[2]).getValue());
				String resultMul = Integer.toString(valMul);
				updateVariableDetail(resultMul, tokens[1]);
				break;
			case "DIV" : 		
				int valDiv = Integer.parseInt(variableDetail.get(tokens[1]).getValue()) /
	 		     		 	 Integer.parseInt(variableDetail.get(tokens[2]).getValue());
				String resultDiv = Integer.toString(valDiv);
				updateVariableDetail(resultDiv, tokens[1]);
				break;
			case "MOD" : 		
				int valMod = Integer.parseInt(variableDetail.get(tokens[1]).getValue()) %
	 		     			 Integer.parseInt(variableDetail.get(tokens[2]).getValue());
				String resultMod = Integer.toString(valMod);
				updateVariableDetail(resultMod, tokens[1]);
				break;
			case "GT" : 		
				if(Integer.parseInt(variableDetail.get(tokens[1]).getValue()) >
		     		Integer.parseInt(variableDetail.get(tokens[2]).getValue())){
					String resultGT = "true";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else{
					String resultGT = "false";
					updateVariableDetail(resultGT, tokens[1]);
				}
				break;
			case "GTE" : 		
				if(Integer.parseInt(variableDetail.get(tokens[1]).getValue()) >=
		     		Integer.parseInt(variableDetail.get(tokens[2]).getValue())){
					String resultGT = "true";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else{
					String resultGT = "false";
					updateVariableDetail(resultGT, tokens[1]);
				}
				break;
			case "LT" : 		
				if(Integer.parseInt(variableDetail.get(tokens[1]).getValue()) <
		     		Integer.parseInt(variableDetail.get(tokens[2]).getValue())){
					String resultGT = "true";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else{
					String resultGT = "false";
					updateVariableDetail(resultGT, tokens[1]);
				}
				break;
			case "LTE" : 		
				if(Integer.parseInt(variableDetail.get(tokens[1]).getValue()) <=
		     		Integer.parseInt(variableDetail.get(tokens[2]).getValue())){
					String resultGT = "true";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else{
					String resultGT = "false";
					updateVariableDetail(resultGT, tokens[1]);
				}
				break;
			case "NEQ" : 		
				if(Integer.parseInt(variableDetail.get(tokens[1]).getValue()) !=
		     		Integer.parseInt(variableDetail.get(tokens[2]).getValue())){
					String resultGT = "true";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else{
					String resultGT = "false";
					updateVariableDetail(resultGT, tokens[1]);
				}
				break;
			case "EQ" : 		
				if(Integer.parseInt(variableDetail.get(tokens[1]).getValue()) ==
	     		Integer.parseInt(variableDetail.get(tokens[2]).getValue())){
				String resultGT = "true";
				updateVariableDetail(resultGT, tokens[1]);
				}
				else{
					String resultGT = "false";
					updateVariableDetail(resultGT, tokens[1]);
				}
				break;
		}
	}
	
	public static void LogicalOperation(String [] tokens){
		switch(tokens[0]){
			case "AND" :
				if(variableDetail.get(tokens[1]).getValue().equalsIgnoreCase("true") && variableDetail.get(tokens[2]).getValue().equalsIgnoreCase("true")){
					String resultGT = "true";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else if(variableDetail.get(tokens[1]).getValue().equalsIgnoreCase("true") && variableDetail.get(tokens[2]).getValue().equalsIgnoreCase("false")){
					String resultGT = "false";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else if(variableDetail.get(tokens[1]).getValue().equalsIgnoreCase("false") && variableDetail.get(tokens[2]).getValue().equalsIgnoreCase("true")){
					String resultGT = "false";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else{
					String resultGT = "false";
					updateVariableDetail(resultGT, tokens[1]);					
				}
				break;
			case "OR" :
				if(variableDetail.get(tokens[1]).getValue().equalsIgnoreCase("true") && variableDetail.get(tokens[2]).getValue().equalsIgnoreCase("true")){
					String resultGT = "true";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else if(variableDetail.get(tokens[1]).getValue().equalsIgnoreCase("true") && variableDetail.get(tokens[2]).getValue().equalsIgnoreCase("false")){
					String resultGT = "true";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else if(variableDetail.get(tokens[1]).getValue().equalsIgnoreCase("false") && variableDetail.get(tokens[2]).getValue().equalsIgnoreCase("true")){
					String resultGT = "true";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else{
					String resultGT = "false";
					updateVariableDetail(resultGT, tokens[1]);					
				}
				break;
			case "NOT" :
				if(variableDetail.get(tokens[1]).getValue().equalsIgnoreCase("true")){
					String resultGT = "false";
					updateVariableDetail(resultGT, tokens[1]);
				}
				else{
					String resultGT = "true";
					updateVariableDetail(resultGT, tokens[1]);
				}
				break;
		}
	}
	public static void updateVariableDetail(String newValue, String key){
		Datawrapper obj = variableDetail.get(key);
		obj.setValue(newValue);
		
	}
	
	public static void systemStack(String [] tokens){
		if(tokens[0].equals("WH")){
			if(variableDetail.get(tokens[1]).getValue().equalsIgnoreCase("true")){
				indicator = "trueWhile";
			}
			else{
				
				indicator = "falseWhile";
			}
		}
		else if(tokens[0].equals("If")){
			if(variableDetail.get(tokens[1]).getValue().equals("true")){
				indicator = "trueIf";
			}
			else{
				indicator = "trueElse";
			}
		}
	}
	
	public static void endIfhandle(){			
		while(!Readfile.storage.empty()){
			if(!Readfile.storage.peek().contains("If")){
				Readfile.storage.pop();
			}
			else{
				Readfile.storage.pop();
				break;
			}
			 
		}
		
			indicator = "";
		
	}
	
	public static void endElsehandle(){
		 // end else also contains else
		while(!Readfile.storage.empty()){
			if(!Readfile.storage.peek().contains("Else")){
				Readfile.storage.pop();
			}
			else{
				Readfile.storage.pop();
				break;
			}
			 
		}
		
			indicator = "";
		
	}
	
	public static void endLoophandle(){
		 // end else also contains else
		while(!Readfile.storage.empty()){
			if(!Readfile.storage.peek().contains("WH")){
				Readfile.storage.pop();
			}
			else{
				Readfile.storage.pop();
				break;
			}
			 
		}
		
			indicator = "";
		
	}
	
	public static void gotoHandling(String [] tokens){
		 // end else also contains else			
		while(!Readfile.storage.empty()){
			//System.out.println(indicator);
			if(!Readfile.storage.peek().contains("LABEL")){
				temp.push(Readfile.storage.peek());
				Readfile.storage.pop();
			}
			else{
				while(!temp.empty()){
					if(indicator.equals("trueWhile")){
						String [] line = temp.peek().split(" ");
						Readfile.storage.push(temp.peek());
						temp.pop();
						Parser.processtokens(line);
					}
					else{
						break;
					}
				}
				
				Readfile.storage.pop();
				break;
			}
			}
			
	}
	

}