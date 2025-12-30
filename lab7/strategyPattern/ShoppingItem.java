package lab7.strategyPattern;

public class ShoppingItem {
	private String description;
	private double cost;

	public ShoppingItem(String description, double cost) {
		this.cost = cost;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public double getCost() {
		return cost;
	}

}
