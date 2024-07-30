package arrays;

public class Push0Toend {
public static void push0Toend(int arr[]) {
	 int i=0;
     int k=0;
     int temp[]=new int [arr.length];
     while(i<arr.length){
         if(arr[i]!=0){
             temp[k]=arr[i];
             k++;
             
         }
         i++;
         
     } while(i<arr.length){
         temp[k]=arr[i];
         k++;
         
     }i++;
 }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,0,5,6,78,0,0,9,8,0};
		push0Toend(arr);
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}
	

}
