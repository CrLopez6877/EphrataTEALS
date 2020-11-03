package studentWork;
import java.util.Scanner;
public class QandR {
    public static void main ( String [] args) {
        Scanner console = new Scanner(System.in);

        // Prompt for first integer
        System.out.print("Enter the first integer: ");
        int firstInt = console.nextInt();

        // Prompt for second int
        System.out.print("Enter second int: ");
        int secondInt = console.nextInt();
        int remainder= calculateRemainder(firstInt, secondInt );
        // Calculate the quotient
        int quotient= calculateQuotient(firstInt, secondInt);
        System.out.println("The quotient from these two integers is " + quotient + "with the remainder of " + remainder);
        
        
        

        } 
        public static int calculateQuotient(int firstInt, int secondInt) {
            int quotient; 
            quotient = (firstInt/ secondInt);
            return quotient;
        } 
            public static int calculateRemainder(int firstInt, int secondInt) {
                int remainder; 
                remainder = (firstInt % secondInt);
                return remainder; } 
            }
            


            






    
    
