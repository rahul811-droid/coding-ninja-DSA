package recursion;

public class ReplaceChar {
	public static String replaceCharacter(String input, char c1, char c2) {
		String ans="";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==c1) {
				ans=ans+c2;
			
			}
			else {ans=ans+input.charAt(i);
			
			}

		}
		return ans;
		
	}
	public static void main(String[] args) {
		String input="xrahuhagaxhx";
		char c1='x';
		char c2='a';
		for(int i=0;i<input.length();i++) {
			System.out.println(replaceCharacter(input, c1, c2));
		}

	}

}
