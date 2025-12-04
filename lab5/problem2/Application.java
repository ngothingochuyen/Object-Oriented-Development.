package lab5.problem2;

import java.util.*;

public class Application {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		InstructorSet instructor = new InstructorSet();
		System.out.println("Add instructor:");
		instructor.addInstructor(new Instructor("H001", "Huyen", "CIT"));
		instructor.addInstructor(new Instructor("H002", "Tran", "BBS"));
		instructor.addInstructor(new Instructor("H003", "Ha", "Nursing"));
		instructor.displayAll();
		System.out.println("--------------");
		System.out.println("Remove instructor:");
		instructor.removeInstructor(new Instructor("H003", "Ha", "Nursing"));
		instructor.displayAll();
		System.out.println("--------------");
		System.out.println("Search instructor:");
		if (instructor.searchInstructor(new Instructor("H002", "Tran", "BBS"))) {
			System.out.println(" The instructor is contained!");
		} else {
			System.out.println(" The instructor is not contained!");
		}
		System.out.println("--------------");

		System.out.println("Display all instructors:");
		instructor.displayAll();
		System.out.println("--------------");

	}

}
