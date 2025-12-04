package cse203.lab3.problem_2;

import java.util.Scanner;

import cse203.lab3.problem_2.cashRegister.CashRegister;
import cse203.lab3.problem_2.description.RetailItem;

public class Application {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		RetailItem item = new RetailItem("Candy Bar", 50, 0.75);
		System.out.println(item);
		System.out.printf("How many %s are you being purchased?", item.getDescription());
		Integer quantity = sc.nextInt();
		CashRegister cashRegister = new CashRegister(item, quantity);
		System.out.println(cashRegister);

	}

}
