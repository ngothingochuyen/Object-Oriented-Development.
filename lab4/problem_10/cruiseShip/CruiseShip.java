package cse203.lab4.problem_10.cruiseShip;

import cse203.lab4.problem_10.ship.Ship;

public class CruiseShip extends Ship {
	private int maxPassengers;

	public CruiseShip() {
		super();
		maxPassengers = 0;
	}

	public CruiseShip(String name, String year, int maxPassengers) {
		super(name, year);
		this.maxPassengers = maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	@Override
	public String toString() {
		return String.format("Ship's name: %s\nMaximum number of passengers: %s", super.getName(), maxPassengers);
	}

}
