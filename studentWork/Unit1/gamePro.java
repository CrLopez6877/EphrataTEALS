package studentWork.Unit1;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.Random;

public class gamePro {
    public static void gameRules() {
        System.out.println("********************************************");
        System.out.println("How to play:");
        System.out.println("1. Guess a letter to fill in the blank");
        System.out.println("2. If you guess the wrong letter 6 times, you lose");
        System.out.println("3. All letters must be typed in lower case");
        System.out.println("4. Guess every letter correct within 6 incorrect guesses to win");
        System.out.println();

    }

    //method that takes in the character array for the word, character array for the blanked out word, and integer of wrong guesses
    //returns incorrect guesses increased by 1
    public static int wrongNumberGuesses(char[] character, char[] emptyWord, int wrongGuesses){
        wrongGuesses = wrongGuesses + 1;
        return wrongGuesses;
    }

    //method to check for remaining number of blanks 
    public static int numberOfBlanksRemaining(char[] character, char[] emptyWord, String phrase, int remainingBlanks){

        for (int i = 0; i < phrase.length(); i++){
            if(emptyWord[i] != character[i]){
                remainingBlanks = remainingBlanks + 1;
            }
        }
        return remainingBlanks;
    }


    public static String startGame() {
        
        //creating an array of words for the game
        String wordBank[] = {"spongebob", "patrick", "squidward", "sandy", "plankton", "krabs", "larry", "gary", "pearl", "neptune"};
        
        //grab a random number using random() and use that as an int variable whenever we call our word from wordbank
        Random rand = new Random(); 
        int number = rand.nextInt(wordBank.length);

        //int variable to hold the incorrect number of guesses initiated with 0 guesses
        int incorrectGuesses = 0;

        //two bools to hold when the game is over and if a letter guessed is false
        boolean gameOver = false;
        boolean letterGuessed = false;
        
        //create a string variable named word that will hold the word that needs to be guessed
        String word = wordBank[number];

        //two char arrays initiated with the size of the word to be guessed
        char[] wordChar = new char[word.length()]; 
        char[] blankWord = new char[word.length()];

       //char variable will hold all player guessed words
        char letterGuess;

        //creates empty word array to hold the '_' of every word
        for (int i = 0; i < word.length(); i++){
            blankWord[i] = '_';
        }

        //fills the wordchar array with appropriate letters for the word to be guessed
        for (int i = 0; i < word.length(); i++){
            wordChar[i] = word.charAt(i);
        }

        //prints the status of the game, i.e mixture of "_" and characters
        for (int i = 0; i < word.length(); i++){
            System.out.print(blankWord[i]);
            System.out.print(" ");
        }
        System.out.println();
        
        //initiate a string variable to hold the guess of the user
        String userGuess;
        System.out.println("");
        Scanner console = new Scanner(System.in);

        //request letter guess from user
        System.out.println("Guess a letter");
        userGuess = console.nextLine();
        letterGuess = userGuess.charAt(0);

        //initiate an integer to hold the number of blanks left to uncover
        int blanksLeft = word.length();

        //while loop checks letter guessed and whether game is over
        while(incorrectGuesses < 6 && gameOver != true){
            blanksLeft = 0;
            letterGuessed = false;
            for(int i = 0; i < word.length(); i++){
                if(wordChar[i] == letterGuess){
                    blankWord[i] = wordChar[i];
                    letterGuessed = true;
                }
            }

            //if statement checks whether the guessed letter was correct. if incorrect number of incorrect guesses increases by 1 using a method
            if(letterGuessed == false){
                incorrectGuesses = wrongNumberGuesses(wordChar, blankWord, incorrectGuesses);
            }
            

            for (int i = 0; i < word.length(); i++){
                System.out.print(blankWord[i]);
                System.out.print(" ");
            }

            //part 3 of assignment, check blanks left with a method
            blanksLeft = numberOfBlanksRemaining(wordChar, blankWord, word, blanksLeft);

            if(blanksLeft == 0){
                gameOver = true;
                break;
            } else {
                System.out.println();
                System.out.print("Incorrect guesses ");
                System.out.println(incorrectGuesses);
                System.out.println("Guess a letter");
                userGuess = console.nextLine();
                letterGuess = userGuess.charAt(0);
            }
            }
        

          if(gameOver == true){
              return "You WIN!!";
          } else { 
        return "Too many errors, you lose.";
          }

    }
    public static void main(String[] args) {
     System.out.println("H  H            A            N          N          GGG         M                 M            A              N          N");
     System.out.println("H  H           AA            N  N       N         G            M M             M M           AA              N  N       N ");
     System.out.println("H  H           A A           N   N      N       G              M   M          M  M           A A             N    N     N");
     System.out.println("HHHH          AAAAA          N      N   N      G    GGG        M     M      M    M          AAAAA            N      N   N");
     System.out.println("H  H         A     A         N        N N       G    G         M       M M       M         A    A            N        N N");
     System.out.println("H  H        A       A        N          N         GGG          M        M        M        A       A          N          N");
     /*Rules of the game: 
     1.To Start type in "yes". 
     2.To win the game you must guess the word in the blank slots, character by character. 
     3.You are able to get an error 6 times, if you get more than 6 errors you lose.
     4.Only type in 1 letter at a time 
     */

    
     gameRules(); //print rules
     

     Scanner console = new Scanner(System.in);
     System.out.println("Type 'yes' to hang a man.");
     String answer = console.nextLine();
        while(answer.equals("yes")){
           String win = startGame();
           System.out.println(win);

           System.out.println("Type 'yes' to hang a man.");
           answer = console.nextLine();
          
        }
       

}
    
}
