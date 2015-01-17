package lpkg;
import java.util.*;
import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		File input = new File("Liar Deck.csv");
		Scanner scan = new Scanner(input);
		int length = 0;
		while (scan.hasNextLine()) {length++;}
		scan.close();
		Deck liarDeck = new Deck(length);
		int idx = 0;
		Scanner scan2 = new Scanner(input);
		while (scan.hasNextLine()) {
			String[] data = scan.nextLine().split(",");
			Card card = new Card(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
			liarDeck.set(idx, card);
			idx++;
		}
		scan2.close();
		System.out.println(liarDeck);
	}
}
