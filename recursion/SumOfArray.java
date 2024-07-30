package recursion;

public class SumOfArray {
public static int sumOfArray(int arr[]) {
	 if(arr.length==1) {
		 return arr[0];
	 }
	 int smallOutput[]= new int[arr.length-1];
	 for(int i=0;i<arr.length-1;i++) {
		 smallOutput[i]= arr[i];
	 }
	 int output=arr[arr.length-1]+sumOfArray(smallOutput);
	 return output;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.println(sumOfArray(arr));

	}

}
