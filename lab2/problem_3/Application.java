package cse203.lab2.problem_3;

import cse203.lab2.problem_3.car.Car;
import cse203.lab2.problem_3.customer.Customer;
import cse203.lab2.problem_3.rentalAgreement.RentalAgreement;

public class Application {

	public static void main(String[] args) {
		Customer customer = new Customer("Huyen", "Tay Ninh", "Ntnh1234", 1111);
        Car car = new Car("Civic", "Honda", 7, 500.0);
        RentalAgreement rentalAgreement = new RentalAgreement(300.0, 20.0, 0.1, car, customer);
        display(rentalAgreement);
	}

	public static void display(RentalAgreement rentalAgreement) {
        System.out.println("Customer Info: " + rentalAgreement.getCustomer());
        System.out.println("Car Info: " + rentalAgreement.getCar());
        System.out.println("Total cost: " + rentalAgreement.getTotalcost());
        System.out.printf("\nDetail: \n BaseFee: %s\n Applicable Mileage: %s\n Applicable Mileage Fee: %s\n Tax: %s\n", rentalAgreement.getBaseFee(),
                rentalAgreement.getApplicableMileage(), rentalAgreement.getApplicableMileage() * 50, rentalAgreement.getTax());

    }
}
