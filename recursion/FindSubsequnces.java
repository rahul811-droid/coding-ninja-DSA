package recursion;

public class FindSubsequnces {
public static String[] findsubSequences(String str) {
	if(str.length()==0) {
		String ans[]= {""};
		return ans;
	}	
	String smallAns[]=findsubSequences(str.substring(1));
	String ans[] = new String[2*smallAns.length];
	int k=0;
	for(int i=0;i<smallAns.length;i++) {
		ans[k]=smallAns[i];
		k++;
	}
	for(int i=0;i<smallAns.length;i++) {
//		ans[i+smallAns.length];
		ans[k]=str.charAt(0)+smallAns[i];
		k++;
	}
	
	return ans;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		String ans[]=findsubSequences(str);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

}
