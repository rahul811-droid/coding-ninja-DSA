package generic;

public class PairUse {
public static <T>void printArr(T arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair p = new Pair(1,"B");
		
		Pair<Integer,String> p1 = new Pair<>(9,"b");
		Pair<Integer,String> p2 = new Pair<>(2,"o");
		Pair<Integer,Character> p3 = new Pair<>(9,'r');
		int a=9;
		String s = ("ok");
		int b =100;
		Pair<Integer,String> InternalPair = new Pair<>(90,"Chiku");
		Pair<Pair<Integer,String>,Integer>  p4 = new Pair<>(InternalPair,b);
//		System.out.println(p4.getFirst().getFirst());
//		System.out.println(p4.getFirst().getSecond());
//		System.out.println(p4.getSecond());
		
	}

}
