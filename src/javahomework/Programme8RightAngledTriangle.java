package javahomework;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme8RightAngledTriangle {
        // Main method
    public static void main(String[] args) {
        int rows = 5;
         //Using nested loop
        for (int i = 1; i <= rows; i++) {          // outer loop iterates over rows of triangle
            for (int j = 1; j <= i; j++) {        // Inner for loop prints @ symbol
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
