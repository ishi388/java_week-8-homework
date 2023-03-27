package javahomework;

import java.util.Scanner;

/**
 *Write a programme to input any number and check if it is prime or not.
 */
public class Programme12PrimeNumber {
     // Main method
    public static void main(String[] args) {
        // scanner class to take input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int num = scanner.nextInt();                    // Reading user input and storing the value in variable sum
        boolean isPrime = true;                        // Initializing a boolean value as true

        if (num <= 1) {                               // Using if else  to check if number is prime or not
            isPrime = false;
        } else {
            for (int i = 2; i<= Math.sqrt(num); i++) {  //checking if integer is divisible by 2 upto squareroot of that number
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number. ");  // Print statement for number being prime
        } else {
            System.out.println(num + " is not a prime number. ");  // Print statement for number not being prime
            scanner.close();
        }
    }

}
