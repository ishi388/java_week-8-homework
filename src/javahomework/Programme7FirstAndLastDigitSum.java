package javahomework;

import java.util.Scanner;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class Programme7FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // return -1 for negative input
        }
        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        return firstDigit + lastDigit; // return sum of first and last digit
    }
      // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = sumFirstAndLastDigit(number);
        System.out.println("Sum of first and last digit: " + sum);
        scanner.close();
    }
}
