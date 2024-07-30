package vehicle;

import java.util.Scanner;

public  class VehicleUse {

	public static void main(String[] args) {

		Vehicle v = new Vehicle(20,40);
		v.isMotorized();
		int n ;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		Vehicle v;
		if(n==0) {
			 v = new Car(5,100);
			v.print();
		}
		else {
			v = new Vehicle(109);
			v.print();
		}
		Car c = new Car(10,100);
		
//		c.print();	
		
		
	}

}
