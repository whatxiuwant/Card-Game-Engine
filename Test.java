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
		//players class?
		Cards p1 = new Cards();
		Cards p2 = new Cards();
		Cards p3 = new Cards();
		Cards p4 = new Cards();
		p1.drawCard(liarDeck, 2);
		p2.drawCard(liarDeck, 2);
		p3.drawCard(liarDeck, 2);
		p4.drawCard(liarDeck, 2);
		String[] temp = new String[p1.choices().size()];
		for (int i = 0; i < p1.choices().size(); i++) {
			temp[i] = "" + i + " " + p1.choices().get(i);
			System.out.println(temp[i]);
		}
		Scanner scanPlay = new Scanner(System.in);
		int choice = scanPlay.nextInt();
		for (int i = 0; i < temp.length; i++)
			if (choice == Integer.parseInt(temp[i].substring(0, 1)))
				System.out.println(p1.choices().get(i));
	}
}
