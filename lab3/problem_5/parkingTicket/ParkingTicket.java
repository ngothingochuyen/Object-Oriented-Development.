package cse203.lab3.problem_5.parkingTicket;

import cse203.lab3.problem_5.parkedCar.ParkedCar;
import cse203.lab3.problem_5.policeOfficer.PoliceOfficer;

public class ParkingTicket {
	private ParkedCar parkedCar;
	private PoliceOfficer police;
	private double fine;
	private int time;
	public final int BASE_FINE = 25;
	public final int PLUS_FINE = 10;

	public ParkingTicket() {
		time = 0;
	}

	public ParkingTicket(ParkedCar parkedCar, PoliceOfficer police, int time) {
		this.parkedCar = parkedCar;
		this.police = police;
		this.time = time;
		calculateFine();
	}

	public double calculateFine() {
		if (time > 0) {
			double hours = time / 60;
			fine = BASE_FINE;
			if (hours > 1) {
				fine += PLUS_FINE * (hours - 1);
			}
		}
		return fine;
	}

	@Override
	public String toString() {
		return String.format("Car information: %s\nPolice information: %s\nAmount of fine: %s\nIllegal Time: %s\n",
				parkedCar, police, fine, time);
	}

}
