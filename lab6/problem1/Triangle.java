package lab6.problem1;

public class Triangle implements Shape {
	private double base, height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Triangle");
	}

	@Override
	public double calculateArea() {
		return 0.5 * (base * height);
	}
}
