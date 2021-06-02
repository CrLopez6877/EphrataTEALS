package studentWork.FinalProject;
import java.util.Random;
import java.util.Scanner;
import studentWork.FinalProject.Stats;
import studentWork.FinalProject.Card;
import studentWork.FinalProject.Deck;
public class Client {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("*****BlackJack******");
		System.out.println("In this game the goal is to get as close to 21 as possible without going over.");
		System.out.println("In this version all face cards are worth 10 points and aces are worth 1 only.");
		System.out.println();
		System.out.println("directions: Press 1 to hit, Press 2 to stand, press 3 to play another hand, Press 4 to quit");
		
		Deck fullDeck = new Deck();
		Stats winStats = new Stats();
		fullDeck.shuffle();
		Card tempCard;
		int playerCardCount = 0;
		int computerCardCount = 0;
		int userInput = 1;
		//stands on 1, hits on 2
		int computerBrain;
		
		System.out.println("Would you like to play a hand? press 3");
		userInput = sc.nextInt();  
		while (userInput != 4) {
			//reset cardCounts
			playerCardCount = 0;
			computerCardCount = 0;
			
			//drawing initial two cards for computer
			for (int i = 0; i < 2; i++) {
			if(fullDeck.hasNext() == true) {
				tempCard = fullDeck.draw();
			} else {
				fullDeck.reset();
				tempCard = fullDeck.draw();
			}
			computerCardCount = computerCardCount + tempCard.getValue();
			System.out.println("The computer drew a " + tempCard.toString() + " current computer hand count is " + computerCardCount);
			
			}
			System.out.println();
			
			//drawing initial two cards for player
			for (int i = 0; i < 2; i++) {
				if(fullDeck.hasNext() == true) {
					tempCard = fullDeck.draw();
				} else {
					fullDeck.reset();
					tempCard = fullDeck.draw();
				}
				playerCardCount = playerCardCount + tempCard.getValue();
				System.out.println("You drew a " + tempCard.toString() + " current hand count is " + playerCardCount);
				
				}
			System.out.println();
			System.out.println("Would you like to hit(press 1) or stand (press 2)");
			userInput = sc.nextInt(); 
			
			//this while loop will determine how many cards the user wants to draw
			while(userInput != 2) {
				if(fullDeck.hasNext() == true) {
					tempCard = fullDeck.draw();
				} else {
					fullDeck.reset();
					tempCard = fullDeck.draw();
				}
				playerCardCount = playerCardCount + tempCard.getValue();
				System.out.println("You drew a " + tempCard.toString() + " current hand count is " + playerCardCount);
				
				if(playerCardCount > 21) {
					break;
				}
				System.out.println("Would you like to hit(press 1) or stand (press 2)");
				userInput = sc.nextInt(); 
				
			
			}
			
			System.out.println();
			if(playerCardCount > 21) {
				computerBrain = 1;
			} else if(computerCardCount < 17) {
				computerBrain = 2;
			} else {
				computerBrain = 1;
			}
			while(computerBrain == 2) {
				if(fullDeck.hasNext() == true) {
					tempCard = fullDeck.draw();
				} else {
					fullDeck.reset();
					tempCard = fullDeck.draw();
				}
				computerCardCount = computerCardCount + tempCard.getValue();
				System.out.println("The computer drew a " + tempCard.toString() + " current computer hand count is " + computerCardCount);
				
				if(playerCardCount > 21) {
					computerBrain = 1;
				} else if(computerCardCount < 17) {
					computerBrain = 2;
				} else {
					computerBrain = 1;
				}
			}
			System.out.println();
			System.out.println("Player hand is " + playerCardCount + ". Computer hand is " + computerCardCount + ".");
			if(playerCardCount > 21) {
				System.out.println("Player busts, you lose");
				winStats.incrementLoss();
				
			} else if (computerCardCount > 21) {
				System.out.println("Computer busts, you win");
				winStats.incrementWin();
			} else if (playerCardCount > computerCardCount) {
				System.out.println("you win");
				winStats.incrementWin();
			} else if (computerCardCount > playerCardCount) {
				System.out.println("you lose");
				winStats.incrementLoss();
			} else {
				System.out.println("Draw");
			}
			System.out.println();
			
			winStats.printResults();
			
			System.out.println("Would you like to play another hand? press 3 or press 4 to quit:");
			userInput = sc.nextInt(); 
		}
		
		
		
	}
}
