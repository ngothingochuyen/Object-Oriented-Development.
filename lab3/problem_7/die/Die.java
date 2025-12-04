package cse203.lab3.problem_7.die;

import java.util.Random;

public class Die {
	private int sides;
	private int value;

	public Die() {
		sides = 0;
	}

	public Die(int sides) {
		this.sides = sides;
		roll();
	}

	public void roll() {
		Random random = new Random();
		value = random.nextInt(sides) + 1;
	}

	public int getSides() {
		return sides;
	}

	public int getValue() {
		return value;
	}
}