package cse203.lab4.problem_3;

import java.util.*;	

import cse203.lab4.problem_3.teamLeader.TeamLeader;

public class Application {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		TeamLeader employee_1 = new TeamLeader("Huyen", "123-A", "29/10/2025", 1, 50.5, 20, 25, 150.0);
		TeamLeader employee_2 = new TeamLeader("Hehe", "123-B", "1/11/2025", 0, 50.0, 20, 20, 100.0);
		TeamLeader employee_3 = new TeamLeader();

		System.out.println(employee_1);
		System.out.println("----------------------------------");
		System.out.println(employee_2);
		System.out.println("----------------------------------");
		System.out.println(employee_3);
		System.out.println("----------------------------------");

	}
}
