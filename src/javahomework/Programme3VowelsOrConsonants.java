package javahomework;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme3VowelsOrConsonants {
    public static void main(String[] args) {
        // Declaring scanner class to read from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = scanner.next().toLowerCase();
        //if else loop
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Input must be a single letter.");
        } else {
            char ch = input.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {   // checking for vowels
                // print statement
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
                scanner.close();
            }
        }
    }
}
