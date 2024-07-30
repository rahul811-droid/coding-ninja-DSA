package classes_and_objects;

public class ComplexNumber {
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real,int imaginary ) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public int getReal() {
		return real;
	}
	public int getImaginary() {
		return imaginary;
	}
	public void setReal(int r) {
		this.real=r;
	}
	public void setImaginary(int i) {
		this.imaginary=i;
	}
	public void print() {
		
		System.out.println(real+"+"+imaginary+"!");
	}
	
	public void add(ComplexNumber c2) {
		this.real=this.real+c2.real;
		this.imaginary=this.imaginary+c2.imaginary;
	}
	
    public void multiply(ComplexNumber c2) {
		this.real=this.real*c2.real;
		this.imaginary=this.imaginary*c2.imaginary ;
		
	}
    public  ComplexNumber conjugate() {
		return null;
    	
    }
    
    public static ComplexNumber add(ComplexNumber c1,ComplexNumber c3) {
    	
        int newReal = c1.real+c3.real ;
		
		int newImaginary =c1.imaginary+c3.imaginary;
		
		ComplexNumber c = new ComplexNumber(newReal,newImaginary);
		
		return c;
    	
    }

}

