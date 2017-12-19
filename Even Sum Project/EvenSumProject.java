// The Even Sum Project

//Import statement
import java.util.*;

public class EvenSumProject   {

   public static void main (String[]args)   {
      
      //Declares and initializes variables
      int num = 0;
      int sum = 0;
      int even = 2;
      
      //Creates a scanner object
      Scanner scan = new Scanner(System.in);
      
      //Asks the user to enter an integer
      System.out.print("Enter an integer greater than 1: ");
      
      //Checks whether the user input is valid or not
      try   {
         num = scan.nextInt();
      }
      catch (InputMismatchException e) {
         System.out.print("Please try again.");
         System.exit(0);
      }
      
      //Program continues if the user input is valid
      if (num > 1)   {
      
         //For loop that prints all even numbers between 1 and the number, and calculates their sum
         for (even = 1; even <= num; even++) {
      
            if (even % 2 == 0)   {
            
               if (even == 2)
                  System.out.print(even);
            
               else
                  System.out.print(" + " + even);
               
               sum = sum + even;
            }
         }
      
         //Prints the sums of al even numbers between 1 and the number
         System.out.print( " = " + sum);
      
      }
      
      //Asks user to try again if the input is not valid
      else
         System.out.println("Please try again with a number greater than 1.");
      
   }
}