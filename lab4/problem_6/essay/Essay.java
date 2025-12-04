package cse203.lab4.problem_6.essay;

import cse203.lab4.problem_6.gradeActivity.GradeActivity;

public class Essay extends GradeActivity {
	private double grammar;
	private double spelling;
	private double correctLength;
	private double content;

	public void setScore(double grammar, double spelling, double correctLength, double content) {
		setGrammar(grammar);
		setSpelling(spelling);
		setCorrectLength(correctLength);
		setContent(content);
		super.setScore(spelling + grammar + correctLength + content);
	}

	public void setGrammar(double grammar) {
		if (grammar <= 30) {
			this.grammar = grammar;
		} else
			this.grammar = 0.0;
	}

	public double getGrammar() {
		return grammar;
	}

	public void setSpelling(double spelling) {
		if (spelling <= 20) {
			this.spelling = spelling;
		} else
			this.spelling = 0.0;
	}

	public double getSpelling() {
		return spelling;
	}

	public void setCorrectLength(double correctLength) {
		if (correctLength <= 20) {
			this.correctLength = correctLength;
		} else
			this.spelling = 0.0;
	}

	public double getCorrectLength() {
		return correctLength;
	}

	public void setContent(double content) {
		if (content <= 30) {
			this.content = content;
		} else
			this.content = 0.0;
	}

	public double getContent() {
		return content;
	}

	@Override
	public Double getScore() {
		return grammar + spelling + correctLength + content;
	}

}
