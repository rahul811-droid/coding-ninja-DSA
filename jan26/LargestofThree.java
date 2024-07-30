package jan26;
import java.util.Scanner;
public class LargestofThree {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt(); 
		int c=s.nextInt();
		if(a>= b && a>=c) {
			System.out.println("A :"+" " +a);
			
		}
		else if(b>=c && b>=a) {
			System.out.println("B :"+" "+b);
		}
		else {
		System.out.println("C :"+" "+c);
		}
		

		}
}
