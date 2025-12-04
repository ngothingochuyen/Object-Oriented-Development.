package cse203.lab4.problem_10.ship;

public class Ship {
	private String name;
	private String year;

	public Ship(String name, String year) {
		this.name = name;
		this.year = year;
	}

	public Ship() {
		name = "";
		year = "";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getYear() {
		return year;
	}

	@Override
	public String toString() {
		return String.format("Ship's name: %s\nThe ship was built in: %s", name, year);
	}

}
