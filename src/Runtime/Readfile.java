package Runtime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Readfile {
	public static Stack<String> storage = new Stack<String>();
	public static boolean checker = true;
	public static void runtime(String str) {
		BufferedReader br = null;
		
		int count = 1;
		int whileCount = 1;
		try{
			br = new BufferedReader(new FileReader(str));
			String line ;
			while((line = br.readLine()) != null){
				if(Compute.indicator.equals("") && (!(line.contains("If") || line.contains("Else") ||
						line.contains("WH")))){
					String tokenArray [] = line.split(" ");
					storage.push(line);
					Parser.processtokens(tokenArray);
				}
				else{
					//System.out.println(Compute.indicator);
					if(Compute.indicator.equals("trueIf")){
						String tokenArray [] = line.split(" ");
						storage.push(line);
						Parser.processtokens(tokenArray);
					}
					else if(Compute.indicator.equals("trueElse")){
						if(!line.contains("Else")){
							if(line.contains("If"))
								count++;
							continue;
						}
						else{
							count--;
							if(count != 0)
								continue;
							storage.pop();
							String tokenArray [] = line.split(" ");
							storage.push(line);
							Compute.indicator = "";
							Parser.processtokens(tokenArray);
						}
					}
					else if(Compute.indicator.equals("trueWhile")){
						String tokenArray[] = line.split(" ");
						storage.push(line);
						Parser.processtokens(tokenArray);
					}
					else if(Compute.indicator.equals("falseWhile")){
						if(!line.contains("ENDwh")){
							continue;
						}
						else{
						storage.pop();
						String tokenArray[] = line.split(" ");
						Parser.processtokens(tokenArray);
						Compute.indicator = "";
					}
				}
					else if(Compute.indicator.equals("") && line.contains("Else")){
						if(!line.contains("ENDels")){
							Compute.indicator = "endelse";
							continue;
						}
						else{
							storage.pop();
							Compute.indicator = "";
						}
					}
					else if(Compute.indicator.equals("") || line.contains("If")){
						String tokenArray [] = line.split(" ");
						storage.push(line);
						Parser.processtokens(tokenArray);
					}
					
			}
		}
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try{
				if(br != null)
					br.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		

	}

}
