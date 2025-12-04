package cse203.lab3.problem_3;

import java.util.Scanner;
import cse203.lab3.problem_3.area.Area;

public class Application {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Area circle = new Area();
		Area rectangles = new Area();
		Area cylinders = new Area();
		System.out.printf("The circle with area equal to: %.2f\n", circle.getArea((float) 15.0));
		System.out.printf("The rectangle with area equal to: %.2f\n", rectangles.getArea(12.5, 16.0));
		System.out.printf("The cylinder with area equal to: %.2f\n", cylinders.getArea((float) 10.5, (float) 12.5));

	}

}
