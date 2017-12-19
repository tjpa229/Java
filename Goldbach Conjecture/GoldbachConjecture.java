/
import java.util.Scanner;

public class GoldbachConjecture
{

   public static void main (String[]args)
   {
      //Declares variables as integers
      int num;
      int iNum;
      int count;
      
      //Used to collect number entered by the user
      Scanner scan = new Scanner(System.in);
      
      //Prompts the user to enter a positive integer
      System.out.print("Please enter a positive integer: ");
      
      //Stores the number into a variable
      num = scan.nextInt();
      
      //Assigns the number to another variable
      iNum = num;
      
      //Adds the original number to the list
      String list = "\n" + iNum + " ";
      
      //Sets the value of count to 0
      count = 0;   
      
      //Checks whether the variable is a positive integer or not
      if (num > 0)
      
      {
         //Runs a loop to generate numbers using goldbach conjecture if the number entered is a positive integer
         while (num > 1 || num < 1)
         {
            //Adds 1 to count every time the loop runs
            count++;
            
            //Runs if the number is even
            if (num % 2 == 0)
            {
               num = num / 2;
               
               //Starts a new line every 10 numbers
               if (count % 10 == 0)
                  list = list + "\n" + num + " ";
               
               //Conitnues if the line does not have 10 number
               else
                  list = list + num + " ";
            }
         
            //Runs if the number is odd
            else
            {
               num = (num * 3 + 1);
               //Starts new line every 10 numbers
               if (count % 10 == 0)
                  list = list + "\n" + num + " ";
               
               //Continues if the line does not have 10 numbers
               else
                  list = list + num + " ";
            }  
         }
      }
      
      //Tells the user that the number is invalid if it is less than 1
      else
         System.out.print("The number you have entered is invalid.");
      
      //Prints the list 
      System.out.println(list);
   
   }
}