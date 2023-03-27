package javahomework;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme10Armstrong {
    // Main method
    public static void main(String[] args) {
        int number, originalNumber, remainder, result = 0, n = 0;
        // Using scanner class to take input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        originalNumber = number;

        // count the number of digits in the input number
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }
        originalNumber = number;

        // compute the sum of each digit raised to the power of the number of digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // check if the computed sum is equal to the original number
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
            scanner.close();
        }
    }
}


