package lab5.problem2;

import java.util.*;

public class Instructor {
	private String id;
	private String name;
	private String department;

	public Instructor(String id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public Instructor() {
		id = "";
		name = "";
		department = "";
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public boolean equals(Object e) {
		if (this == e)
			return true;
		if (e == null || getClass() != e.getClass())
			return false;
		Instructor that = (Instructor) e;
		return Objects.equals(id, that.id) || Objects.equals(name, that.name)
				|| Objects.equals(department, that.department);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, department);
	}

	@Override
	public String toString() {
		return id + " - " + name + " - " + department;
	}

}
