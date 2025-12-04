package cse203.lab2.problem_2.customer;

public class Customer {
	private String name;
	private String address;
	private Integer phoneNumber;
	private Integer cusId;

	public Customer(String name, String address, Integer phoneNumber, Integer cusId) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
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

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getCusId() {
		return cusId;
	}

	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	@Override
	public String toString() {
		return String.format("\n Name: %s\n Address: %s\n Customer ID: %d\n Phone: %d\n", name, address, cusId,
				phoneNumber);
	}
}
