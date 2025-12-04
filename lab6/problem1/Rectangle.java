package lab6.problem1;

public class Rectangle implements Shape {
	private double width, length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}

	@Override
	public double calculateArea() {
		return width * length;
	}
}

