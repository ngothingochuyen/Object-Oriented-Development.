package cse203.lab4.problem_3.teamLeader;

import cse203.lab4.problem_3.productionWorker.ProductionWorker;

public class TeamLeader extends ProductionWorker {
	private Integer requiredTrainingHours;
	private Integer trainingHours;
	private Double bonus;

	public TeamLeader() {
		super();
		requiredTrainingHours = 0;
		trainingHours = 0;
		bonus = 0.0;
	}

	public TeamLeader(String name, String employeeNumber, String date, int shift, double payRate,
			Integer requiredTrainingHours, Integer trainingHours, Double bonus) {
		super(name, employeeNumber, date, shift, payRate);
		this.requiredTrainingHours = requiredTrainingHours;
		this.trainingHours = trainingHours;
		this.bonus = bonus;
	}

	public void setRequiredTrainingHours(Integer requiredTrainingHours) {
		this.requiredTrainingHours = requiredTrainingHours;
	}

	public Integer getRequiredTrainingHours() {
		return requiredTrainingHours;
	}

	public void setTrainingHours(Integer trainingHours) {
		this.trainingHours = trainingHours;
	}

	public Integer getTrainingHours() {
		return trainingHours;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return String.format("Required training hours: %s\nLeader's training hours: %s\nBonus: %s",
				requiredTrainingHours, trainingHours, bonus);
	}

}
