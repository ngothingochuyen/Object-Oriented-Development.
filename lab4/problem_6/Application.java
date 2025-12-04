package cse203.lab4.problem_6;

import cse203.lab4.problem_6.courseGrade.CourseGrades;
import cse203.lab4.problem_6.essay.Essay;
import cse203.lab4.problem_6.finalExam.FinalExam;
import cse203.lab4.problem_6.gradeActivity.GradeActivity;
import cse203.lab4.problem_6.passFailExam.PassFailExam;

public class Application {
	public static void main(String[] args) {
		GradeActivity lab = new GradeActivity();
		lab.setScore(85);
		PassFailExam passFailexam = new PassFailExam(20, 3, 70);
		Essay essay = new Essay();
		essay.setScore(25, 18, 17, 20);
		FinalExam finalExam = new FinalExam(50, 10);
		CourseGrades course = new CourseGrades();
		course.setLab(lab);
		course.setPassFailExam(passFailexam);
		course.setEssay(essay);
		course.setFinalExam(finalExam);
		System.out.println(course);
		System.out.println("Average score: " + course.getAverage());
		GradeActivity highItem = course.getHighest();
		System.out.println("Highest score: " + highItem.getScore());
		GradeActivity lowItem = course.getLowest();
		System.out.println("Lowest score: " + lowItem.getScore());
	}
}