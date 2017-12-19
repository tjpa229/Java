
import java.text.DecimalFormat;

public class Triangle   {

   //Declares variables variables
   private double side1, side2, side3, s, squareRoot;
   private String type;


   //Constructor method
   public Triangle (double x, double y, double z)  {
      
      //Assigns the sides to three different variables
      side1 = x;
      side2 = y;
      side3 = z;
   
   }
   //Method that determines whether the values entered by user form a triangle and, if they do, the type of triangle
    public int checkTriangle()  {
      
      //Checks if the sides form a triangle
      if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
         return 1;
         
      //Prints the line if it is not a triangle
      else
         return 0; 
    }
    
    //Finds the type of the triangle
    public String triangleType() {
   
      //Checks whether the triangle is an equilateral triangle
      if (side1 == side2 && side2 == side3)
         type = ("It is an equilateral triangle.");
         
      //Checks whether the triangle is an isoscles triangle 
      else if (side1 == side2 || side2 == side3 || side1 == side3)
         type = ("It is an isosceles triangle.");
         
      //Checks whether the triangle is a scalene triangle
      else if (side1 != side2 && side2 != side3 && side1 != side3)
         type = ("It is a scalene triangle.");
      
      //Returns the type of the triangle
      return type;
   
   }
   
   //The method to calculate the area of the triangle
   public double triangleArea()  {
   
      //Calculates and returns the area (using Heron's formula)
      s = (side1 + side2 + side3) / 2;
      squareRoot = s * (s - side1) * (s - side2) * (s - side3);
      
      //Returns the area
      return Math.sqrt(squareRoot);
      
   }
   
   //This method formats the area
   public String toString()   {
   
      //Creates a DecimalFormat object
      DecimalFormat fmt = new DecimalFormat("0.000");
      
      //Returns the formatted area
      return ("Area: " + fmt.format(Math.sqrt(squareRoot)));
   
   }  
}