package cse203.lab4.problem_2;

import java.util.*;

import cse203.lab4.problem_2.shiftSupervisor.ShiftSupervisor;

public class Application {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		ShiftSupervisor employee_1 = new ShiftSupervisor("Huyen", "123-A", "29/10/2025", 50.0, 250);
		ShiftSupervisor employee_2 = new ShiftSupervisor("Hehe", "123-B", "1/11/2025", 45.0, 100);
		ShiftSupervisor employee_3 = new ShiftSupervisor();
		ShiftSupervisor employee_4 = new ShiftSupervisor("Hihi", "123-C", "5/11/2025", 60.0, 200);

		System.out.println(employee_1);
		System.out.println("----------------------------------");
		System.out.println(employee_2);
		System.out.println("----------------------------------");
		System.out.println(employee_3);
		System.out.println("----------------------------------");
		System.out.println(employee_4);
		System.out.println("----------------------------------");


	}
}
