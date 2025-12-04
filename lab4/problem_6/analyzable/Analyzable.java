package cse203.lab4.problem_6.analyzable;

import cse203.lab4.problem_6.gradeActivity.GradeActivity;

public interface Analyzable
{
   double getAverage();
   GradeActivity getHighest();
   GradeActivity getLowest();
}