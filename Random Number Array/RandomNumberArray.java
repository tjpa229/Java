

import java.util.*;

public class RandomNumberArray
{

   public static void main(String[]args)
   {
      //declares variables and arrays
      int[] num = new int [100];
      int[] c = new int [10];
      String[] his = new String [10];
      String unsortedList = "----------Unsorted List----------\n";
      String sortedList = "----------Sorted List----------\n";
      int x = 0;
      String histogram = "----------Histogram----------\n";
      String[] tab = new String [10];
      int mean = 0;
      
      //Creates an object
      Random generator = new Random();
      
      //For loop generates 100 random numbers and stores them in a variable
      for(int i = 0; i < 100; i++)
      {
         num[i] = (generator.nextInt(100) + 1);
         x += 1;
         
         if (x % 20 == 0)
            if (x == 100)
               unsortedList = unsortedList + num[i];
            else
               unsortedList = unsortedList + num[i] + ",\n";
         
         else
            unsortedList = unsortedList + num[i] + ", ";
      
      }
      
      //Sets x to 0
      x = 0;
      
      //Sorts the array
      Arrays.sort(num);
      
      //Stores the sorted numbers in a variable
      for (int i = 0; i < 100; i++)
      {
         x += 1;
         
         if (x % 20 == 0)
            if (x == 100)
               sortedList = sortedList + num[i];
            else
               sortedList = sortedList + num[i] + ",\n";
         
         else
            sortedList = sortedList + num[i] + ", ";
      
      }
      
      //Prevents "null" form appearing in the output
      for (int i = 0; i < 10; i++)
      {
         his[i] = "";
      }
      
      //Collects data for histogram
      for (int i = 0; i < 100; i++)
      {
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
      
      //Calculates the mean
      for(int i = 0; i < 100; i++)
      {
        mean = mean + num[i];
      }
      mean = mean /100;
      
      //Creates the histogram
      tab[0] = "0-10\t" + "| " + c[0] + "\t" + his[0] + "\n";
      tab[1] = "11-20\t" + "| " + c[1] + "\t" + his[1] + "\n";
      tab[2] = "21-30\t" + "| " + c[2] + "\t" + his[2] + "\n";
      tab[3] = "31-40\t" + "| " + c[3] + "\t" + his[3] + "\n";
      tab[4] = "41-50\t" + "| " + c[4] + "\t" + his[4] + "\n";
      tab[5] = "51-60\t" + "| " + c[5] + "\t" + his[5] + "\n";
      tab[6] = "61-70\t" + "| " + c[6] + "\t" + his[6] + "\n";
      tab[7] = "71-80\t" + "| " + c[7] + "\t" + his[7] + "\n";
      tab[8] = "81-90\t" + "| " + c[8] + "\t" + his[8] + "\n";
      tab[9] = "91-100\t" + "| " + c[9] + "\t" + his[9] + "\n";
      
      //Prints unsorted list, sorted list, and histogram
      System.out.println(unsortedList);
      System.out.println("\n\n" + sortedList);
      System.out.println("\n\n" + histogram + "\n" + tab[0] + tab[1] + tab[2] + tab[3] + tab[4] + tab[5] + tab[6] + tab[7] + tab[8] + tab[9]);
      System.out.println("Mean:- " + mean);
   
   
   
   }

}