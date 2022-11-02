package studio7;

public class Die {
	private int n;
	
	public Die(int sides) {
		n = sides;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	/**
	 * @return roll the die 
	 */
	public int roll () {
		return (int)(Math.random()*n)+1;
	}
	
	public static void main(String[]args) {
		Die d = new Die(6);
		System.out.println(d.roll());
	}
}
