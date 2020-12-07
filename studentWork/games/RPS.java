package studentWork.games;
import java.util.Scanner;  // Import the Scanner class
public class RPS {
   public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       // Prompt for User Choice
       System.out.print("Choose Rock, Paper, or Scissors; To end enter Quit: ");
       String userChoice = console.next().toLowerCase();    
       double computerChoice = Math.random();
       String computerChoiceString = "";
 
       if (computerChoice < 0.34) {
           computerChoiceString = "rock";
       } else if(computerChoice <= 0.67) {
           computerChoiceString = "paper";
       } else {
           computerChoiceString = "scissors";
       }
       String winner = whoWon(userChoice,computerChoiceString);
	System.out.println(winner);     
   }
   public static String whoWon(String choice1, String choice2) {
        if (choice1.equals (choice2)){
            return "The result is a tie!";

        }
        else if (choice2.equals ("rock") && (choice1.equals ("scissors"){ 
            return "Rock crushes Scissors: Computer wins";
        }
        else if (choice1.equals ("rock") && (choice2.equals ("scissors"){ 
            return "Rock crushes Scissors: You win!";       
	}   else if ()
}

/*The result is a tie!
Rock crushes Scissors: Computer wins
Rock crushes Scissors: You win!
Paper covers Rock: Computer wins
Paper covers Rock: You win!
Scissors cut Paper: Computer wins
Scissors cut Paper: You win!*/
