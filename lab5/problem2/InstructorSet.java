package lab5.problem2;

import java.util.*;

public class InstructorSet {
	private Set<Instructor> set;

	public InstructorSet() {
		set = new HashSet<>();
	}

	public void addInstructor(Instructor instructor) {
		set.add(instructor);
	}

	public void removeInstructor(Instructor instructor) {
		set.remove(instructor);
	}

	public void displayAll() {
		for (Instructor e : set) {
			System.out.println(" " + e);
		}
	}

	public boolean searchInstructor(Instructor instructor) {
		return set.contains(instructor);
	}

}
