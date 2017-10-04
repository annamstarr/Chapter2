// *******************************************************************
//   PlusTest.java
//   Author: A. Starr
//   Date: 10/4/17
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args){
            System.out.println ("This is a long string that is the " +
                                 "concatenation of two shorter strings.");
            // The two phrases above will be combined when cmpiled and run.
            System.out.println ("The first computer was invented about" + 55 +
                                 "years ago.");
            // The two phrases will be put together with 55 in the middle when compiled and run.
            System.out.println ("8 plus 5 is " + 8 + 5);
            // The system will print "8 plus 5 is " and then 8 and 5 will be put next to eachother making 85.
            System.out.println ("8 plus 5 is " + (8 + 5));
            // The system will print "8 plus 5 is " and then 8 and 5 will be added and the system will print 13 when run.
            System.out.println (8 + 5 + " equals 8 plus 5.");
            // 13 will be printed next to the line "equals 8 plus 5."
        }
}