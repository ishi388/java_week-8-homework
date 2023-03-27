package javahomework;

import java.util.Scanner;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 */
public class Programme13SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        // Check if num1 and num2 are within the range of 10 (inclusive) - 99 (inclusive)
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        // Convert the numbers to strings to access their digits
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);

        // Check if any digit in num1 is also present in num2
        for (int i = 0; i < strNum1.length(); i++) {
            if (strNum2.contains(Character.toString(strNum1.charAt(i)))) {
                return true;
            }
        }

        // If no shared digit is found, return false
        return false;
    }

    public static void main(String[] args) {
        // Using scanner class to take input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number (10-99): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (10-99): ");
        int num2 = scanner.nextInt();

        // Check if there is a shared digit between the two numbers
        if (hasSharedDigit(num1, num2)) {
            System.out.println("The two numbers share a digit.");
        } else {
            System.out.println("The two numbers do not share a digit.");
        }

        scanner.close();
    }
}
