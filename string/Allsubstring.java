package string;

public class Allsubstring {
public static void printSubstring(String str) {
//	for(int start=0;start<str.length();start++) {
//		for(int end=start;end<str.length();end++) {
//			System.out.println(str.substring(start,end));
//		}
//
//	}
	for(int len =1;len<str.length();len++) {
		for(int start=0;start<str.length()-len;start++) {
				
			int end =start+len;
			System.out.println(str.substring(start,end));
			
		}	
	}
}
	public static void main(String[] args) {

		String str ="Rahul";
		printSubstring(str);
	}

}
