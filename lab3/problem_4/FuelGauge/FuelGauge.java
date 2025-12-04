package cse203.lab3.problem_4.FuelGauge;

public class FuelGauge {
	public final int MAX_GALLONS = 15;
	private int currentGallons;

	public FuelGauge() {
		currentGallons = 0;
	}

	public FuelGauge(int currentGallons) {
		this.currentGallons = currentGallons;
	}

	public int getCurrentGallons() {
		return currentGallons;
	}

	public void incrementGallons() {
		if (currentGallons < MAX_GALLONS) {
			currentGallons++;
		} else
			System.out.println("The tank is full !");
	}

	public void decrementGallons() {
		if (currentGallons > 0) {
			currentGallons--;
		} else
			System.out.println("The tank is empty !!!");
	}

}
