package studio7;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction (int n, int d) {
		numerator = n;
		denominator = d;
	}


	public int getNumerator() {
		return numerator;
	}


	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}


	public int getDenominator() {
		return denominator;
	}


	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public static int gcd(int p, int q) {
		if (q==0) {
			return p;
		} else {
			return gcd(q, p%q);
		}
	}
	
	public void simplify () {
		int temp = numerator;
		int temp2 = denominator;
		this.numerator /= gcd(temp, temp2);
		this.denominator /= gcd(temp, temp2);
	}

	public Fraction add (Fraction f) {
		this.simplify();
		f.simplify();
		int temp = this.denominator;
		this.numerator *= f.denominator;
		this.denominator *= f.denominator;
		f.numerator *= temp;
		f.denominator *= temp;
		Fraction f2 = new Fraction (this.numerator + f.numerator, this.denominator);
		f2.simplify();
		return f2;
	}

	public Fraction multiply (Fraction f) {
		Fraction multiplied = new Fraction (this.numerator * f.numerator, this.denominator * f.denominator);
		return multiplied;
	}
	
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	public static void main(String[] args) {
		Fraction f1 = new Fraction (2, 4);
		f1.simplify();
		System.out.println(f1.toString());
		Fraction f2 = new Fraction (1, 3);
		System.out.println(f1.add(f2).toString());

	}

}
