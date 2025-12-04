package lab5.problem4;

public class Application {
	public static void main(String[] args) {
		CardPlayer player = new CardPlayer();
		Deck deck = new Deck();
		deck.shuffle();
		for (int i = 1; i <= 5; i++)
			player.getCard(deck.deal());
		player.showCards();
	}
}
