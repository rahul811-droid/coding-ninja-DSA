package twoDarrays;
import java.util.Scanner;


public class ArrayUse {
public static int[][] takeInput( ) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no of rows");
	int rows = s.nextInt();
	System.out.println("Enter no of coloumn");
	int cols = s.nextInt();
	int input[][]=new int[rows][cols];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.println("Enter elemen at"+i+"rows"+j+"cols");
			input[i][j]=s.nextInt();
		}
	}
	return input;
}
public static void print(int [][]input) {
	int rows=input.length;
	int cols=input[0].length;
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(input[i][j]);
		}
	System.out.println();
	
	
}
	
}
public static int largestcoloumnSum(int input[][]) {
	int largest =Integer.MIN_VALUE;
	
}
	public static void main(String[] args) {
		
	int input[][]=takeInput();
	
//	int arr2[][]= {{1,2,3,4,5},{6,7,8,9,10}};
	print(input);
	
	}
}


