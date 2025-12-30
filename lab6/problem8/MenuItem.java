package lab6.problem8;

public class MenuItem {
	private String id;
	private String name;
	private double price;
	private int unitsOnHand;
	private String description;

	public MenuItem() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	public void setUnitsOnHand(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void showDetails() {
		System.out.println("- " + name + " (ID: " + id + ")");
		System.out.println("   Price: $" + price);
		System.out.println("   Units on hand: " + unitsOnHand);
		System.out.println("   Description: " + description);
	}
}
