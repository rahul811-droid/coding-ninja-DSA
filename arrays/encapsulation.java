package arrays;

public class encapsulation{
	    private String s ="Rahul";
	    public String getValue(){
	        return s;
	    }
	    public void setValue(String newValue){
	        s = newValue;
	    }
	    public static void main(String[] args){
	        encapsulation b = new encapsulation();
	        String currentValue = b.getValue();
	        System.out.println("currentValue" +" "+ currentValue);
	        b.setValue("Dev");
	        
	        
	        
	        
	        String updateValue = b.getValue();
	        System.out.println("updateValue" +" " + updateValue );
	    }
	}


