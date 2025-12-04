package cse203.lab3.problem_7.player;

public class Player {
	private String name;
	private int points;

	public Player() {
		name = "";
		points = 0;
	}

	public Player(String name, int points) {
		this.name = name;
		this.points = points;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPoint(int points) {
		this.points = points;
	}

	public int getPoint() {
		return points;
	}
}