package cse203.lab2.problem_1.pet;

import cse203.lab2.problem_1.customer.Customer;

public class Pet {
	private String breed;
	private Integer age;
	private Double weight;
	private Customer owner;
	private Integer petId;

	public Pet(String breed, Integer age, Double weight, Customer owner, Integer petId) {
		this.breed = breed;
		this.age = age;
		this.weight = weight;
		this.owner = owner;
		this.petId = petId;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	@Override
	public String toString() {
		return String.format("\n Breed: %s\n Age: %d\n Weight: %s\n Pet ID: %d\n", breed, age, weight, petId);
	}
//	thay vì dùng toString thì dùng cái này để in
//	public String printInfo() {
//		return "...";
//	}
}
