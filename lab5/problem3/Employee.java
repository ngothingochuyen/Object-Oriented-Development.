package lab5.problem3;

import java.util.*;

public class Employee {
	private String id;
	private String name;
	public Employee(String id, String name) {
		this.id=id;
		this.name=name;
	}
	public Employee() {
		id="";
		name="";
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return id+" "+ name;
	}

}
