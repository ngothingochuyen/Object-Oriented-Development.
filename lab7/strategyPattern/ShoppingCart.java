package lab7.strategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<ShoppingItem> items;
	private PaymentStrategy paymentStrategy;

	public ShoppingCart() {
		items = new ArrayList<>();
	}

	public void addItem(ShoppingItem item) {
		items.add(item);
	}

	public double calculateTotal() {
		double total = 0;
		for (ShoppingItem item : items) {
			total += item.getCost();
		}
		return total;
	}

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void checkout() {
		double amount = calculateTotal();
		if (paymentStrategy == null) {
			System.out.println("Nothing!");
		} else {
			paymentStrategy.pay(amount);
		}
	}

}
