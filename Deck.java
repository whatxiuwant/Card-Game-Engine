package lpkg;

public class Deck {
	private Card[] deck;
	
	public Deck(int length) {
		deck = new Card[length];
	}
	
	public Card[] getDeck() {return deck;}
	
	public String toString() {
		String str = "";
		for (Card card : deck)
			str += card + "\n";
		return str;
	}

	public void set(int idx, Card card) {
		deck[idx] = card;
	}
}
