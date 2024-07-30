package linkedList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list1= new ArrayList<>(3);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(90);
		for(int i:list1) {
			System.out.print(i+" ");
		}
		ArrayList<String> list2 = new ArrayList<String>() ;
		list2.add( "apple" );
		list2.add( "banana" );
		list2.add( "carrot" );
		list2.add( 0, "mango" );
		System.out.println(list2.get(0));
		for(String s :list2) {
			System.out.print(s+" ");
		}
	}

}
