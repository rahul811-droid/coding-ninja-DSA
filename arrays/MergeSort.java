package arrays;

public class MergeSort {
public static int[] MergeSort(int arr1[],int arr2[]) {
	int i=0;
	int j=0;
	int k=0;
	int ans[]= new int[arr1.length+arr2.length] ;
	while(i<arr1.length && j<arr2.length) {
		if(arr1[i]<arr2[j]) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		else {
			ans[k]=arr2[j];
			j++;
			k++;
		}
	}
	while(i<arr1.length) {
		ans[k]=arr1[i];
		i++;
		k++;
		
	}while(j<arr2.length) {
		ans[k]=arr1[j];
		j++;
		k++;
		
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {106,107,108,109,110};
		int arr2[]= {101,102,103,104,105};
		int ans[]=MergeSort(arr1, arr2);
		int i=0;
		while(i<ans.length){
			System.out.print(ans[i]+" ");
			i++;
		}

		}
	}


