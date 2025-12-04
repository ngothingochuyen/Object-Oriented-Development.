package cse203.lab4.problem_5.finalExam;

import cse203.lab4.problem_5.gradeActivity.GradeActivity;

public class FinalExam extends GradeActivity {
	private final int NUMBER_QUESTIONS = 50;
	private int numMissed;

	public FinalExam() {
		numMissed = 0;
	}

	public FinalExam(int missed) {
		numMissed = missed;
		setScore(100.0 - (missed * (NUMBER_QUESTIONS / 100.0)));
	}

	public void setNumMissed(int missed) {
		numMissed = missed;
	}

	public int getNumMissed() {
		return numMissed;
	}
}
