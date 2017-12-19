

import java.util.*;
import java.text.NumberFormat;

public class JavaCafeProgram  {

   public static void main (String[]args) {
      
      //declares variables
      double quantity, total, price, discount;
      
      //intializes variables
      total = 0.0;
      price = 0.0;
      quantity = 0.0;
      
      //Creates an object
      Scanner scan = new Scanner(System.in);
      
      //asks user to enter price
      System.out.print("Enter the price of the coffee: $");
      try   {
         price = scan.nextDouble();
      } 
      catch (InputMismatchException e)   {
         System.out.println("Please try again. This data type is not valid");
         System.exit(0);
      }
      
      
      //asks user to enter quantity
      System.out.print("Enter the quantity(in pounds) purchased: ");
      try   {
      quantity = scan.nextDouble();
      } 
      catch (InputMismatchException e)   {
      System.out.println("Please try again.");
      System.exit(0);
      }
      
           
      //calculates total after applying discount
      if (quantity < 3) {
         discount = 0.10;
         total = (quantity * price) - (quantity * price * discount); 
      }
      
      if (quantity >= 3 && quantity < 5) {
         discount = 0.20;
         total = (quantity * price) - (quantity * price * discount);  
      }
      
      if (quantity >= 5) {
         discount = 0.30;
         total = (quantity * price) - (quantity * price * discount);
      }
      
      //calculates total after adding the sales tax
      total = total + (total * 0.06);
      
      //creates an object to show a dollar sign in front of the total and limit it to two decimal places
      NumberFormat money = NumberFormat.getCurrencyInstance();
      
      //prints the total
      System.out.println("Your total cost is: " + money.format(total));
      
   
   
   }
}