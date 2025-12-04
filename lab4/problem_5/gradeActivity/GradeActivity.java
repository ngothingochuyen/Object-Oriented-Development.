package cse203.lab4.problem_5.gradeActivity;

public class GradeActivity {
	private Double score;

	public void setScore(Double score) {
		this.score = score;
	}

	public Double getScore() {
		return score;
	}

	public char getGrade() {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 50) {
			return 'D';
		} else
			return 'F';
	}

}
