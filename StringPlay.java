// **************************************************
//   StringPlay.java
//   Author: A. Starr
//   Date: 10/4/17
//   Play with String objects
// **************************************************
public class StringPlay
{
   public static void main (String[] args)
   {
          String college = new String ("PoDunk College");
         
          String town = new String ("Anytown, USA"); // part (a)
 
          int stringLength =college.length();
          String change1, change2, change3;
 
          System.out.println ("College" + stringLength); // part (b)
 
          System.out.println (college + " contains " + stringLength + " characters.");
 
          change1 = college.toUpperCase(); // part (c)
 
          change2 = change1.replace('O', '*'); // part (d)
 
          change3 = college.concat(" " + town); // part (e)
 
          System.out.println ("The final string is " + change3);
        }
}