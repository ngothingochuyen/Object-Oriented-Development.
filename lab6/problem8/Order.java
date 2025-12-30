package lab6.problem8;

import java.time.LocalDate;
import java.util.*;

public class Order {
	private String id;
	private LocalDate orderDate;
	private Customer c;
	private Map<MenuItem, Integer> items = new HashMap<>();

	public Order() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return c;
	}

	public void setCustomer(Customer c) {
		this.c = c;
	}

	public Map<MenuItem, Integer> getItems() {
		return items;
	}

	public void setItems(Map<MenuItem, Integer> items) {
		this.items = items;
	}

	public void addMenuItem(MenuItem m) {
		items.put(m, items.getOrDefault(m, 0) + 1);
	}

	public void removeMenuItem(MenuItem m) {
		items.remove(m);
	}

	public double getSubTotal() {
		return items.entrySet().stream().mapToDouble(e -> e.getKey().getPrice() * e.getValue()).sum();
	}

	public void showDetails() {
		System.out.println("===== ORDER DETAILS =====");
		System.out.println("Order ID: " + id);
		System.out.println("Order Date: " + orderDate);
		System.out.println("Customer: " + c.getName() + " (" + c.getEmail() + ")");
		System.out.println("Phone: " + c.getPhoneNumber());
		System.out.println("\nItems:");
		for (Map.Entry<MenuItem, Integer> entry : items.entrySet()) {
			MenuItem m = entry.getKey();
			int qty = entry.getValue();
			System.out.println("- " + m.getName() + " x" + qty + " @ " + m.getPrice() + " each");
		}
		System.out.println("Subtotal: " + getSubTotal());
		System.out.println("=========================");
	}
}
