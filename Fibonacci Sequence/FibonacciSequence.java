//

//Import statement
import java.util.*;

public class FibonacciSequence   {

   public static void main (String[]args) {
      
      //Declares a variables
      int num, a, b, c, x;
      String sequence;
      
      //Initializes variables
      a = 0;
      b = 1;
      c = 0;
      num = 0;
      x = 1;
      
      //Creates a scanner object
      Scanner scan = new Scanner(System.in);
      
      //Asks the user to enter an integer
      System.out.print("Please enter an integer number greater than one: ");
      
      //Checks whether the user input is valid or not
      try   {
         num = scan.nextInt();
      }
      catch (InputMismatchException e)   {
         System.out.println("Please try again.");
         System.exit(0);
      }
      
      //Stops program if number is less than 2
      if (num < 2)   {
         System.out.println("Please try again with a number greater than one.");
         System.exit(0);
      }
      
      //While loop to get the fibonacci sequence and prints the sequence
      while (a <= num)  {
         
         if (num == a)  {
            System.out.print("\nYour number is a Fibonacci Number!");
            break;
         }
        
         a = b + c;
         b = c;
         c = a;
         
         if (a > num)   {
            System.out.print(" " + "\nYour number is not a Fibonacci Number.");
            break;
         }
            
         else
            if (x == 1)
               System.out.print(a);
               
            else
               System.out.print(", " + a);
         
         x++;
         
      }  
   }
}