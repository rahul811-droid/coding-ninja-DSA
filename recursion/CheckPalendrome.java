package recursion;

public class CheckPalendrome {

public class solution {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
  return (isStringPalindrome(input,0,input.length()-1));    
        
	}
    
      public static boolean isStringPalindrome(String input, int si, int ei)
    {
        if (si>=ei)
        {
            return true;
        }
        boolean check=true;
        if (input.charAt(si)==input.charAt(ei))
        {
            check=isStringPalindrome(input,si+1,ei-1);
        }
        else
        {
            check=false;
        }
        return check;
    }
}

	public static void main(String[] args) {
		String str[] = {"abccba"};
		
//		(isStringPalindrome(str);


	}

}
