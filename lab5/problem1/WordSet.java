package lab5.problem1;

import java.util.*;

public class WordSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        SortedSet<String> set = new TreeSet<String>();
		String input = sc.nextLine();
		String[] tokens = input.split(" ");
		for (String e : tokens) {
			set.add(e);
		}
		for (String e : set)
			System.out.println(e);
	}

}
