package cse203.lab4.problem_1.employee;

public class Employee {
	private String name;
	private String employeeNumber;
	private String date;

	public Employee(String name, String employeeNumber, String date) {
		this.name = name;
		setEmployeeNumber(employeeNumber);
		this.date = date;
	}

	public Employee() {
		name = "";
		employeeNumber = "";
		date = "";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private void setEmployeeNumber(String employeeNumber) {
		if (checkEmployeeNumber(employeeNumber))
			this.employeeNumber = employeeNumber;
		else
			this.employeeNumber = null;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public Boolean checkEmployeeNumber(String employeeNumber) {
//		Boolean check = true;
//		if (employeeNumber.length() != 5) {
//			check = false;
//		} else {
//			if ((!Character.isDigit(employeeNumber.charAt(0))) || (!Character.isDigit(employeeNumber.charAt(1)))
//					|| (!Character.isDigit(employeeNumber.charAt(2))) || (employeeNumber.charAt(3) != '-')
//					|| (!Character.isLetter(employeeNumber.charAt(4)))) {
//				check = false;
//			}
//		}
//		return check;
		
		if(employeeNumber.matches("\\d{3}-[A-M]")) {
			return true;
		}else {
			return false;
		}

	}

	@Override
	public String toString() {
		String outPut = "Employee name is: " + name + " || Employee Number is: ";
		if (employeeNumber != null) {
			outPut += employeeNumber;
		} else {
			outPut += " Eployee Number is WRONG!!! ";
		}
		return outPut;
	}

}
