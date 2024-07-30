package recursion;
import java.util.Scanner;
public class FirstIndexOfNumber {
public static int firstIndex(int input[],int x,int si) {
	if(si==input.length) {
		return -1;
	}
	if(input[si]==x) {
		return si;
	}
	return firstIndex(input,x,si+1);
}
public static int firstIndex(int input[],int x) {
	return firstIndex(input,x,0);
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
//		int input[] = {1,2,3,4,5};
//		int x=3;
		System.out.println(firstIndex(input, x));


	}

}
