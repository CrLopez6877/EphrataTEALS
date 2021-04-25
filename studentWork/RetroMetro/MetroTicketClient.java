package studentWork.RetroMetro;
import java.util.*;

public class MetroTicketClient {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the ticket office! How many rides ?");
        int rides = console.nextInt();
        System.out.println("I'm buying a "+ rides+" ride ticket.");
        MetroTicket ticket = new MetroTicket(rides);

        while (ticket.hasRides()) {
            System.out.println(" . . . ");
            System.out.println("I'd like a ride on the metro!");
            System.out.println("Here's my ticket: " + ticket);
            
            System.out.println("<*** PUNCH ***>");
            ticket.punch();
        }

        System.out.println(" ~ ~ ~ ");
        System.out.println("I'm all out of rides!");
        System.out.println("Final ticket: " + ticket);    }
}
