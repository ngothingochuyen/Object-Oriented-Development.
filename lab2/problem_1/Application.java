package cse203.lab2.problem_1;

import cse203.lab2.problem_1.customer.Customer;
import cse203.lab2.problem_1.pet.Pet;
import cse203.lab2.problem_1.serviceEstimate.ServiceEstimate;

//import cse203.lab2.problem_1.pet.P
public class Application {

	public static void main(String[] args) {
		Customer customer = new Customer("Huyen", "Tay Ninh", 12345, 1111);
		Pet pet = new Pet("Golden", 2, 3.5, customer, 2222);
		ServiceEstimate serviceEstimate = new ServiceEstimate("spa", 0.01, pet, customer);
		displaySe(serviceEstimate);
	}

	public static void displaySe(ServiceEstimate se) {
		System.out.println("Customer Info: " + se.getCustomer());
		System.out.println("Pet Info: " + se.getPet());
		System.out.println("Total Estimated Cost: " + se.getTotalcost());
		System.out.printf("\nDetail: \n Service: %s\n Service cost: %s\n Care charges: %s\n Tax: %s\n",
				se.getServiceType(), se.getServiceCost(), se.getCareCharges(), se.getTax());

	}

}
