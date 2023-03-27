package javahomework;

import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.-12
 *
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme2MinAndMaxInputChallenge {
    //Main method
    public static void main(String[] args) {
    // Taking input from console
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {           // Checking if next input entered is an integer
                int number = scanner.nextInt();  // Read the input if it is an integer
                min = Math.min(min, number);    // Updating the min variable
                max = Math.max(max, number);   // Updating the max variable
            } else {
                break;
            }
        }
        // Printing the minimum and maximum number entered by the user
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}