package cse203.lab4.problem_10.cargoShip;

import cse203.lab4.problem_10.ship.Ship;

public class CargoShip extends Ship {
	public int capacity;

	public CargoShip() {
		super();
		capacity = 0;

	}

	public CargoShip(String name, String year, int capacity) {
		super(name, year);
		this.capacity = capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int gatCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return String.format("Ship's name: %s\nCapacity: %s", super.getName(), capacity);
	}
}
