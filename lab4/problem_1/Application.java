package cse203.lab4.problem_1;

import java.util.Scanner;	
import cse203.lab4.problem_1.productionWorker.ProductionWorker;

public class Application {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		ProductionWorker productionWorker_1 = new ProductionWorker ("Huyen", "123-A", "29/10/2025", 1,50.5);
		System.out.println(productionWorker_1);
		
		
		
	}
}
