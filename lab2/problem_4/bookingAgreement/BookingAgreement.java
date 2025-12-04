package cse203.lab2.problem_4.bookingAgreement;

import cse203.lab2.problem_4.customer.Customer;
import cse203.lab2.problem_4.session.Session;

public class BookingAgreement {
	private Double edittingFee;
	private Session session;
	private Customer customer;
	private Double tax;

	public BookingAgreement(Double edittingFee, Session session, Customer customer, Double tax) {
		this.edittingFee = edittingFee;
		this.session = session;
		this.customer = customer;
		this.tax = tax;
	}

	public Double getBaseFee() {
		String type = session.getType();
		if (type.equalsIgnoreCase("family")) {
			return 200.0;
		} else if (type.equalsIgnoreCase("wedding")) {
			return 300.0;
		} else if (type.equalsIgnoreCase("portrait")) {
			return 400.0;
		}
		return 100.0;
	}

	public Double getEdittingFee() {
		return edittingFee;
	}

	public void setEdittingFee(Double edittingFee) {
		this.edittingFee = edittingFee;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public int getTotalCost() {
		return (int) Math.round((getBaseFee() + getEdittingFee()) * (getTax() + 1));
	}

}
