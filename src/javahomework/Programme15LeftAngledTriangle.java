package javahomework;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme15LeftAngledTriangle {
             //Main method
             public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
             System.out.print("Enter the number of rows: ");
             int rows = sc.nextInt();
             sc.close();
              //i for rows and j for columns
             //row denotes the number of rows you want to print
              int i, j, row = 6;
              //Outer loop work for rows
             for (i = 0; i < row; i++) {
            //inner loop work for space
              for (j = 2 * (row - i); j >= 0; j--) {
                //prints space between two stars
                System.out.print(" ");
            }
               //inner loop for columns
             for (j = 0; j <= i; j++) {
                //prints star
                System.out.print("* ");
                //throws the cursor in a new line after printing each line
                System.out.println();
            }
        }
    }
}





