package lab5.problem3;

import java.util.*;

public class EmployeeMap {
	private Map<String, Employee> map;

	public EmployeeMap() {
		map = new HashMap<>();
	}

	public void addEmployee(Employee e) {
		map.put(e.getId(), e);
	}

	public Employee findId(String id) {
		return map.get(id);
	}

	public void displayAll() {
		if (map.isEmpty()) {
			System.out.println("No employees.");
			return;
		}

		System.out.println(" Employee list:");
		for (Employee e : map.values()) {
			System.out.println("  "+e);
		}
	}

}
