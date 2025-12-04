package cse203.lab2.problem_4;

import cse203.lab2.problem_4.bookingAgreement.BookingAgreement;
import cse203.lab2.problem_4.customer.Customer;
import cse203.lab2.problem_4.session.Session;

public class Application {
	public static void main(String[] args) {
		Customer customer = new Customer("Huyen", "Tay Ninh", 12345, 1111);
		Session session = new Session("family", 3, java.time.LocalDate.of(2025, 10, 15));
		BookingAgreement bookingAgreement = new BookingAgreement(200.0, session, customer, 0.01);
		display(bookingAgreement);

	}

	public static void display(BookingAgreement bk) {
		System.out.println("Customer info: " + bk.getCustomer());
		System.out.println("Session info: " + bk.getSession());
		System.out.println("Total booking agreement: " + bk.getTotalCost());
		System.out.printf("\nDetail: \n Base Fee: %s\n Editting Fee: %s\n Tax: %s\n", bk.getBaseFee(),
				bk.getEdittingFee(), bk.getTax());

	}

}
