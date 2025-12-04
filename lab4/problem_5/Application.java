package cse203.lab4.problem_5;

import cse203.lab4.problem_5.courseGrade.CourseGrades;
import cse203.lab4.problem_5.essay.Essay;
import cse203.lab4.problem_5.finalExam.FinalExam;
import cse203.lab4.problem_5.gradeActivity.GradeActivity;
import cse203.lab4.problem_5.passFailExam.PassFailExam;

public class Application {
	public static void main(String[] args) {
		GradeActivity lab = new GradeActivity();
		lab.setScore(85.0);
		PassFailExam passFailExam = new PassFailExam(20);
		Essay essay = new Essay();
		essay.setScore(25, 18, 17, 20);
		FinalExam finalExam = new FinalExam(50);
		CourseGrades course = new CourseGrades();
		course.setLab(lab);
		course.setPassFailExam(passFailExam);
		course.setEssay(essay);
		course.setFinalExam(finalExam);
		System.out.println(course);
	}
}