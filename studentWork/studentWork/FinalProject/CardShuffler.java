package studentWork.FinalProject;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import studentWork.FinalProject.Card;

public class CardShuffler {
	public Card[] shuffle(Card[] array) {
		List<Card> list = Arrays.asList(array);
		Collections.shuffle(list);
		return list.toArray(array);
	}
	
	
}
