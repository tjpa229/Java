

import java.util.*;
import java.text.DecimalFormat;

public class HeronsFormulaProgram   {

   public static void main (String[]args)   {
      
      //declares variables
      double squareRoot, area;
      double a = 0;
      double b = 0;
      double c = 0;  
      double s = 0;
      
      
      //to create a formatting object defining a number with only 3 decimal places
      DecimalFormat fmt = new DecimalFormat("0.000");
      
      //to create a Scanner object
      Scanner scan = new Scanner(System.in);
      
      //program recieves first number
      //Try and catch prevents the user from entering an invalid data type
      System.out.println("Enter your first side below.");
      try {
      a = scan.nextDouble();
      } catch (InputMismatchException e) {
      System.out.println("Please try again.");
      System.exit(0);
      }
      
      //program recieves second number
      //Try and catch prevents the user from entering an invalid data type
      System.out.println("Enter your second side below.");
      try {
      b = scan.nextDouble();
      } catch (InputMismatchException e) {
      System.out.println("Please try again.");
      System.exit(0);
      }
      
      //program recieves third number
      //Try and catch prevents the user from entering an invalid data type
      System.out.println("Enter your third side below.");
      try {
      c = scan.nextDouble();
      } catch (InputMismatchException e) {
      System.out.println("Please try again.");
      System.exit(0);
      }
      
      //checks whether it is a triangle or not
      if (a + b > c && b + c > a && a + c > b)  {
         s = (a + b + c) / 2;
         
         //calculates area
         squareRoot = s * (s - a) * (s - b) * (s - c);
         area = Math.sqrt(squareRoot);
      
         //prints area with formatting
         System.out.println("Your area is: " + fmt.format(area));
         
         }
         
      else
         //asks user to try again using different numbers
         System.out.println("Please try different numbers.");
      
     
   }

}