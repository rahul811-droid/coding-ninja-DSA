package linkedList;
import java.util.Scanner;
public class NodeUse {
	public static Node<Integer> mergeTwoList(Node<Integer>head1,Node<Integer>head2){
		
		if(head1==null) {
			return head2;
		}
		if(head2==null) {
			return head1;
		}
		Node<Integer>t1=head1,t2=head2,head3=null,tail3=null;
		if(t1.data<=t2.data) {
			head3=t1;
			tail3=t1;
			t1=t1.next;
		}
		else {
			head3=t2;
			tail3=t2;
			t2=t2.next;
		}
		while(t1!=null && t2!=null) {
			
			if(t1.data<=t2.data) {
				tail3.next=t1;
				tail3=t1;
				t1=t1.next;
			}
			else {
				tail3.next=t2;
				tail3=t2;
				t2=t2.next;
			}
		}
		if(t1!=null) {
			tail3.next=t1;
			
		}else {
			tail3.next=t2;
		}
		return head3;
	}
	public static Node<Integer>insert(Node<Integer> head,int pos,int data){
		Node<Integer>newNode = new Node<>(data);
		if(pos==0) {
			newNode.next = head;
			return newNode;
		}
		int i=0;
		Node<Integer> temp = head;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		
		return head;
	}
	public static Node<Integer> takeInput(){
		Node<Integer> head=null,tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1) {
			Node<Integer> newNode =new Node<>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
////				Node<Integer> temp = head;
////				while(temp.next!=null) {
////					temp=temp.next;
////				}
			tail.next=newNode;
			tail=newNode;
					
			}
			data=s.nextInt();
		}
		return head;
	}
	public static Node<Integer> findMid(Node<Integer>head){
		if(head!=null && head.next!=null) {
			return head;
		}
		Node<Integer>fast=head,slow=head;
		while(fast!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static Node<Integer> reverseR(Node<Integer>head){
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer>finalHead=reverseR(head.next);
		Node<Integer> temp = finalHead;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return finalHead;
	}
	public static void print(Node<Integer> head) {
	while(head!=null) {
		System.out.print(head.data+" ");
		head=head.next;
	}
}
	public static DoubleNode reverseBetter(Node<Integer> head) {
		if(head==null || head.next==null) {
			DoubleNode ans = new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
			
		}
		DoubleNode smallAns =reverseBetter(head.next);
		smallAns.tail.next=head;
		head.next=null; 
		
		DoubleNode 	ans =new DoubleNode();
		ans.head=smallAns.head;
		ans.tail=head;
		return ans;
	}
	public static Node<Integer> reverseLLR(Node<Integer>head){
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer>reverseTail=head.next;
		Node<Integer>smallHead=reverseLLR(head.next);
		reverseTail.next=head;
		head.next=null;
		return smallHead;
		
	}
	public static void main(String[] args) {
		Node<Integer> node1=takeInput();
		Node<Integer> ans =reverseLLR(node1);
		print(ans);
		
		

	
		

		
	}

}
