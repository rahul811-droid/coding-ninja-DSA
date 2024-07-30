package generic;

import vehicle.Vehicle;

public class Print {
public static <T >void printArr1(T arr[]) {
	for(int i=0;i<arr.length;i++) {
//		arr[i].print(); n 
		System.out.print(" ");
	}
}
	public static void main(String[] args) {
		
		Integer arr2[]= new Integer[10];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=i+1;
		}
//		printArr1(arr2);
//		String s[] = new String[10];
//			
//		
//		for(int i=0;i<10;i++) {
//			s[i]="abc";
//		}
//		printArr1(s);
		Vehicle s1[] = new Vehicle() 
		for(int i=0;i<10;i++) {
			s1[i]=new Vehicle(10);
		}
	}

}
