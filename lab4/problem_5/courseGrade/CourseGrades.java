package cse203.lab4.problem_5.courseGrade;

import cse203.lab4.problem_5.essay.Essay;
import cse203.lab4.problem_5.finalExam.FinalExam;
import cse203.lab4.problem_5.gradeActivity.GradeActivity;
import cse203.lab4.problem_5.passFailExam.PassFailExam;

public class CourseGrades {
	private GradeActivity[] grades;

	public CourseGrades() {
		grades = new GradeActivity[4];
	}

	public void setLab(GradeActivity lab) {
		grades[0] = lab;
	}

	public void setPassFailExam(PassFailExam passFailExam) {
		grades[1] = passFailExam;
	}

	public void setEssay(Essay essay) {
		grades[2] = essay;
	}

	public void setFinalExam(FinalExam finalExam) {
		grades[3] = finalExam;
	}

	public String toString() {
		return String.format("%-25s %-10s %-10s\n%-25s %-10s %-10s\n%-25s %-10s %-10s\n%-25s %-10s %-10s", "Lab Score:",
				grades[0].getScore(), grades[0].getGrade(), "Pass/Fail Exam Score:", grades[1].getScore(),
				grades[1].getGrade(), "Essay Score:", grades[2].getScore(), grades[2].getGrade(), "Final Exam Score:",
				grades[3].getScore(), grades[3].getGrade());
	}
}
