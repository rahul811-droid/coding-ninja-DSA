package recursion;

public class RemoveDuplicates {
public static String removeDuplicates(String s) {
	if(s.length()<=1) {
		return s;
	}
	if(s.charAt(0)==s.charAt(1)) {
		return removeDuplicates(s.substring(1));
	}
	else {
		String smallAns=removeDuplicates(s.substring(1));
		return s.charAt(0)+smallAns;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="aaaaabbbbbaaabkjjjjkkjhu";
		System.out.println(removeDuplicates(s));

	}

}
