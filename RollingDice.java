// **************************************************
//   LuckyNumbers.java
//   Author: A. Starr
//   Date: 10/10/17
//   To generate two random rolls of dice and find the sum
// **************************************************
 
import java.util.Random;
 
public class RollingDice
{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int die1, die2; 
 
          die1 = generator.nextInt(6) + 1;
          die2 = generator.nextInt(6) + 1;
          System.out.println ("Value of die1: " + die1 + "\nValue of die2: " + die2);
          System.out.println ("Sum of dice: " + (die1 + die2));
        }
}
