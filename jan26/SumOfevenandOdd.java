package jan26;
import java.util.Scanner;
public class SumOfevenandOdd {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
			int evenSum=0;
			int oddSum=0;	
		    while(n>0){
			int lastdigit = n/10;
			
			if(lastdigit%2==0) {
				evenSum=lastdigit+evenSum;
			
			}else {
				oddSum=lastdigit+oddSum;
				
			}
		}System.out.println(evenSum+" "+oddSum);
		
	}

}
