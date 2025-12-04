package cse203.lab3.problem_2.cashRegister;

import cse203.lab3.problem_2.description.RetailItem;

public class CashRegister {
	private Double taxRate = 0.06;
	private Double retail;
	private Integer quantity;

	public CashRegister() {
		quantity = 0;
		retail = 0.0;
	}

	public CashRegister(RetailItem retailItem, Integer quantity) {
		this.quantity = quantity;
		this.retail = retailItem.getPrice();
	}

	public Double getSubtotal() {
		return quantity * retail;
	}

	public Double getTax() {
		return taxRate;
	}

	public Double getTotal() {
		return getSubtotal() * (getTax() + 1);
	}

	@Override
	public String toString() {
		return String.format("\n Subtotal: %s\n Sales tax: %s\n Total: %s\n", getSubtotal(), getTax(), getTotal());
	}
}
