package javahomework;

import java.util.Scanner;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */
public class Programme11EvenDigitSum {
     // Main method
    public static void main(String[] args) {
        // Using scanner class to take input from console
        Scanner scanner = new Scanner(System.in);
        // Print statement to print a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int evenDigitSum = getEvenDigitSum(number);     // Calling the getEvenDigitSum method into the main method
        if (evenDigitSum == -1) {
            System.out.println("Invalid value");
        } else {
            System.out.println("Even digit sum: " + evenDigitSum);
            scanner.close();
        }
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {                // While loop to extract each digit of a number
            int digit = number % 10;        // dividing the last number by 10 which will remove the last digit
            if (digit % 2 == 0) {          // checking if the digit is even
                sum += digit;             // if digit is even then adding it to the sum
            }
            number /= 10;
        }
        return sum;

    }
}

