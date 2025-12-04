package cse203.lab2.problem_1.serviceEstimate;

import cse203.lab2.problem_1.customer.Customer;
import cse203.lab2.problem_1.pet.Pet;

public class ServiceEstimate {
	private String serviceType;
	private Double tax;
	private Pet pet;
	private Customer customer;

	public ServiceEstimate(String serviceType, Double tax, Pet pet, Customer customer) {
		this.serviceType = serviceType;
		this.tax = tax;
		this.pet = pet;
		this.customer = customer;
	}

	public Integer getServiceCost() {
		if (serviceType.equalsIgnoreCase("grooming")) {
			return 200_000;
		} else if (serviceType.equalsIgnoreCase("vaccination")) {
			return 150_000;
		} else if (serviceType.equalsIgnoreCase("spa")) {
			return 300_000;
		} else {
			return 100_000;
		}
	}

	public Integer getCareCharges() {
		if (pet.getBreed().equalsIgnoreCase("poodle")) {
			return 100_000;
		} else
			return 150_000;
	}

	public int getTotalcost() {
		return (int) Math.round((getServiceCost() + getCareCharges()) * (1 + tax));
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

}
