package cse203.lab3.problem_1.description;

public class RetailItem {
	private String description;
	private Integer unitsOnHand;
	private Double price;

	public RetailItem() {
		description = "";
		unitsOnHand = 0;
		price = 0.0;
	}

	public RetailItem(String description, Integer unitsOnHand, Double price) {
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getUnitsOnHand() {
		return unitsOnHand;
	}

	public void setUnitsOnHand(Integer unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("\n Description: %s\n Units on Hand: %s\n Price: %s\n", description, unitsOnHand, price);
	}
}
