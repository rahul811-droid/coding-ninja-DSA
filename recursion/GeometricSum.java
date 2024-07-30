package recursion;

public class GeometricSum {
	public static double findGeometricSum(int k){
		if(k==0){
			return 1;
		}
		double  a =findGeometricSum(k-1);
		return Math.pow(0.5, k)+a;

	}
	public static void main(String[] args) {
		
		double d=1+1/2+1/4;
		double c=findGeometricSum();
		System.out.println(c);

	}

}
