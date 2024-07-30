package binaryTrees;

public class BinarySearchTree {
	private BinaryTreeNode<Integer>root;
	
	public BinaryTreeNode<Integer>insertData(int data, BinaryTreeNode<Integer>root){
		if(root==null) {
			BinaryTreeNode<Integer>newNode =new BinaryTreeNode<>(data);
			return newNode;
		}
		if(root.data>data) {
			root.left = insertData(data,root.left);
		}else {
			root.right = insertData(data,root.right);
		}
		return root;
	}
	public void insertData(int data) {
		root = insertData(data,root);
	}
	
	private BinaryTreeNode<Integer> deleteData(int data,BinaryTreeNode<Integer> root ) {
		if(root==null) {
			return null;
		}
		if(data<root.data) {
			root.left=deleteData(data, root.left);
			return root;
		}else if
			(data>root.data){
				root.right = deleteData(data,root.right);
				return root;
			}else {
				if(root.left==null && root.right==null) {
					return null;
				}else if(root.left==null) {
					return root.right;
				}else if(root.right==null){
					return root.left;
				}else {
					BinaryTreeNode<Integer>minNode =root.right;
					while(minNode.left!=null) {
						minNode=minNode.left;
					}
					root.data=minNode.data;
					root.right=deleteData(minNode.data,root.right);
					return root;
				}
			}
		
	
	}
	public void deleteData(int data) {
		root = deleteData(data,root);
	}
	private boolean hasDataHelper(int data, BinaryTreeNode<Integer>root) {
		if(root==null) {
			return false;
		}
		if(root.data==data) {
			return true;
		}
		else if(data>root.data) {
			return hasDataHelper(data,root.right);
		}else {
			return hasDataHelper(data,root.left);
		}
		
	}
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
	public void printTree() {
		printTree(root);
	}
	public boolean hasData(int data) {
		return hasDataHelper(data,root);
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(10);
		bst.insertData(20);
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(7);
		bst.insertData(9);
		bst.printTree();
	}
}
