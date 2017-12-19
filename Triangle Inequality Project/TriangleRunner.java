
import java.util.*;

public class TriangleRunner   {

   public static void main (String[]args)   {
      
      //Declares varables
      double num1 = 0, num2 = 0, num3 = 0, area = 0;
      int check = 0;
      String output;
      
      //Creates a scanner object
      Scanner scan = new Scanner(System.in);
      
      //Asks user to enter 3 sides
      System.out.println("Enter the three sides of the triangle.");
      
      //Checks whether the numbers are valid or not
      try   {
         num1 = scan.nextDouble();
      }
      catch (InputMismatchException e)   {
         System.out.println("Please try again.");
         System.exit(0);
      }
      
      try   {
         num2 = scan.nextDouble();
      }
      catch (InputMismatchException e)   {
         System.out.println("Please try again.");
         System.exit(0);
      }
      
      try   {
         num3 = scan.nextDouble();
      }
      catch (InputMismatchException e)   {
         System.out.println("Please try again.");
         System.exit(0);
      }
      
      //Creates a triangle object and stores the sides entered by user in it
      Triangle sides = new Triangle(num1, num2, num3);
      
      //Runs the checkTriangle method
      check = sides.checkTriangle();
      
      //Runs method to find area if numbers entered by user form a triangle
      if (check == 1)   {
         System.out.println(sides.triangleType());
         sides.triangleArea();
         System.out.println(sides.toString());
      }
      else
         System.out.println("It is not a triangle.");
   }
}