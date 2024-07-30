package recursion;

public class findSubsequencesString {
	public static void printSubsequences(String input, String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
//		we choose not to include the  character
		
		printSubsequences(input.substring(1),output);
//		we choose  to include the  character

		printSubsequences(input.substring(1),output+input.charAt(0));

	}
public static void printSubsequences(String input) {
	printSubsequences(input," ");
}
	public static void main(String[] args) {
		String str ="xy" ;
		printSubsequences(str);

	}

}
