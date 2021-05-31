package studentWork.CardLab;

public class Deck {
	private Card[] newDeck;
	private int index;
	
	public Deck(String[] suits, int[] values) {
		index = 0;
		newDeck = new Card[suits.length];
		for(int i = 0; i < suits.length; i++) {
			Card tempCard = new Card(values[i], suits[i]);
			newDeck[i] = tempCard;
		}
	}
	
	public Deck() {
		newDeck = new Card[52];
		String _suit;
		index = 0;
		for(int i = 0; i < 4; i++) {
			if( i == 0) {
				_suit = "Spades";
			} else if (i == 1) {
				_suit = "Clubs";
			}else if (i == 2) {
				_suit = "Hearts";
			}else{
				_suit = "Diamonds";
			}
			for(int j = 0; j < 13; j++) {
				Card tempCard = new Card(j + 1, _suit);
				newDeck[index] = tempCard;
				index = index + 1;
			}
		}
		index = 0;
	}
	
	public boolean hasNext() {
		if(newDeck.length > index) {
		return true;
		} else {
			return false;
		}
	}
	
	public Card draw() {
		Card tempCard;
		tempCard = newDeck[index];
		index = index + 1;
		return tempCard;
	}
	
	public String toString() {
		
		return "A deck with " + newDeck.length + " cards. The next card is the " + newDeck[index].toString();
	}
	
	public void shuffle() {
		CardShuffler shuffler = new CardShuffler();
		newDeck = shuffler.shuffle(newDeck);
	}
	
}
