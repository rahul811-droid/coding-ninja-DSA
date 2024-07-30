package recursion;

import java.util.Scanner;

public class CheckNumberinArray {
public static boolean checkNumber (int arr[],int x) {
   return checkNumber(arr, x,0);
}
public static boolean checkNumber (int arr[],int x,int si) {
		if(si==arr.length) {
			return false;
		}
		if(arr[si]==x) {
			return true;
		}
		boolean b = checkNumber(arr, x,si+1);
		return b;
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,6,7,9,12};
		int x=6;
		for(int i=0;i<arr.length;i++) {
			System.out.println(checkNumber(arr, 6));
		}
	
		
         		
	}

}
