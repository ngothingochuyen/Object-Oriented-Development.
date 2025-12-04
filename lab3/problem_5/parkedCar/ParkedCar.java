package cse203.lab3.problem_5.parkedCar;

public class ParkedCar {
	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private int parkingTime;

	public ParkedCar(String make, String model, String color, String licenseNumber, int parkingTime) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.parkingTime = parkingTime;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setparkingTime(int parkingTime) {
		this.parkingTime = parkingTime;
	}

	public int getParkingTime() {
		return parkingTime;
	}

	@Override
	public String toString() {
		return String.format(
				"\n Car's make: %s\n Car's color: %s\n Car's Model: %s\n License Number: %s\n Parking time: %s\n", make,
				color, model, licenseNumber, parkingTime);
	}

}
