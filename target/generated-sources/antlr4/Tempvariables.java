public class Tempvariables {
	static int count = 0;
	public static String getvariable()
	{    
		count++;
		String s = "Temp" + count;
		return s;
	}
	
	public static String getLastTemp(){
		return "Temp" + count;
	}

}