package dp;

public class FibonnacciSeries {
public static int FibM(int n) {
	int storage[] = new int[n+1];
	for(int i=0;i<=n;i++) {
		storage[i]=-1;
	}
	return FibM(n,storage);
	
}
public static int fib(int n) {
	if(n==0 || n==1) {
		return n;
	}
	return fib(n-1)+fib(n-2);
}
public static int fibdp(int n) {
	int storage[] = new int[n+1];
	storage[0]=0;
	storage[1]=1;
	for(int i=2;i<=n;i++) {
		storage[i]=storage[i-1]+storage[i-2];
	}
	return storage[n];
}
	private static int FibM(int n, int[] storage) {
	// TODO Auto-generated method stub
		if(n==0 || n==1) {
			storage[n]=n;
			return storage[n];
		}
		if(storage[n]!=-1) {
			return storage[n];
		}
		storage[n]=FibM(n-1,storage)+ FibM(n-2,storage);
	return storage[n];
}
	public static int countSteps(int n) {
		if(n==1) {
			return 0;
		}
		int op1 = countSteps(n-1);
		int op2= Integer.MAX_VALUE;
		int op3=Integer.MAX_VALUE;;
		if(n%2==0) {
		 op2 = countSteps(n/2);
		}
		if(n%3==0) {
			 op3 = countSteps(n/3);
		}
		return 1+Math.min(op1, Math.min(op2, op3));
	}
	public static int countStepsM(int n) {
		int storage[] = new int[n+1];
		return countStepsM(n,storage);
	}

	public static int countStepsM(int n,int storage[]) {
		if(n==1) {
			storage[n]=0;
			return storage[n];
		}
		if(storage[n]!=0) {
			return storage[n];
		}
		int op1 = countStepsM(n-1,storage);
		int op2= Integer.MAX_VALUE;
		int op3=Integer.MAX_VALUE;;
		if(n%2==0) {
		 op2 = countStepsM(n/2,storage);
		}
		if(n%3==0) {
			 op3 = countStepsM(n/3,storage);
		}
		storage[n] = 1+Math.min(op1, Math.min(op2, op3));
		return storage[n]  ;
		
	}
	public static int countStepDp(int n) {
		int storage[] = new int[n+1];
		storage[1]= 0;
		for(int i=2;i<=n;i++) {
			int min = storage[i-1];
			if(i%3 ==0) {
				if(min>storage[i/3]) {
					min = storage[i/3];
				}
			}
			if(i%2 ==0) {
				if(min>storage[i/2]) {
					min = storage[i/2];
				}
			}
			storage[i]=1+min;
		}
		return storage[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4598;
		System.out.println(countStepDp(n));
		System.out.println(countStepsM(n));
		System.out.println(countSteps(n));
		
//		System.out.println(fibdp(n));
//		System.out.println(FibM(n));
//		System.out.println(fib(n));
	}

}
