package tree;

import java.util.Scanner;

public class TreeUse {
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner s =new Scanner(System.in);
		System.out.println("Enter root data");
		int rootdata=s.nextInt();
    QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
 TreeNode<Integer>root = new TreeNode<>(rootdata);
    pendingNodes.enqueue(root);
    while(!pendingNodes.isEmpty()) {
    	try{
    		TreeNode<Integer>frontNode=pendingNodes.dequeue();
    		    	System.out.println("Enter num of children of "+ frontNode.data);
    		    	int numChildren =s.nextInt();
    		    	for(int i=0;i<numChildren;i++) {
    		    		System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
    		    		int child=s.nextInt();
    		    		TreeNode<Integer>childNode=new TreeNode<Integer>(child);
    		    		frontNode.children.add(childNode);
    		    		pendingNodes.enqueue(childNode);
    		    	}
    	}catch(QueuesEmptyException e) {
    		return null;
    	}
    	
    }
    return root;
    
	}
	
	public static TreeNode<Integer> takeInput(Scanner s){
		int n;
		System.out.println("Enter next node data");
		 n=s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of chilcren for " + n);
		int childcount = s.nextInt();
		for(int i=0;i<childcount;i++) {
			TreeNode<Integer> child = takeInput(s);

			root.children.add(child);
		}
		return root;
	}
	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":" ;
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		TreeNode<Integer>root =takeInput(s);
		TreeNode<Integer> root=takeInputLevelWise();
		print(root);
//		TreeNode<Integer>root = new TreeNode<>(4);
//		TreeNode<Integer>node1 = new TreeNode<>(5);
//		TreeNode<Integer>node2 = new TreeNode<>(6);
//		TreeNode<Integer>node3 = new TreeNode<>(7);
//		TreeNode<Integer>node4 = new TreeNode<>(8);
//		TreeNode<Integer>node5 = new TreeNode<>(9);
//
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		root.children.add(node4);
//		node1.children.add(node5);
//		
//		System.out.println(root);

	}

}
