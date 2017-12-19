
import java.util.Scanner;

public class StringLengthProgram {

   public static void main (String[]args) {
   
      //declares variables
      String firstName, lastName, fullName, letter1, letter2;
      int count1, count2;
   
      //instantiating a scanner object called scan
      Scanner scan = new Scanner(System.in);
   
      //recieves user input as string
      System.out.print("Please type in your first name: ");
      firstName = scan.nextLine();
   
      //returns integer value of the length of the string
      count1 = firstName.length();
   
      //tells the length of first name
      System.out.println("Your first name, " + firstName + ", has " + count1 + " letters.");
   
      //recieves user input as string
      System.out.print("Please type in your last name: ");
      lastName = scan.nextLine();
   
      //returns integer value of the length of the string
      count2 = lastName.length();
   
      //tells the length of last name
      System.out.println("Your last name, " + lastName + ", has " + count2 + " letters.");
   
      //tells the length of full name
      System.out.println("Your full name, " + firstName + " " + lastName + ", has " + (count1 + count2) + " letters.");
   
      //Converts string to lower case
      firstName = firstName.toLowerCase();
      lastName = lastName.toLowerCase();
   
      //Converts last letter of firstName to upper case
      letter1 = firstName.substring((count1-1), (count1));
      firstName = firstName.substring(0, count1 - 1) + letter1.toUpperCase();
   
      //Converts last letter of LastName to upper case
      letter2 = lastName.substring((count2-1), (count2));
      lastName = lastName.substring(0, count2 - 1) + letter2.toUpperCase();
   
      //puts the first name and last name together
      fullName = firstName + " " + lastName;
   
      //shows name spelled backwards
      System.out.println("Your name spelled backwards is: " + new StringBuilder(fullName).reverse());
   
  }
 
}