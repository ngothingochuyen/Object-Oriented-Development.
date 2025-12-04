package lab5.problem3;

import java.util.*;

public class Application {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        EmployeeMap employeeMap = new EmployeeMap();
        employeeMap.addEmployee(new Employee("H001", "Huyen"));
        employeeMap.addEmployee(new Employee("H002", "Tran"));
        employeeMap.addEmployee(new Employee("H003", "Ha"));
		System.out.println("Add employee:");
        employeeMap.displayAll();
		System.out.println("--------------");
		System.out.println("Lookup ID:");
        String id = sc.nextLine();
        Employee check = employeeMap.findId(id);
        if(check==null) {
        	System.out.println(" Can not find this ID!");
        }else {
        	System.out.printf("The ID: %s contained in map!\n",id);
        }
		System.out.println("--------------");
	
	}

}
