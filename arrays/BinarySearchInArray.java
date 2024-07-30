package arrays;
import java.util.Scanner;
public class BinarySearchInArray {

public static int BinarySeacrch(int arr[],int ele) {
	int start =0;
	int end=arr.length-1;
	while(start<end) {
		
	int mid =(start+end)/2;
	
	if(ele>arr[mid]) {
	start=mid+1;
	
	}else if(ele<arr[mid]) {
		end=mid-1;
	}else  {
		return mid;
	}
	
	}return -1;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int store=   BinarySeacrch(arr,9) ; 
		System.out.println(store);
		
			
	}

}
