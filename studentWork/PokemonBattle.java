package studentWork;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
public class PokemonBattle {

    public static void main(String[] args) {
        
        

       String yourPokemon = battleStart();
        damage(yourPokemon);
        statsTable(yourPokemon);

    }

     





    public static String battleStart() {
        Scanner console = new Scanner(System.in);
        System.out.println ("Another trainer is issuing a challenge!");
        System.out.println ("Zebstrika appeared");
        System.out.println ("Which Pokemon do you choose ?");
        String yourPokemon = console.nextLine();
        System.out.println ("It’s a Pokemon battle between "+ yourPokemon +" and Zebstrika! Go!");
        return yourPokemon;
    }


    public static int damage(String yourPokemon) {
        Scanner console = new Scanner(System.in);
        System.out.println("Zebstrika used Thunderbolt!");
        System.out.println("Trainer, what are your "+ yourPokemon + "'s stats?");
        System.out.println(" ");
        System.out.println("Level: ");
        int level = console.nextInt(); 
        System.out.println("Attack: ");
        int attack = console.nextInt();
        System.out.println("Defense: ");
        int defense = console.nextInt();
        System.out.println("Base: ");
        int base = console.nextInt();
        System.out.println("HP: ");
        int hp = console.nextInt();
        System.out.println(" ");
        double modifier = .5 *Math.random ()+.5;
        double experience = (2 * level + 10) / 250;
        double power = (attack / defense) * base + 2;
        double damage1 =  (experience + power) * modifier;
        int damage2 = (int) Math.floor(damage1); 
        System.out.print(yourPokemon +" sustained "+ damage2 + "points damage.");
        System.out.println("HP, after damage, are now "+ hp +".");
        return hp; 
    }



    public static void statsTable() {
        System.out.println("Name      "+  yourPokemon);
        System.out.println("Level     "+ level);
        System.out.println("------------------------------ ");
        System.out.println("HP        "+ hp);
        System.out.println("ATTACK    "+ attack);
        System.out.println("DEFENSE   "+ defense);
        System.out.println("-------------------------------");
        System.out.println("Moves Learned: Thunder Wave, Hidden Power, Psycho Cut, Recover");
    
    }   


   }



