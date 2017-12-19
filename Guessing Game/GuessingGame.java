

import java.util.Scanner;
import java.util.Random;

public class GuessingGame
{

   public static void main(String[]args)
   {
      //Declares variables as integers
      int num;
      int guess;
      int limit = 1;
      
      //Generates a random number between 1 and 100
      Random generator = new Random();
      num = generator.nextInt(100) + 1;
      
      //Loop takes the user's guess and checks whether it is correct or incorrect
      while (limit < 8)
      {
         //Used to collect user input
         Scanner scan = new Scanner(System.in);
         if (limit == 1)
         System.out.print("I am thinking of a number between 1 and 100--can you guess what it is in 7 tries or less?\nGuess #" + limit + ": ");
         
         if (limit > 1)
            System.out.print("Guess #" + limit + ": ");
         guess = scan.nextInt();
      
         
         
         if (limit < 7)
            
            //Gives a hint to user if limit is less than 8 and wrong number is guessed
            if (guess != num)
            {
               System.out.println("Try again.");
               if (guess < num)
               {
                  System.out.println("Too low");
               }   
               else
                  System.out.println("Too High");
            } 
            //Tells the user that they won if correct number is guessed     
            else
            {
               System.out.println("You won!");
               //Exits the loop if correct number is guessed
               break;
            }
         //Displays a message if the user loses      
         else
            System.out.println("Sorry, you did not guess the right number. The number was " + num);
            
         //Adds 1 to limit every time the loop turns
         limit++;
      
      }
   
   }

}