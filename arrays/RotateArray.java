package arrays;

public class RotateArray {
public static void rotateArray(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
