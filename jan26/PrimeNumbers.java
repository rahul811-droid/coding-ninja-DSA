package jan26;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner s = new Scanner9S
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int d=2;
	while(d<=n-1) {
		if(n%2==0) {
			System.out.println(n +" " +"Not prime");
			
			
			
		}
		d++;
		
		
	}
	System.out.println(n+"Not prime");
	
	
}

}
