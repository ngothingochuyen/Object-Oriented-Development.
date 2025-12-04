package cse203.lab3.problem_6;

import java.util.Scanner;
import cse203.lab3.problem_6.die.Die;

public class Application {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Die die = new Die(7);
		System.out.println("The results is: " + die.getValue());
	}

}
