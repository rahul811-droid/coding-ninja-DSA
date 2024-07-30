package recursion;

public class ReturnKeypadCode {
	 public static String[] returnkeypad(int n)
	    {  
	    if(n==0) {
	    	String ans[] = {" "};
	    	return ans;
	    }
	    int lastdigit=n%10;
	    int smallNumber=n/10;
	    String smallAns[]=returnkeypad(smallNumber);
	    char option[] = keypadoptions(lastdigit);
	    String finalAns[] = new String[smallAns.length*option.length];
	    int k=0;
	    for(int i=0;i<smallAns.length;i++) {
	    	for(int j=0;j<option.length;j++) {
	    		finalAns[k]=smallAns[i]+option[j];
	    		k++;
	    }
	     }
	        return finalAns;
	        }
private static char[] keypadoptions(int n){
	switch(n) {
	case(2):
		char option2[] = {'a','b','c'};
		return option2;
	
	case(3):
		char option3[] = {'d','e','f'};
		return option3 ;
	case(4):
		char option4[] = {'g','h','i'};
		return option4;
	
	case(5):
		char option5[] = {'j','k','l'};
		return option5;
	
	case(6):
		char option6[] = {'m','n','o'};
		return option6;
	
	case(7):
		char option7[] = {'p','q','r'};
		return option7;
	
	case(8):{
		char option8[] = {'s','t','u'};
		return option8;
	}
	case(9):
		char option9[] = {'v','w','x','y','z'};
		return option9;
	
	default:
			char options[]= {'\0'};
			return options;
	   
	}
	
    
}
	public static void main(String[] args) {
		int n=234;
		String ans[]=returnkeypad(n);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}

}
