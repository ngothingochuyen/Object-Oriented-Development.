package cse203.lab2.problem_2;

import cse203.lab2.problem_2.cake.Cake;
import cse203.lab2.problem_2.customer.Customer;
import cse203.lab2.problem_2.priceQuote.PriceQuote;

public class Application {

	public static void main(String[] args) {
		Customer customer = new Customer("Huyen", "Tay Ninh", 12345, 1111);
		Cake cake = new Cake("Chocolate", 3, java.time.LocalDate.of(2025, 10, 15));
		PriceQuote priceQuote = new PriceQuote(500.0, 200.0, 50.0, 0.07, cake, customer);
		displayPriceQuote(priceQuote);
	}

	public static void displayPriceQuote(PriceQuote quote) {
		System.out.println("Customer Info: " + quote.getCustomer());
		System.out.println("Cake Info: " + quote.getCake());
		System.out.println("Total Price Quote: " + quote.getTotalcost());
		System.out.printf("\nDetail: \n Ingredient Cost: %s\n Labor Charges: %s\n Delivery Fee: %s\n Tax: %s\n",
				quote.getIngredientCost(), quote.getLaborCharges(), quote.getDeliveryFee(), quote.getTax());

	}
}
