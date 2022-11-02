package studio7;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex (double r, double i) {
		real = r;
		imaginary = i;
	}
	
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	public String toString() {
		return real + " + " + imaginary +"i";
	}
	
	public Complex add (Complex c) {
		Complex added = new Complex (this.real+c.real, this.imaginary+c.imaginary);
		return added;
	}
	
	public Complex product (Complex c) {
		Complex prod = new Complex (this.real*c.real-this.imaginary*c.imaginary, this.real*c.imaginary+this.imaginary*c.real);
		return prod;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex (1, 2);
		Complex c2 = new Complex (2, 3);
		System.out.println(c1.add(c2).toString());
	}

}
