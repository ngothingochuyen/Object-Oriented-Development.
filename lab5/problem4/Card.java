package lab5.problem4;

public class Card {
	private static String[] valueNames = { "Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Jack", "Queen", "King" };

	private static String[] suitNames = { "Hearts", "Diamonds", "Spades", "Clubs" };

	private int faceValue;
	private int cardSuit;

	public Card(int faceValue, int cardSuit) {
		this.cardSuit = cardSuit;
		this.faceValue = faceValue;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public int getSuit() {
		return cardSuit;
	}

	public String toString() {
		return String.format("Face value is: %-5s || Suit name is: %-10s" ,valueNames[faceValue], suitNames[cardSuit]);
	}
}