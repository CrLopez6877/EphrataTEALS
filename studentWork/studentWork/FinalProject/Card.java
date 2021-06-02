package studentWork.FinalProject;
public class Card {
	private String suit;
	private int value;

	public Card(int _value,String _suit) {
		suit = _suit;
		value = _value;
	}
	
	//change this to any value over 10 returns a value of 10 for blackjack
	public int getValue() {
		int tempValue = value;
		if (value > 10) {
			tempValue = 10;
		} 
		return tempValue;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public String toString() {
		String nameValue;
		if(value == 1) {
			nameValue = "Ace";
		} else if (value == 11) {
			nameValue = "Jack";
		} else if (value == 12) {
			nameValue = "Queen";
		} else if (value == 13) {
			nameValue = "King";
		} else {
			nameValue = Integer.toString(value);
		}
		
		
		return nameValue + " of " + suit;
	}
	
}
