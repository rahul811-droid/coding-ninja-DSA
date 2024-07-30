package stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
//		StackUsingArray stack = new StackUsingArray(3);
		StackUsingLL<Integer> stack = new StackUsingLL<>();
//		for(int i=1;i<=5;i++) {
//			stack.push(i);
//		}
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
		stack.push(8);
		stack.push(10);
		System.out.println();
		while(!stack.isEmpty()) {
		System.out.println(stack.pop());
		}
	}

}
