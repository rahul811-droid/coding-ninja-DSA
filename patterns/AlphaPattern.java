package patterns;
import java.util.Scanner;
public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		
		while(i<=n) {
//			char startingChar = (char) ('A' + i - 1);
			int j=n;
			while(j<=i) {
				System.out.print(n-1);
				j--;
//				startingChar++;
			}
			System.out.println();
			i++;
		}
		
	}
}


