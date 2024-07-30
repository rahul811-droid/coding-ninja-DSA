package binaryTrees;

import java.util.Scanner;
import java.util.*;
public class BinaryTreeUse {
	public static void printTree(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return;
		}
		String toBePrinted = root.data + "";
		if(root.left!=null) {
			toBePrinted+="L:" + root.left.data + "";
		}
		if(root.right!=null) {
			toBePrinted+="R:" + root.right.data + "" ;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);

	}
public static BinaryTreeNode<Integer>takeInput(Scanner s){
	int rootdata;
	System.out.println("Enter root data");
	rootdata=s.nextInt();
	if(rootdata == -1) {
		return null ;
	}
	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
	root.left=takeInput(s);
	root.right=takeInput(s);
	return root;

}
public static BinaryTreeNode<Integer>takeInputLevelWise(){
	Scanner s = new Scanner(System.in);
	QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes =new QueueUsingLL<>();
	int rootData=s.nextInt();
	if(rootData == -1) {
		return null;
	}
	
	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
	pendingNodes.enqueue(root);
	while(!pendingNodes.isEmpty()) {
		BinaryTreeNode<Integer> front;
		try {
			front = pendingNodes.dequeue();
		}
		catch(QueuesEmptyException e) {
			return null;
		}
		System.out.println("Enter left child of " + front.data);
		int leftChild=s.nextInt();
		if(leftChild != -1)	{
			BinaryTreeNode<Integer>child = new BinaryTreeNode<>(leftChild);
			front.left=child;
		}
		System.out.println("Enter right child of " + front.data);
		int rightChild=s.nextInt();
		if(rightChild!= -1)	{
			BinaryTreeNode<Integer>child = new BinaryTreeNode<>(rightChild);
			front.right=child;
		}
	}
	return root;

}

public static Pair<Boolean,Pair<Integer,Integer>> isBst(BinaryTreeNode<Integer>root){
	if(root == null) {
		Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean,Pair<Integer,Integer>>();
		output.first=true;
		output.second =new Pair<>();
		output.second.first = Integer.MAX_VALUE ;
		output.second.second = Integer.MIN_VALUE ;
		return output;
				
	}
}
public static boolean isBst3(BinaryTreeNode<Integer>root , int min , int max) {
	if(root == null) {
		return true;
	}if(root.data<min || root.data> max) {
		return false;
	}
	boolean isLeftok = isBst3(root.left,min,root.data-1);
	boolean isRightok = isBst3(root.right,root.data,max);
	return isLeftok && isRightok ;
}
public static ArrayList<Integer>getRootToNodePath(BinaryTreeNode<Integer>root,int data){
	if(root==null) {
		return null;
	}
	if(root.data==data) {
		ArrayList<Integer>output =new ArrayList<>();
		output.add(root.data);
		return output;
	}
	ArrayList<Integer>leftOutput=getRootToNodePath(root.left,data);
	if(leftOutput!=null) {
		leftOutput.add(root.data);
		return leftOutput;
	}
	ArrayList<Integer>rightOutput=getRootToNodePath(root.right,data);
	if(leftOutput!=null) {
		rightOutput.add(root.data);
		return rightOutput;
	}else {
		return null;
	}
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTreeNode<Integer>root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer>node1 = new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer>node2 = new BinaryTreeNode<>(3);
//		root.left=node1;
//		root.right=node2;
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer>root = takeInputLevelWise();
		printTree(root);
		getRootToNodePath(root, 3);
	}

}
