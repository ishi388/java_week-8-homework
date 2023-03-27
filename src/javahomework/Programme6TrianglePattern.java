package javahomework;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme6TrianglePattern {
         // Main method
    public static void main(String[] args) {
        //Declaring scanner class to read input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int rows = scanner.nextInt();

        // Using nested loop for rows
        for(int i = 1; i<=rows; i++){
            // using nested loop again for columns in each row
            for(int j = 1; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
            scanner.close();
        }


    }

}
