package arrays;

public class Sort0and1 {
public static void sort0and1(int arr[]) {
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==0) {
		temp++;	
		}
	}
	for(int j=0;j<temp;j++) {
		arr[j]=0;
	}
	for(int i=temp;i<arr.length;i++) {
		arr[i]=1;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,1,1,0,0,1,0};
		sort0and1(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
