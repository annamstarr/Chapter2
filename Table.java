// ***************************************************************
//   Table.java
//   Author: A. Starr
//   Date: 10/4/17
//   Prints a table with a list of at least 5 students together with their grades earned (lab points, bonus points, and the total)
// ***************************************************************
public class Table
{
        public static void main (){
            makeTable();
        }
        public static void makeTable() {
            makeHeader();
            labelColumns();
            populateRows();
        }
        public static void makeHeader() {
            System.out.println ("-------------------------------------------");
            System.out.println ("==\t\tStudent Points\t\t==");
            System.out.println ("-------------------------------------------");
        }
        public static void labelColumns() {
            System.out.println ("Name\t\tLab\tBonus\tTotal");
            System.out.println ("----\t\t---\t-----\t----");
        }
        public static void populateRows() {
            populateOneRow ("Rabecah\t", 67,3);
            populateOneRow ("Franklin Jr", 27, 2);
            populateOneRow ("Napoleon", 96,4);
            populateOneRow ("Josephina", 63,22);
            populateOneRow ("Riyon\t", 56,7);
        }
        public static void populateOneRow (String name, int lab, int bonus) {
            System.out.println(name + "\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
        }
}