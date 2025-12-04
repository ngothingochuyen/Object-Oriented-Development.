package cse203.lab2.problem_3.customer;

public class Customer {
	private String name;
	private String address;
	private String licenseNumber;
	private int cusId;

	public Customer(String name, String address, String licenseNumber, int cusId) {
		this.name = name;
		this.address = address;
		this.licenseNumber = licenseNumber;
		this.cusId = cusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setPhoneNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	@Override
	public String toString() {
		return String.format("\n Name: %s\n Address: %s\n Customer ID: %d\n License Number: %s\n", name, address, cusId,
				licenseNumber);
	}
}
