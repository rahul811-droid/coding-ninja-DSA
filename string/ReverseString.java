package string;

public class ReverseString {
	public static String reverseString(String str) {
		
		String reversdstring =" ";
//		for(int i=str.length()-1;i>=0;i--) {
//			reversdstring=reversdstring+str.charAt(i);
//		}
		for(int i=0;i<str.length();i++) {
			reversdstring=str.charAt(i)+reversdstring;
		}
		return reversdstring;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abcdefgh";
		String reverse=reverseString(str);
		System.out.print(reverse);
		String str1 =str;
		System.out.print(str1);
		
	}

}
