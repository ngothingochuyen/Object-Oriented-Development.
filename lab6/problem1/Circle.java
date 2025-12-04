package lab6.problem1;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

