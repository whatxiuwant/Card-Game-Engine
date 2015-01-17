package lpkg;

public class Card {
	private int rank;	
	private int suit;	//diamond = 0, club = 1; heart = 2, spade = 3;
	
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getRank() {return rank;}
	public int getSuit() {return suit;}
	
	public String toString() {
		String str = "";
		
		switch (rank) {
			case 11: str += "Jack"; break;
			case 12: str += "Queen"; break;
			case 13: str += "King"; break;
			case 14: str += "Ace"; break;
			case 15: str += "2"; break;
			default: str += rank; break;
		}
		str += " of ";
		switch (suit) {
			case 0: str += "diamonds"; break;
			case 1: str += "clubs"; break;
			case 2: str += "hearts"; break;
			case 3: str += "spades"; break;
		}
		
		return str;
	}
	
	//method cardValue() ? ex: 3 of diamonds , 3 * 1 (skip 0) = value of 3;
	
	public int compareTo(Card other) {
		if (this.rank > other.rank)
			return 1;
		else if (this.rank == other.rank) 
			if (this.suit > other.suit)
				return 1;
			else
				return -1;
		return -1;
	}
}
