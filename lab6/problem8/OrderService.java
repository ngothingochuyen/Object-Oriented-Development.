package lab6.problem8;

import java.time.LocalDate;

public class OrderService {
	private String id;
	private LocalDate processDate;
	private Discount discount;
	private PaymentMethod payment;
	private DeliveryMethod delivery;

	public OrderService() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getProcessDate() {
		return processDate;
	}

	public void setProcessDate(LocalDate processDate) {
		this.processDate = processDate;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public PaymentMethod getPayment() {
		return payment;
	}

	public void setPayment(PaymentMethod payment) {
		this.payment = payment;
	}

	public DeliveryMethod getDelivery() {
		return delivery;
	}

	public void setDelivery(DeliveryMethod delivery) {
		this.delivery = delivery;
	}

	public void process(Order order) {
		double subtotal = order.getSubTotal();
		double discounted = discount.execute(subtotal);
		payment.pay(discounted);
		delivery.process(order.getId());
	}
}
