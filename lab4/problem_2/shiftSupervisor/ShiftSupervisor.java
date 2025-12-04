package cse203.lab4.problem_2.shiftSupervisor;

import cse203.lab4.problem_2.employee.Employee;

public class ShiftSupervisor extends Employee {
	private double annualSalary;
	private int product;
	private double bonus;
	private final int GOAL = 200;

	public ShiftSupervisor() {
		super();
		annualSalary = 0.0;
		product = 0;

	}

	public ShiftSupervisor(String name, String employeeNumber, String date, double annualSalary, int product) {
		super(name, employeeNumber, date);
		this.annualSalary = annualSalary;
		this.product = product;
		setBonus(product);
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public void setBonus(int product) {
		if (product >= GOAL) {
			if (product - GOAL > 0) {
				this.bonus = (((product - GOAL) / 10 * 0.02) * annualSalary);
			} else {
				this.bonus = annualSalary * 0.02;
			}
		} else {
			this.bonus = 0.0;
		}
	}

	public int getProduct() {
		return product;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public double getBonus() {
		return bonus;
	}

	public double getTotalSalary() {
		return annualSalary + bonus;
	}

	@Override
	public String toString() {
		System.out.print(super.toString());
		return String.format(
				"\n Employee's annual salary is: %s\n Number of the product is: %s\n Employee's bonus is: %s\n Employee total salary is: %s",
				annualSalary, product, bonus, getTotalSalary());

	}

}
