package recursion;

import java.util.Scanner;

public class LastIndexOfNumber {
 public static int lastNumber(int input[],int x,int si) {
	 if(si==input.length) {
		 return -1;
	 }
	 int smallAns=lastNumber(input,x,si+1);
	 if(smallAns!=-1) {
		 return smallAns;
	 }
	 if(input[si]==x) {
		 return si;
	 }
	 else {
		 return -1;
	 }
	 
 }
 public static int lastNumber(int input[],int x) {
	 return lastNumber(input,x,0);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x =s.nextInt();
		int size = s.nextInt();
		int input[]=new int[size];
		for(int i=0;i<input.length;i++) {
			input[i]=s.nextInt();
			
	}
		System.out.println(lastNumber(input, x));
	}

}
