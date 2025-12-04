package cse203.lab4.problem_5.passFailExam;

import cse203.lab4.problem_5.passFailActivity.PassFailActivity;

public class PassFailExam extends PassFailActivity {
	private int numMissed;

	public PassFailExam() {
		numMissed = 0;
	}

	public PassFailExam(int missed) {
		super();
		numMissed = missed;
		setScore(100.0 - (missed * 1.0));
	}

	public int getNumMissed() {
		return numMissed;
	}
}