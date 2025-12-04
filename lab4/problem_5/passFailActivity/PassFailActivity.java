package cse203.lab4.problem_5.passFailActivity;

import cse203.lab4.problem_5.gradeActivity.GradeActivity;

public class PassFailActivity extends GradeActivity {
	private final double PASSING_CORE = 70;

	public char getGrade() {
		if (super.getScore() >= PASSING_CORE)
			return 'P';
		else
			return 'F';
	}
}