package recursion;

public class MultiplicationRecursively {
public static int multiplyTwoIntegers(int m, int n) {
	if(n==0) {
		return 0;
	}
	int ans =multiplyTwoIntegers(m,n-1);
	return m+ans;
}
	public static void main(String[] args) {
		
		int m=9;
		int n=5;
		System.out.println(multiplyTwoIntegers(m, n));

	}

}
