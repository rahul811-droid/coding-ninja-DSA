package recursion;

public class CountZeros {
public static int countzeros(int n) {
	if(n<10) {
		if(n==0) {
			return 1;
		}else{
			return 0;
		}
		
	}
	int smallAns =countzeros(n/10);
	if(n%10==0) {
		return smallAns+1;
	}
	return smallAns;
	
}
	public static void main(String[] args) {
	int n =10900;
	System.out.println(countzeros(n));

	}

}
