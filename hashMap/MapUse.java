package hashMap;
import java.util.HashMap;
import java.util.Set;
public class MapUse {

	private static final String HashMap = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>map = new HashMap<>();
//		insert 
		map.put("abc", 1);
		map.put("def", 2);
		map.put("abc1", 3);
		map.put("def1", 4);
//		checkpresence 
		System.out.println("size" +map.size());
		if(map.containsKey("abcd")) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		int v =0;
		if(map.containsKey("abc1")) {
			v=map.get("abc1");
		}
		System.out.println(v);
		if(map.containsValue(2)) {
			System.out.println("has 2 as value");
		}
//		remove 
		int s = map.remove("abc");
		System.out.println(s);
		Set<String>keys = map.keySet();
		for(String str:keys) {
			System.out.println(str);
		}
	}

}
