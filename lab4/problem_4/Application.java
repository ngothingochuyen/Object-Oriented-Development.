package cse203.lab4.problem_4;

import cse203.lab4.problem_4.essay.Essay;

public class Application {
	public static void main(String[] args) {
		Essay essay = new Essay();
		essay.setScore(30.0, 20.0, 20.0, 25.0);

		System.out.println("Essay:");
		System.out.println("Grammar points: " + essay.getGrammar());
		System.out.println("Spelling points: " + essay.getSpelling());
		System.out.println("Length points: " + essay.getCorrectLength());
		System.out.println("Content points: " + essay.getContent());
		System.out.println("Total points: " + essay.getScore());
		System.out.println("Grade: " + essay.getGrade());
	}
}
