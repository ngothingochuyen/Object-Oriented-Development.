package lab6.problem5;

public class Order {
	private String id;
	private double amount;

	public Order(String id, double amount) {
		this.id = id;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public double getAmount() {
		return amount;
	}

	public void showDetails() {
		System.out.println("Order ID: " + id);
		System.out.println("Order Amount: " + amount);
	}
}
