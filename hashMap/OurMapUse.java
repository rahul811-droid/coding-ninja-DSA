package hashMap;

public class OurMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map =new Map<>();
		for(int i=0;i<20;i++) {
			map.insert("abc"+i,1+i);
			System.out.println("i="+i+"if="+map.loadfactor());
		}
		for(int i=0;i<20;i++) {
			System.out.println("abc"+i+":"+map.getValue("abc"+i));
		}
	}

}
