package lab5.problem4;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<>();

		for (int suit = 0; suit <= 3; suit++) {
			for (int face = 0; face <= 13; face++)
				cards.add(new Card(face, suit));
		}
		shuffle();
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card deal() {
		if (cards.size() > 0)
			return cards.remove(0);
		else
			return null;
	}
}