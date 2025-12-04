package cse203.lab3.problem_5.policeOfficer;

import cse203.lab3.problem_5.parkedCar.ParkedCar;
import cse203.lab3.problem_5.parkingMeter.ParkingMeter;
import cse203.lab3.problem_5.parkingTicket.ParkingTicket;

public class PoliceOfficer {
	private String name;
	private String badgeNumber;

	public PoliceOfficer() {
		name = "";
		badgeNumber = "";
	}

	public PoliceOfficer(String name, String badgeNumber) {
		this.name = name;
		this.badgeNumber = badgeNumber;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

	public String getBadgeNumber() {
		return badgeNumber;
	}

	public ParkingTicket ticket(ParkedCar car, ParkingMeter parkingMeter) {
		ParkingTicket ticket = null;
		int time = car.getParkingTime() - parkingMeter.getTimePurchased();
		if (time > 0) {
			ticket = new ParkingTicket(car, this, time);
		}
		return ticket;

	}

	@Override
	public String toString() {
		return String.format("\n Name: %s\n Badge Number: %s\n", name, badgeNumber);
	}
}
