package functon;

public class PrintTwoToNPrime {
	public static boolean isPrime(int n) {
		int d =2;
		while(d<n) {
			if(n%d==0) {
				return false;
			}
			d++;
		}
		return true;
	}
public static void PrintPrime(int n) {
	for(int i=2;i<=n;i++) {
		boolean isIPrime =isPrime(i);
		if(isIPrime) {
			System.out.println(i);
		}
	}


}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPrime(200);
	}

}
