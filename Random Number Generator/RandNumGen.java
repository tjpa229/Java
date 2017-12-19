

import java.util.Random;
import java.util.Arrays;

public class RandNumGen {
   
   //Declares/instantiates variables
   public int num[];
   public int number = 0;
   public int cx = 0;
   public int cy = 0;
   public String his[] = new String [10];
   public int c[] = new int [10];
   public String tab[] = new String [10];
   public String unsortedList = "-------------------------Unsorted List-------------------------\n";
   public String sortedList = "\n--------------------------Sorted List--------------------------\n";
   private String histogram = "\n-------------------------Histogram-------------------------\n";


   //Constructor method
   public RandNumGen(int y)   {
   
      number = y;
      num = new int[number];
   
   }
   
   //Generates random numbers
   public int[] randNumArray()  {
      
      Random generator = new Random();
      
      //Loop generates random numbers between 1 and 100
      for (int i = 0; i < number; i++) {
      
         num[i] = (generator.nextInt(100) + 1);
      }
      return num;
   }
   
   //Creates histogram
   public void histogram()   {
      
      //Prevents enull from appearing in the output
      for (int i = 0; i < 10; i++) {
      
         his[i] = "";
      
      }
      
      //Collects data for histogram
      for (int i = 0; i < number; i++) {
         if (num[i] > 0 && num[i] < 11)
         {
            c[0] = c[0] + 1;
            his[0] = his[0] + "*";
         }
         
         if (num[i] > 10 && num[i] < 21)
         {
            c[1] = c[1] + 1;
            his[1] = his[1] + "*";
         }
         
         if (num[i] > 20 && num[i] < 31)
         {
            c[2] = c[2] + 1;
            his[2] = his[2] + "*";
         }
         
         if (num[i] > 30 && num[i] < 41)
         {
            c[3] = c[3] + 1;
            his[3] = his[3] + "*";
         }
         
         if (num[i] > 40 && num[i] < 51)
         {
            c[4] = c[4] + 1;
            his[4] = his[4] + "*";
         }
         
         if (num[i] > 50 && num[i] < 61)
         {
            c[5] = c[5] + 1;
            his[5] = his[5] + "*";
         }
         
         if (num[i] > 60 && num[i] < 71)
         {
            c[6] = c[6] + 1;
            his[6] = his[6] + "*";
         }
         
         if (num[i] > 70 && num[i] < 81)
         {
            c[7] = c[7] + 1;
            his[7] = his[7] + "*";
         }
         
         if (num[i] > 80 && num[i] < 91)
         {
            c[8] = c[8] + 1;
            his[8] = his[8] + "*";
         }
         
         if (num[i] > 90 && num[i] < 101)
         {
            c[9] = c[9] + 1;
            his[9] = his[9] + "*";
         }
      }
      
      //Creates a histogram with the data
      for (int i = 0; i < 10; i++)   {
         
         //Stores the lines of the histogram in an array
         tab[i] = (i * 10 + 1) + "-" + ((i * 10) + 10) + "\t" + "|" + c[i] + "\t" + his[i] + "\n";
      
      }
      return;
   }
   
   //Creates a string of the random numbers
   public String unsortedListString(int x) {
      
      //Makes the unsorted list
      for (int i = 0; i < x; i++)  {
      
         cy += 1;
         
         //Starts a new line if the line has 20 values
         if (cy % 20 == 0) {
            if (cy == x)
               unsortedList = unsortedList + num[i] + "\n\n";
            else
               unsortedList = unsortedList + num[i] + ",\n";
         }
         else
            unsortedList = unsortedList + num[i] + ", ";
      }
      
      return unsortedList;
   }
   
   //Creates a string of sorted random numbers
   public String sortedListString(int x)  {
      
      //Sorts the array
      Arrays.sort(num);
      
      //Makes the sorted list
      for (int i = 0; i < x; i++)  {
         
         cx += 1;
         
         //Starts a new line if the line has 20 value
         if (cx % 20 == 0) {
            
            if (cx == x)
               sortedList = sortedList + num[i] + "\n\n";
            else
               sortedList = sortedList + num[i] + ",\n";
         }
         else
            sortedList = sortedList + num[i] + ", ";
     
      }
      
      return sortedList;
   }
   
   public String toString()   {
      
      //Puts the histogram together
      for (int i = 0; i < 10; i++)   {
         histogram = histogram + tab[i];
      }
      
      return (histogram);
        
   }
}