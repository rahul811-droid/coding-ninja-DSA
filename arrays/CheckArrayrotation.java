package arrays;

public class CheckArrayrotation {
public static int arrayRotation(int arr[]){
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>arr[i+1]) {
				
				return i+1;
			}
			
		}
		return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {5,6,1,2,3,4};
		System.out.println(arrayRotation(arr));
	}

}
