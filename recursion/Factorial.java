package recursion;

public class Factorial {
public static int fact(int n) {
	if(n==0) {
		return 1;
	}
	int smallAns = fact(n-1);
	return n*smallAns;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		int ans=fact(n);
		System.out.println(ans);
		
				
	}

}
