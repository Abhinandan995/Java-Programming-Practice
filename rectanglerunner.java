
class rectangle {
	private int length;
	private int breadth;
	private int area;
	private double perimeter;

	public rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		System.out.println("Length: " + length + "\nBreadth: " + breadth);
	}

	public void setArea(int length, int breadth) {
		this.length = 10;
		this.breadth = 20;
		area = length * breadth;
		System.out.println("Area: " + area);
	}

	public void setPerimeter(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		perimeter = (2 * (length + breadth));
		System.out.println("Perimeter: " + perimeter);
	}

}

public class RectangleRunner {

	public static void main(String[] args) {
		int l = 10;
		int b = 20;
		rectangle rect = new rectangle(l, b);
		rect.setArea(l, b);
		rect.setPerimeter(l, b);
	}

}
