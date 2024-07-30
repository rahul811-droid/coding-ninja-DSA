package jan26;
import java.util.Scanner;
public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int rem= (n%2);
if(rem==0) {
	System.out.println("Even");
	return;
}System.out.println("ODD");

	}

}
