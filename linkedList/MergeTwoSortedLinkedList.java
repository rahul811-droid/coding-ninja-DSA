package linkedList;

public class MergeTwoSortedLinkedList {
public static Node<Integer> merge(Node<Integer>head1,Node<Integer>head2){
	
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

public static void main(String[] args) {
		
	}

}
