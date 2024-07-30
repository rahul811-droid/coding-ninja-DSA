package priorityQueue;
import java.util.PriorityQueue;
import java.lang.reflect.Array;

public class PriorityQueueUse {

	public static void insertIntoVertuallHeap(int arr[],int i) {
		int childIndex =i;
		int parentIndex = (childIndex-1)/2;
		while(childIndex >0) {
			if(arr[childIndex]< arr[parentIndex]) {
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex]= temp;
				childIndex = parentIndex;
				parentIndex = (childIndex-1)/2;
			}
			else {
				return;
			}
		}
	}
	public static int removeMinFromVertualHeap(int arr[],int heapSize) {
		int temp= arr[0];
		arr[0]=arr[heapSize-1];
		heapSize--;
		int index =0;
		int leftChildIndex =1;
		int rightChildIndex =2;
		while(leftChildIndex < heapSize) {
			int minIndex = index;
			if(arr[leftChildIndex] < arr[minIndex]) {
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex]) {
				minIndex = rightChildIndex;
			}
			if(minIndex!=index) {
				int temp1 = arr[index];
				arr[index] = arr[minIndex];
				arr[minIndex] = temp1;
				index = minIndex;
				leftChildIndex = 2*index+1;;
				rightChildIndex=2*index+2;
				
			}
			else {
				break;
			}
		}
		return temp;
		
	}
	public static void main(String[] args)  {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int arr[] = {9,1,0,4,7,3};
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
		}
		
//		int arr[] = {5,1,9,2,0,6};
//		for(int i=0;i<arr.length;i++) {
//			insertIntoVertuallHeap(arr,i);
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[arr.length-1-i]=removeMinFromVertualHeap(arr,arr.length-i);
//		}
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
//		
		// TODO Auto-generated method stub
//		Priority_Queue pq = new Priority_Queue();
//		int arr[] = {5,1,9,2,0};
//		for(int i=0;i<arr.length;i++) {
//			pq.insert(arr[i]);
//		}
//		while(!pq.isEmpty()) {
//			System.out.print(pq.removeMin()+" ");
//		}
//		System.out.println();
		
	}

}
