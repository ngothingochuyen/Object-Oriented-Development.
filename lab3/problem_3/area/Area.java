package cse203.lab3.problem_3.area;

public class Area {
	public static double getArea(float radius) {
		return Math.pow(radius, 2) * Math.PI;
	}

	public static double getArea(double width, double length) {
		return width * length;
	}

	public double getArea(float radius, float height) {
		return Math.pow(radius, 2) * Math.PI * 2 * height;
	}

}
