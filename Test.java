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
		
		final int PLAYERS = 4;
		//players class? not really ... cards is in a sense player;
		//player class with action methods, extend cards;
		Cards p1 = new Cards(); Cards p2 = new Cards();	Cards p3 = new Cards(); Cards p4 = new Cards();
		p1.drawCard(liarDeck, 2); p2.drawCard(liarDeck, 2); p3.drawCard(liarDeck, 2); p4.drawCard(liarDeck, 2);
		System.out.println(liarDeck.choices());
		Scanner scanPlay = new Scanner(System.in);
		p1.choice(scanPlay.nextInt());
	}
}
