package Runtime;

public class Datawrapper {
	private String dataType;
	private String value;
	
	public Datawrapper(String value, String var){
		try{
				int a = Integer.parseInt(value);
				this.value = value;
				this.dataType = "Number";
				
		}
		catch(NumberFormatException e){
			if((value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) 
					&& var.charAt(0) != '_'){
				this.dataType = "Binary";
				this.value = value;
			}
			else{
				this.dataType = "String";
				this.value = Compute.variableDetail.get(value).getValue();
			}
			
		}
	}
	
	public String getDataType(){
		return dataType;
	}
	
	public String getValue(){
		return value;
	}
	
	public void setValue(String value){
		this.value = value;
	}
	
	public void setDatatype(String dataType){
		this.dataType = dataType;
	}

}