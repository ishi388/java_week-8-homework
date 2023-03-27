package javahomework;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9Fibonacci {
        // Main method
        public static void main(String[] args) {
        int n = 8;                             // number of terms to print
        int first = 1;
        int second = 1;
        int next;
        System.out.print(first + " " + second + " ");
        // Using for loop to iterate
        for (int i = 2; i < n; i++) {
            next = first + second;          // Adding previous two terms
            System.out.print(next + " ");  // Print statement for terms after second term
            first = second;
            second = next;
        }
    }
}
