package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUse {

	public static void main(String[] args) {
//QueueUsingLL<Integer> queue=new QueueUsingLL<>();
//		
////QueuesUsingArrays queue = new QueuesUsingArrays(3);
//for(int i=1;i<=5;i++) {
//	queue.enqueue(i);
//		
//}
//while(!queue.isEmpty()) {
//	try {
//		System.out.println(queue.dequeue());
//	} catch (QueuesEmptyException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//
//	}

//}
		 Queue<Integer> q=new LinkedList<Integer>();
	        for(int i=1;i<5;i++)
	        {
	            q.add(10+i);
	        }
	        System.out.print(q.poll()+" "+q.size());
	    }
	}
