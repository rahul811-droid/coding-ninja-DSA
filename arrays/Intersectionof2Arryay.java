package arrays;

public class Intersectionof2Arryay {
public static void intersectionTwoarray(int arr1[],int arr2[]) {
	int n1=arr1.length;
	int n2=arr2.length;


	for(int i=0;i<n1;i++) {
		for(int j=0;j<n2;j++) {
			if(arr1[i]==arr2[j]) {
//		
				System.out.println(arr1[i]+" ");
				arr2[j]=Integer.MIN_VALUE;
				break;
			}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,3,45,6,7};
		int arr2[]= {9,98,78,2};
		intersectionTwoarray(arr1, arr2);
//		System.out.println();
		

		
		
	}

}
