package hashMap;
import java.util.ArrayList;
import java.util.HashMap;
public class RemoveDuplicates {
public static ArrayList<Integer> removeDuplicates(int a[]){
	ArrayList<Integer>output =new ArrayList<>();
	HashMap<Integer, Boolean> seen =new HashMap<>();
	for(int i=0;i<a.length;i++) {
		if(seen.containsKey(a[i])) {
			continue;
			
		}
		output.add(a[i]);
		seen.put(a[i],true);
		
	}return output;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,2,2,24,8,90,78,90,100};
		ArrayList<Integer> output=removeDuplicates(a);
		for(int i=0;i<output.size();i++) {
			System.out.println(output.get(i));
		}
	
	}

}
