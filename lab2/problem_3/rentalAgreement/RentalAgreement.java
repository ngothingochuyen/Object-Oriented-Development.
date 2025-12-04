package cse203.lab2.problem_3.rentalAgreement;

import cse203.lab2.problem_3.car.Car;
import cse203.lab2.problem_3.customer.Customer;

public class RentalAgreement {
    private Double baseFee;
    private Double applicableMileage;
    private Double tax;
    private Car car;
    private Customer customer;
    
	public RentalAgreement(Double baseFee, Double applicableMileage, Double tax, Car car, Customer customer) {
        this.baseFee = baseFee;
        this.applicableMileage = applicableMileage;
        this.tax = tax;
        this.car = car;
        this.customer = customer;

    }

    public Double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(Double baseFee) {
        this.baseFee = baseFee;
    }

    public Double getApplicableMileage() {
        return applicableMileage;
    }

    public void setApplicableMileage(Double applicableMileage) {
        this.applicableMileage = applicableMileage;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getTotalcost() {
        return (int) Math.round((getBaseFee() + getApplicableMileage() * 50) * (1 + tax));
    }
}
