package patterns;
import java.util.Scanner;
public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int n = s.nextInt();
int i=1;
while(i<=n) {
	int j=1;
	char startingChar = (char)('A'+i-1);
	while(j<=n) {

		System.out.print(startingChar);
		startingChar++;
		j++;
	}
	System.out.println();
	i++;
}


		
	}

}
