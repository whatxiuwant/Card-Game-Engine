package lpkg;
import java.util.*;

public class Cards {
	private ArrayList<Card> cards;
	
	public Cards() {
		cards = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getCards() {return cards;}
	public int size() {return cards.size();}
	public Card get(int i) {return cards.get(i);}
	public void remove(int i) {cards.remove(i);}
	
	public String toString() {
		String str = "";
		int amt = 0;
		for (Card card : cards) {
			if (amt >= 4) {
				str += "\n";
				amt = 0;
			}
			
			str += getSpaces(18 - card.toString().length()) + card + " ";
			amt++;
		}
		return str;
	}
	
	public String getSpaces(int length) {
		String spaces = "";
		for (int i = 0; i < length; i++)
			spaces += " ";
		
		return spaces;
	}

	public void add(Card card) {
		cards.add(card);
	}
	
	public void drawCard(Cards deck, int amt) {
		for (int i = 0; i < amt; i++) {
			int tempIdx = (int) (Math.random() * deck.size());
			cards.add(deck.get(tempIdx));
			deck.remove(tempIdx);
		}
	}
	
	public String[] choices() {
		String[] strs = new String[70];
		
		return strs;
	}
}
