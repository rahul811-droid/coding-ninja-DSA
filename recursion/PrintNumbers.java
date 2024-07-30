package recursion;

public class PrintNumbers {
public static void printNumbers(int n) {
	if(n==0) {
		return ;
	}
	
	System.out.print(n);
	printNumbers(n-1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		printNumbers(n);
	}

}
