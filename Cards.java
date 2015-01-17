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
	
	public ArrayList<String> choices() {
		ArrayList<String> strs = new ArrayList<String>();
		String[] types = {"Single", "Double", "Triple", "Straight", "Flush", "House",
				"Straight Flush", "4 of a Kind", "5 of a Kind", "Royal Flush",
				"6 of a Kind", "7 of a Kind", "Dragon", "8 of a Kind", "Double Dragon"};
		String[] rankTypes = {"", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] suitTypes = {"Diamond", "Heart", "Club", "Spade"};
		String[] straightTypes = {"up to 5", "up to 6", "up to 7", "up to 8", "up to 9", "up to 10", "up to Jack", "up to Queen", "up to King", "up to Ace", "up to 2"};
		//updates: specificity with types and houses;
		strs.add("0 View Cards");
		strs.add("1 Bull");
		for (int i = 2; i < types.length + 2; i++) {
				strs.add(i + " " + types[i - 2]);
		/*
			for (int j = 0; j < rankTypes.length; j++) {
				strs[idx] = types[i] + " " + rankTypes[j];
				idx++;
		}*/}
				
		
		return strs;
	}
	
	public String choice(int choice) {
		for (int i = 0; i < choices().size(); i++)
			if (choice == Integer.parseInt(choices().get(i).substring(0, 1))) {
				return choices().get(i);
				//return;
			}
		
		return "Invalid choice.";
	}
}
