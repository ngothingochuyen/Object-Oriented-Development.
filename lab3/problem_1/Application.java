package cse203.lab3.problem_1;

import cse203.lab3.problem_1.description.RetailItem;

public class Application {

	public static void main(String[] args) {
		RetailItem item_1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem item_2 = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem item_3 = new RetailItem("Shirt", 20, 24.95);

		System.out.println("Item #1: " + item_1);
		System.out.println("Item #2: " + item_2);
		System.out.println("Item #3: " + item_3);

	}

}
