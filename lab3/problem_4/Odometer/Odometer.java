package cse203.lab3.problem_4.Odometer;

import cse203.lab3.problem_4.FuelGauge.FuelGauge;

public class Odometer {
	public final int MAX_MILEAGE = 999999;
	public final int MPG = 24;
	private int resetPoint;
	private int currentMileage;
	private FuelGauge fuelGauge;

	public Odometer() {
		this.currentMileage = 0;
	}

	public Odometer(int currentMileage, FuelGauge fuelGauge) {
		this.currentMileage = currentMileage;
		this.fuelGauge = fuelGauge;
	}

	public int getCurrentMileage() {
		return currentMileage;
	}

	public void incrementMileage() {
		if (currentMileage <= MAX_MILEAGE) {
			if (resetPoint < MPG) {
				currentMileage++;
				resetPoint++;
			} else {
				resetPoint = 0;
				currentMileage++;
				fuelGauge.decrementGallons();
			}
		} else {
			currentMileage = 0;
		}
	}

}
