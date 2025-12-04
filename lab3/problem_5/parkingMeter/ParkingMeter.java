package cse203.lab3.problem_5.parkingMeter;

public class ParkingMeter {
	private int timePurchased;

	public ParkingMeter() {
		timePurchased = 0;
	}

	public ParkingMeter(int timePurchased) {
		this.timePurchased = timePurchased;
	}

	public void setTimePurchased(int timePurchased) {
		this.timePurchased = timePurchased;
	}

	public int getTimePurchased() {
		return timePurchased;

	}

}
