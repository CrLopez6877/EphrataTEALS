package studentWork.CardLab;
import java.util.Random;

public class Client {
    


    public static void main(String[] args) {
		Card card1 = new Card(12, "Diamonds");
		Card card2 = new Card(5, "Hearts");
		Card card3 = new Card(1, "Clubs");
		System.out.println(card1.toString() + ", " + card2.toString() + ", " + card3.toString());
		
		
		//Create a deck with only values 4-6 and suits of hearts and spades
		String[] suits = {"Hearts", "Hearts", "Hearts", "Spades", "Spades", "Spades"};
		int[] values = {4, 5, 6, 4, 5, 6};
		
		Deck customDeck = new Deck(suits, values);
		customDeck.shuffle();
		while(customDeck.hasNext() == true) {
			Card tempCard;
			tempCard = customDeck.draw();
			System.out.println(tempCard.toString());
		}
		
		
		Deck fullDeck = new Deck();
		fullDeck.shuffle();
		Card compare1 = fullDeck.draw();
		Card compare2 = fullDeck.draw();
		
		if(compare1.getValue() > compare2.getValue()) {
			System.out.println(compare1.toString());
		} else {
			System.out.println(compare2.toString());
		}
	}
}
