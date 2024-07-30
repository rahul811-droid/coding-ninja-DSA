package arrays;

public class FindUniqueInarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,4,4,3,5,5};
//		int ans =0;
//	      for(int i=0;i<arr.length;i++){
//	        ans= ans^arr[i];
//	       
//	      }
//	     System.out.println(ans);
//			
//	    }
//	    }
//		
		  for(int i=0;i<arr.length;i++){
			  int j;
		        for( j=0;j<arr.length;j++){
		          if(i!=j){
		           if(arr[i]==arr[j]) {
		        	   break;
		           }
	}
		          if(j==arr.length) {
				        System.out.println(arr[i]);
				        }
	
}
		       
		  }
	}
}
	

