package cse203.lab3.problem_4;

import java.util.Scanner;
import cse203.lab3.problem_4.FuelGauge.FuelGauge;
import cse203.lab3.problem_4.Odometer.Odometer;

public class Application {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int currentGallons = 10;
		int currentMileage = 120;
		FuelGauge fuelGauge = new FuelGauge(currentGallons);
		Odometer odometer = new Odometer(currentMileage, fuelGauge);
		for (int i = currentGallons; i < fuelGauge.MAX_GALLONS; i++) {
			fuelGauge.incrementGallons();
		}
		System.out.println("Initial Mileage: " + odometer.getCurrentMileage());
		System.out.println("Initial Fuel Level: " + currentGallons);
		System.out.println();
		System.out.println("The tank is being filled...");
		System.out.println();
		fuelGauge.incrementGallons();
		System.out.println("Let's start the journey!!!");
		System.out.println();
		while (fuelGauge.getCurrentGallons() > 0) {
			odometer.incrementMileage();
			sb.append("Current Mileage: " + odometer.getCurrentMileage()).append("\n");
			sb.append("Current Fuel Level: " + fuelGauge.getCurrentGallons()).append("\n");

		}
		System.out.println(sb);
		fuelGauge.decrementGallons();

	}

}
