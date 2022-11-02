package studio7;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}

	/**
	 * @return length of rectangle
	 */
	public int getLength() {
		return length;
	}

	/**
	 * sets length of rectangle
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return width of rectangle
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * sets width of rectangle
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return area of rectangle
	 */
	public int Area() {
		return length*width;
	}
	
	/**
	 * @return perimeter of rectangle
	 */
	public int perimeter() {
		return 2*length + 2*width;
	}
	
	/**
	 * @param r is another rectangle
	 * 
	 * @return whether this rectangle is smaller in area than another rectangle
	 */
	public boolean isSmaller (Rectangle r) {
		return (this.Area() < r.Area());
	}
	
	/**
	 * @return whether the rectangle is a square
	 */
	public boolean isSquare() {
		return (length == width);
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3, 3);
		System.out.println(r.isSquare());
		r.setLength(4);
	}
}
