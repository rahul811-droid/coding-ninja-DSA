package arrays;

import java.util.Scanner;

public class ArrangeNumberinArray {
	public static void increamentArray(int input[]) {
 input =new int[4];
	for(int i=0;i<input.length;i++) {
		input[i]++;
	}
	}
	
	public static int[]  takeInput() {
		Scanner s = new Scanner(System.in);
		int size =s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
			
		}
		return arr;
	}
	public static void print(int arr[]) {
		int size= arr.length;
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
			}
			System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		int n =s.nextInt();
//		int arr[]=new int[n];
			int arr[]= {2,3,4,5,6};
			increamentArray(arr);
			print(arr);
		
		}

		
	}


