package cse203.lab4.problem_1.productionWorker;

import cse203.lab4.problem_1.employee.Employee;

public class ProductionWorker extends Employee {
	private Integer shift;
	private Double payRate;

	public ProductionWorker() {
		super();
		shift = 0;
		payRate = 0.0;
	}

	public ProductionWorker(String name, String employeeNumber, String date, int shift, double payRate) {
		super(name, employeeNumber, date);
		this.shift = shift;
		setPayRate(payRate);
	}

	public void setShift(Integer shift) {
		this.shift = shift;
	}

	public Integer getShift() {
		return shift;
	}

	public void setPayRate(Double payRate) {
		if (this.shift == 1) {
			this.payRate = payRate;
		} else
			this.payRate = payRate * 3;
	}

	public Double getPayRate() {
		return payRate;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		String outPut = "Employee shift is: ";
		if (this.shift == 1) {
			outPut += "Day shift || ";
		} else {
			outPut += "Night shift || ";
		}
		outPut += "Employee hourly pay rate is: " + payRate;
		return outPut;
	}

}
