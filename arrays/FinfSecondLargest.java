package arrays;

public class FinfSecondLargest {
public static int  secondLargest(int arr[]) {
		
	int largest = arr[0];
	int secondLargest = Integer.MIN_VALUE;
	for(int i=1;i<arr.length;i++) {
		if(largest<arr[i]) {
			secondLargest=largest;
			largest=arr[i];
		}
		else if (secondLargest<arr[i] && arr[i]!=largest){
			secondLargest=arr[i];
		}
	}
	return secondLargest;
	
}
	public static void main(String[] args) {
				int arr[]= {3,5,6,7,80,89,5,6,7};
				
				System.out.println(secondLargest(arr));
		

	}

}
