package recursion;

public class PowerofNumbers {
public static int pow(int x ,int n) {
	if(n==0) {
		return 1;
	}
	return x*pow(x,(n-1));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=4;
		int n=4;
		System.out.println(pow(x, n));
	}

}
