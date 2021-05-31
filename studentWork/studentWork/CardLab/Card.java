package studentWork.CardLab;

public class Card {
	private String suit;
	private int value;

	public Card(int _value,String _suit) {
		suit = _suit;
		value = _value;
	}
	
	public int getValue() {
		return value;
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
