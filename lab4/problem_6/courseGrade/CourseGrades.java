package cse203.lab4.problem_6.courseGrade;

import cse203.lab4.problem_6.analyzable.Analyzable;
import cse203.lab4.problem_6.essay.Essay;
import cse203.lab4.problem_6.finalExam.FinalExam;
import cse203.lab4.problem_6.gradeActivity.GradeActivity;
import cse203.lab4.problem_6.passFailExam.PassFailExam;

public class CourseGrades implements Analyzable {
	public final int NUM_GRADES = 4;
	private GradeActivity[] grades;

	public CourseGrades() {
		grades = new GradeActivity[NUM_GRADES];
	}

	public void setLab(GradeActivity aLab) {
		grades[0] = aLab;
	}

	public void setPassFailExam(PassFailExam pFExam) {
		grades[1] = pFExam;
	}

	public void setEssay(Essay essay) {
		grades[2] = essay;
	}

	public void setFinalExam(FinalExam finalExam) {
		grades[3] = finalExam;
	}

	public double getAverage() {
		double total = 0.0, average;

		for (int i = 0; i < grades.length; i++) {
			total += grades[i].getScore();
		}

		average = total / grades.length;
		return average;
	}

	public GradeActivity getHighest() {
		double highScore;
		int index;
		highScore = grades[0].getScore();
		index = 0;
		for (int i = 1; i < grades.length; i++) {
			if (grades[i].getScore() > highScore) {
				highScore = grades[i].getScore();
				index = i;
			}
		}

		return grades[index];
	}

	public GradeActivity getLowest() {
		double lowScore;
		int index;
		lowScore = grades[0].getScore();
		index = 0;

		for (int i = 1; i < grades.length; i++) {
			if (grades[i].getScore() < lowScore) {
				lowScore = grades[i].getScore();
				index = i;
			}
		}

		return grades[index];
	}

	public String toString() {
		return String.format("%-25s %-10s %-10s\n%-25s %-10s %-10s\n%-25s %-10s %-10s\n%-25s %-10s %-10s", "Lab Score:",
				grades[0].getScore(), grades[0].getGrade(), "Pass/Fail Exam Score:", grades[1].getScore(),
				grades[1].getGrade(), "Essay Score:", grades[2].getScore(), grades[2].getGrade(), "Final Exam Score:",
				grades[3].getScore(), grades[3].getGrade());
	}
}
