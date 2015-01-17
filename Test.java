package lpkg;
import java.util.*;
import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		File input = new File("Liar_Deck.csv");

		Scanner scan = new Scanner(input);
		Cards liarDeck = new Cards();
		
		while (scan.hasNextLine()) {
			String[] data = scan.nextLine().split(",");
			Card card = new Card(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
			liarDeck.add(card);
		}
		
		scan.close();
		
		System.out.println(liarDeck);
	}
}
