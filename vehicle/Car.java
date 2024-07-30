package vehicle;

public abstract class Car extends Vehicle{
	int numGears;
	boolean isConvertable;
	
	public  Car() {
		super(100);
	}
	
	public Car(int numGears,int maxSpeed) {
		super(maxSpeed);
		this.numGears=numGears;
		System.out.println("car class print");
	}
	public boolean isConvertable() {
		return isConvertable;
	}
	@Override
	public boolean isMotorized() {
		
		return false;
	}
	public void print() {
		super.print();
		System.out.println("Car numGears : "+numGears);
		System.out.println("Car isConvertable : "+isConvertable);

	}
	
}
