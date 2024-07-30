package for_loop;
import java.util.Scanner;
public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int a=0;
//	int b =1;
//	for(int i=1;i<=n;i++)
//	{
//		int c=a+b;
//		a=b;
//		b=c;
//		
//		
//		
//	}
//	System.out.println(a);
				
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(n-i);
				j++;
				if(j>i) {
					break;
				}
			}
			System.out.println();
			i++;
			
		}
	}

}
