package recursion;

import java.util.Scanner;

public class AllIndicesOfNumber {
public static int[] allIndicesNumber(int input[],int x, int si) {
	if(si==input.length){
		int output[]= new int[0];
		return output;
	}
	int smallAns[]=allIndicesNumber(input,x,si+1);
	if(input[si]==x){
		int output[]=new int[smallAns.length+1];
		output[0]=si;
		for(int i=0;i<smallAns.length;i++){
			output[i+1]=smallAns[i];
		}
		return output;
	}
	else{
		return smallAns;
	}

	

}


public static int[] allIndicesNumber(int input[],int x) {
	return allIndicesNumber(input,x,0);
}
	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		int size = s.nextInt();
//		int x =s.nextInt();
//		int input[]=new int[size];
		int []input = {1,2,3,2,2,2};
		int x=2;
		int output[]=allIndicesNumber(input, x );

		
		for(int i=0;i<output.length;i++) {
			
			System.out.print(output[i]+" ");
			
	}
	}
}
