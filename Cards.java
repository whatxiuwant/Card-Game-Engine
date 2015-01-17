package lpkg;
import java.util.*;

public class Cards {
	private ArrayList<Card> cards;
	
	public Cards() {
		cards = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getCards() {return cards;}
	
	public String toString() {
		String str = "";
		for (Card card : cards)
			str += card + "\n";
		return str;
	}

	public void add(Card card) {
		cards.add(card);
	}
}
