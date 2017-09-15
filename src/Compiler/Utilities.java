package Compiler;
import java.util.Stack;

public class Utilities {
	static int tempCounter = 1;
	static Stack<String> tempStack = new Stack<String>(); 
	
	public String getNewTemp() {
		String newValue = "Temp" + tempCounter++;
		tempStack.push(newValue);
		return newValue;
	}
	
	public String getTemp() {
		return tempStack.pop();
	}
	
	public void removeTemp(String str) {
		Stack<String> intermediate = new Stack<String>(); 
		while(tempStack != null) {
			String value = tempStack.pop();
			if(!value.equals(str)) 
				intermediate.push(value);
			else
				break;
				
		}
		
		while(intermediate.size() != 0) 
			tempStack.push(intermediate.pop());
		
		if(tempStack.size() == 0) 
			tempCounter = 1;
		
	}
}