

import java.util.*;

public class RandNumRunner {

   public static void main(String[]args)   {
   
      //declares and instantiates variables
      int num = 0;
      String unsorted = new String();
      String sorted = new String();
   
      //Creates a scanner object
      Scanner scan = new Scanner(System.in);
      
      //Asks user to type the the number of values they want to generate
      System.out.println("How many random numbers do you want to generate?");
      
      //Stores the user input in a variable
      num = scan.nextInt();
      
      //Creates a RandNumGen object
      RandNumGen numArray = new RandNumGen(num);
      
      //Calls method to generate random numbers
      numArray.randNumArray();
      
      //Calls method to create a histogram
      numArray.histogram();
      
      //Calls methods that make unsorted and sorted lists
      unsorted = numArray.unsortedListString(num);
      sorted = numArray.sortedListString(num);
      
      //Prints the lists and the histogram
      System.out.println(unsorted);
      System.out.println(sorted);
      System.out.println(numArray.toString());
     
   }

}