package javahomework;

/**]
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class Programme14Diamond {
    public static void main(String[] args) {
        int n = 13; // number of rows in the diamond pattern
        int i = 1; // current row number

        // print upper half of the diamond pattern
        while (i <= n / 2 + 1) {
            // print spaces before the first star in each row
            int j = 1;
            while (j <= n / 2 + 1 - i) {
                System.out.print(" ");
                j++;
            }

            // print stars in each row
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }

            // move to the next row
            System.out.println();
            i++;
        }

        // print lower half of the diamond pattern
        i = n / 2;
        while (i >= 1) {
            // print spaces before the first star in each row
            int j = 1;
            while (j <= n / 2 + 1 - i) {
                System.out.print(" ");
                j++;
            }

            // print stars in each row
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }

            // move to the next row
            System.out.println();
            i--;
        }
    }

}
