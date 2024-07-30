package recursion;

public class CheckArraySorted{
public static boolean ckeckSorted(int arr[]) {
	if(arr.length<=1) {
		return true;
		}
		int smallInput[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallInput[i-1]=arr[i];
		}
      boolean smallAns=ckeckSorted(smallInput);
      if(!smallAns) {
    	  return false;
      }
      if(arr[0]<arr[1]) {
    	  return true;
      }else {
    	  return false;
      }
      
	}
public static boolean ckeckSorted_2(int arr[]) {
	if(arr.length<=1) {
		return true;
		}
	if(arr[0]>arr[1]) {
		return false;
	}
		int smallInput[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			smallInput[i-1]=arr[i];
		}
      boolean smallAns=ckeckSorted(smallInput);
      return smallAns;
}
public static boolean ckeckSortedBetter(int arr[],int SI) {
		if(SI==arr.length-1) {
			return true;
		}
		if(arr[SI]>arr[SI+1]) {
		return false;
		}
		boolean smallAns=ckeckSortedBetter(arr,SI+1);
		return smallAns;
}
public static boolean ckeckSortedBetter(int arr[]) {
	return ckeckSortedBetter(arr,0);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,2,3,1};
		
		
		System.out.println(ckeckSortedBetter(input));
	}

}
