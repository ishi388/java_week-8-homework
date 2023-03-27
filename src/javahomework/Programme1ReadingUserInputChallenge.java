package javahomework;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 */
public class Programme1ReadingUserInputChallenge {
    public static void main(String[] args) {
        //Declaring the scanner class to read from console
        Scanner scanner = new Scanner(System.in);
        //Declaring the variables
        int sum = 0;
        int count = 0;

        // Using while loop to read input until 10 valid numbers
        while (count < 10) {
            int number;
            System.out.println("Enter number #" + (count + 1) + " : ");

            //using if else statement
            if (scanner.hasNextInt()) {      // check if input is an integer
                number = scanner.nextInt();  // Read the integer value and add it to the sum
                sum += number;
                count++;                    // Increment
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();            // consume the remaining newline character
        }
        System.out.println("Sum of 10 numbers is : " + sum);

        scanner.close();

    }

}
