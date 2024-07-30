package arrays;

public class SelectionSort {
public static void selectionSort(int arr[]) {
	
	
	for(int i=0;i<arr.length-1;i++) {
			
		
		for(int j=i+1;j<arr.length;j++) {
		
			int min =arr[i];
			int minIndex=i;
			if(arr[j]<min) {
			min=arr[j];
			minIndex=j;
			
		} int temp =arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex]=temp;
		
			}
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,7,8,9,0,5,6};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
