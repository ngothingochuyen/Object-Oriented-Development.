package lab6.problem8;

public class BikeDelivery implements DeliveryMethod {
	public void process(String orderID) {
		System.out.println("Delivering order " + orderID + " by bike.");
	}
}
