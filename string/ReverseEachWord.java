package string;

public class ReverseEachWord {
public static String reverseEachword(String str) {
	String ans ="";
	int currentwordStart =0;
	int i =0;
	for(;i<str.length();i++){
		if(str.charAt(i)==' '){
			int currentwordend=i-1;
			String reversedword ="";
			for(int j=currentwordStart;j<=currentwordend;j++){
				reversedword=str.charAt(j)+reversedword;
			}
				ans+=reversedword+"";
		currentwordStart=i+1;
		}
	}
	
	int currentwordend=i-1;
			String reversedword ="";
			for(int j=currentwordStart;j<=currentwordend;j++){
				reversedword=str.charAt(j)+reversedword;
			}
				ans+=reversedword;
		return ans;
}
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		
		String str ="rahul kumar parida";
//		String result="";
//		for(int i=str.length()-1;i>=0;i--) {
//			result+=str.charAt(i);
//		}
//		System.out.println(result);
	String reversed=reverseEachword(str);
	System.out.println(reversed);
		
		

	}

}
