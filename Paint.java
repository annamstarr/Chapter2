//***************************************************************
//File: Paint.java
//Author: A. Starr
//Date: 10/6/17
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
public class Paint
{
   public static void main(String[] args)
   {
       final int COVERAGE = 350;          //paint covers 350 sq ft/gal
       int length, width, height;         //declare integers length, width, and height;
       double totalSqFt;                  //declare double totalSqFt;
       double paintNeeded;                //declare double paintNeeded;
 
       //Declare and initialize the length, width, and height of the room
       length = 15;
       width = 11;
       height = 8;
            
       //Compute the total square feet to be painted--think about the dimensions of each wall
       totalSqFt = ((height*width*4) + (length*width));
            
       //Compute the amount of paint needed
       paintNeeded = (int) (Math.ceil(totalSqFt/ 350));
       System.out.println ("You need " + paintNeeded + " gallons.");
 
       //Print the length, width, and height of the room and the number of gallons of paint needed
       System.out.println (("height = " + height)+ ("\nlength = " + length) + ("\nwidth = " + width) +("\nNumber of gallons of paint needed = " + paintNeeded));
   }
}