package recursion;
import java.util.Scanner;
public class QuickSortInrecursion {
	public static void quickSort(int input[],int si,int ei) {
    if(si>=ei) {
    	return;
    }
    int pivotPos=partition(input,si,ei);
    quickSort(input,si,pivotPos-1);
    quickSort(input,pivotPos+1,ei);
}
	private static int partition(int[] input, int si, int ei) {
		// TODO Auto-generated method stub
		int pivot=input[si];
		int count=0;
		for(int i=si+1;i<=ei;i++) {
			if(input[i]<=pivot) {
				count++;
			}
		}
		int pivotPos=si+count;
		int temp=input[pivotPos];
		input[pivotPos]=input[si];
		input[si]=temp;
		int i=si;
		int j=ei;
		while(i<pivotPos && j>pivotPos) {
			if(input[i]<=pivot) {
				i++;
			}
			else if(input[j]>pivot){
				j--;
			
			}
			else {
				temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				i++;
				j++;
			}
		}
		
		
		return pivotPos;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[]= new int[size];
		
		quickSort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
