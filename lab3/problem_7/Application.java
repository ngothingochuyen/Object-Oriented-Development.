package cse203.lab3.problem_7;

import java.util.Scanner;
import cse203.lab3.problem_7.die.Die;
import cse203.lab3.problem_7.player.Player;

public class Application {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Die die = new Die(6);
		Player player_1 = new Player("Huyen", 50);
		Player player_2 = new Player("Thang", 50);
		while (isPlaying(player_1, player_2)) {
			takeTurn(player_1, die);
			if (isPlaying(player_1, player_2)) {
				takeTurn(player_2, die);
			}
		}
		winner(player_1, player_2);
	}

	public static boolean isPlaying(Player player_1, Player player_2) {
		boolean flag = false;

		if (player_1.getPoint() != 1 && player_2.getPoint() != 1) {
			flag = true;
		}

		return flag;
	}

	public static void takeTurn(Player player, Die die) {
		System.out.println();
		System.out.println(player.getName() + "'s turn.");
		die.roll();
		System.out.println(player.getName() + " rolled a " + die.getValue() + ".");
		if (player.getPoint() - die.getValue() < 1) {
			player.setPoint(player.getPoint() + die.getValue());
		} else {
			player.setPoint(player.getPoint() - die.getValue());
		}
		System.out.println(player.getName() + " has " + player.getPoint() + " points.");

	}

	public static void winner(Player player_1, Player player_2) {
		System.out.println();
		if (player_1.getPoint() == 1) {
			System.out.println(player_1.getName() + " is the winner!");
		} else {
			System.out.println(player_2.getName() + " is the winner!");
		}
	}

}
