package vehicle;

import generic.PrintInterface;

public abstract class Vehicle implements PrintInterface {
	protected String color;
	final int maxSpeed;

	public Vehicle(int maxSpeed) {
		this.maxSpeed=maxSpeed;
		System.out.println("Vehicle class print");
	}
	
	public abstract boolean isMotorized();
	public abstract String getCompany();
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
public void print() {
	System.out.println("vehicle color: " +color);
	System.out.println("vehicle Speed : "+maxSpeed);
}
	
	
}
