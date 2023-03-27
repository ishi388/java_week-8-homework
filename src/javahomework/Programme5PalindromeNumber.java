package javahomework;

import java.util.Scanner;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 */

public class Programme5PalindromeNumber {
        public static boolean isPalindrome(int number){
            int originalNumber = number;                // stores original value of number
            int reversedNumber = 0;                    //  stores value of reversed number

            //using while loop to reverse the number
            while (number != 0){
                reversedNumber = reversedNumber * 10 + number % 10;
                number /= 10;
            }
             return originalNumber == reversedNumber;     // checking if original number equals reversed number
        }
          //Main method
          public static void main(String[] args) {
            //Declaring scanner class to read input from console
              Scanner scanner = new Scanner(System.in);
              System.out.println("Enter a number: ");
              int number = scanner.nextInt();
              if (isPalindrome(number)) {
                  System.out.println(number + " is a palindrome.");

              } else {
                  System.out.println(number + " is not a palindrome.");
                  scanner.close();
              }
           }
        }
