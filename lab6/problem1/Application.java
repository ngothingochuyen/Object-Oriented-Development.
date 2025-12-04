package lab6.problem1;

import java.util.*;

public class Application {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();

		shapes.add(new Circle(5));
		shapes.add(new Rectangle(4, 6));
		shapes.add(new Triangle(3, 7));

		for (Shape shape : shapes) {
			shape.draw();
			System.out.printf("Area: %.2f\n" ,shape.calculateArea());
			System.out.println();
		}
	}
}
