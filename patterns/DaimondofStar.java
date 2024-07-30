package patterns;
import java.util.Scanner;
public class DaimondofStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int n1= (n/2)+1;
	        int i = 1;
	        while (i <= n) {
	            int space = 1;
	            while (space <= n - i) {
	                System.out.print(" ");
	                space++;

	            }
	            int j = 1;
	            while (j <= i) {
	                System.out.print("*");
	                j++;
	            }
	            int p = i - 1;
	            j = 1;
	            while (j <= i - 1) {
	                System.out.print('*');
	                p--;
	                j++;
	            }

	            System.out.println();
	            i++;
	        }
	       
	        i=n-n1;
			while(i>=0) {
				
				int spaces=1;
				while(spaces<=n1-i) {
					System.out.print(' ');
					spaces++;
				}
				int star=1;
				while(star<=(2*i)-1) {
					System.out.print('*');
					star++;
				}	
	            System.out.println();
	            i--;
			}

	    }

	}
