package cse203.lab2.problem_0;

public class Employee {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmner");
		Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		System.out.printf("%-17s%-13s%-20s%-20s%n", "Name", "ID Number", "Department", "Position");
		System.out.printf("%-70s%n", "_________________________________________________________________");
		displayEmployee(emp1);
		displayEmployee(emp2);
		displayEmployee(emp3);

	}

	private String name;
	private Integer idNumber;
	private String department;
	private String position;

	public Employee(String name, Integer idNumber, String department, String position) {
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}

	public Employee(String name, Integer idNumber) {
		this.name = name;
		this.idNumber = idNumber;
		this.department = "";
		this.position = "";
	}

	public Employee() {
		this.name = "";
		this.idNumber = 0;
		this.department = "";
		this.position = "";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(Integer idNumber) {
		this.idNumber = idNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setdepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.name = position;
	}

	public static void displayEmployee(Employee emp) {
		System.out.printf("%-17s%-13d%-20s%-20s%n", emp.getName(), emp.getIdNumber(), emp.getDepartment(),
				emp.getPosition());
	}
}
