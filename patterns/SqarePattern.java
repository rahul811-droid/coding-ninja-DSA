package patterns;

import java.util.Scanner;
public class SqarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s = new Scanner(System.in);
 int n = s.nextInt();
 int i=1;
 while(i<=n) {
	 int j=1;
	 while(j<=n-i) {
	 System.out.print(i);
	 j++;
 }
 System.out.println();
 i++;

 }
 
	}
}


