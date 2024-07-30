package jan26;
import java.util.Scanner;
public class SumofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s = new Scanner(System.in)	;
	int n= s.nextInt();
	int sum =0;
	int i=1;
	while(i<=n) {
	
		sum=sum+i;
		i++;
		
	}
	System.out.println(sum);
	

	}

}
