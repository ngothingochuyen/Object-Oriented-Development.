package cse203.lab2.problem_3.car;

public class Car {
	private String model;
	private String make;
	private Integer rentalPeriod;
	private Double mileageLimit;

	public Car(String model, String make, Integer rentalPeriod, Double mileageLimit) {
		this.model = model;
		this.make = make;
		this.rentalPeriod = rentalPeriod;
		this.mileageLimit = mileageLimit;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Integer getRentalPeriod() {
		return rentalPeriod;
	}

	public void setrentalPeriod(Integer rentalPeriod) {
		this.rentalPeriod = rentalPeriod;
	}

	public Double getMileageLimit() {
		return mileageLimit;
	}

	public void setMileageLimit(Double mileageLimit) {
		this.mileageLimit = mileageLimit;
	}

	@Override
	public String toString() {
		return String.format("\n Model: %s\n Make: %s\n Rental Period: %s\n Mileage Limit: %s\n", model, make,
				rentalPeriod, mileageLimit);
	}

}
