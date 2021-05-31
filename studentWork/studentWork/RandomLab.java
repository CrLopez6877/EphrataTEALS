package studentWork;
import java.util.Random;
import java.util.Scanner;

public class RandomLab{

public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("********Avengers VS Villains************");
    //array to store a list of avengers ordered by strength
    //similar array to store a list of villains ordered by strength
    //int variable will hold the health of the hero and villain
    int heroHealth = 100;
    int villainHealth = 100;
    int attack = 0;
    String[] avenger = {"Hawkeye", "Black Widow", "Captain America", "Iron Man", "Thor", "Hulk"};
    String[] villain = {"Ultron", "Killmonger", "Loki", "Red skull", "Hela", "Thanos"};
    //roll a six sided die to determine which avenger you are and which villain you fight
    //variable heroPower holds the power level of the hero, same with villainPower

    
    
    System.out.println("Are you ready to play? (yes or no)");
    String userInput = myObj.nextLine();
    System.out.println(userInput);
    
    //finding your hero, his strength, and health
    int heroPower = rand.nextInt(6) + 1;
    String hero = avenger[heroPower - 1];
    heroHealth = heroPower * heroHealth;
    
    //finding your villain, his strength, and health
    int villainPower = rand.nextInt(6) + 1;;
    String opponent = villain[villainPower - 1];
    villainHealth = villainHealth * villainPower;
    
    
    System.out.println("You are " + hero + " with a power strength of " + heroPower + " and a health level of " + heroHealth + ".");
    System.out.println("You are fighting " + opponent + " with a power strength of " + villainPower + " and a health level of " + villainHealth + ".");
    
    
    
    while(heroHealth > 0 && villainHealth > 0) {
        System.out.println("Roll an 8 sided die to determine the attack multiplier to your opponent");
        userInput = myObj.nextLine();
        attack = rand.nextInt(8) * heroPower;
        villainHealth = villainHealth - attack;
        
        System.out.println("You attacked your opponent and caused a damage of " + attack + ". His new health level is " + villainHealth + ".");
        System.out.println("Roll an 8 sided die to determine opponents attack");
        userInput = myObj.nextLine();
        attack = rand.nextInt(8) * villainPower;
        heroHealth = heroHealth - attack;
        
        
        System.out.println(opponent + " attacked you with an attack level of " + attack + ". Your new health level is " + heroHealth + ".");
    
    
    
    }
    
    if (heroHealth < 0) {
        System.out.println(hero + " has fallen to the mighty " + opponent + ". The world as we know it is dead." );
    } else {
        System.out.println(opponent + " has fallen to the mighty " + hero + ". Long live " + hero + ".");
    }
}   
}