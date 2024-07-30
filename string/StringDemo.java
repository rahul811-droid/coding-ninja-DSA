package string;
import java.util.Scanner;

public class StringDemo {
	
	public static void print( String str,char ch ) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		String str = s.nextLine();
		print(str,ch);
//		System.out.println(ch);
		

		

		

		
				

	}

}
