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
		Cards p1 = new Cards(); Cards p2 = new Cards();
		p1.drawCard(liarDeck, 2); p2.drawCard(liarDeck, 2);
		System.out.println(p1.getCards());
		System.out.println(p1.choices());
		Scanner scanPlay = new Scanner(System.in);
		
		while(isGameOver() == false) {
			int temp = scanPlay.nextInt();
			System.out.println(p1.choices(temp));
			System.out.println(p1.choice(temp));
			System.out.println(generateAITurn(p2));
		}
	}
	
	public static String generateAITurn(Cards player) {
		return player.choice((int) (Math.random() * player.choices().size()));
	}
	
	public static boolean isGameOver() {
		//when someone calls bull;
		//when someone has 6 cards, kick them;
		return false;
	}
}
