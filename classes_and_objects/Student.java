package classes_and_objects;


public class Student {
	
	 public String name;
	 
	private  int rollNumber;
	
	private int age;
	
	static int numStudents;
	
	
//	public Student(int rn) {
//		 rn=rollNumber;
//	}
//	
//	public Student() {
//		
//	}
	
	public Student(String name,int rollNumber) {
		System.out.println(this);
		this.name =name;
		this.rollNumber=rollNumber;
		numStudents++;
	}
	
	public void setRollNumber(int rn) {
		if(rn<=0) {
			return;
		}
		rollNumber=rn;
	}
	
	public int  getRollNumber() {
		
		return rollNumber;
	}
	
	public void print() {
		System.out.println(name +":"+rollNumber);
	}
}

