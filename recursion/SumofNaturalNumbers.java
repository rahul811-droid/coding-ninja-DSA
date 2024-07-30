package recursion;

public class SumofNaturalNumbers {
public static int sum(int n) {
	if(n==1) {
		return 1;
	}
	
	
	return n+sum(n-1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		System.out.println(sum(n));
	}

}
