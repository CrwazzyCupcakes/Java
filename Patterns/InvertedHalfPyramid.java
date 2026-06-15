import java.util.*;  // Imports utility package which includes the Scanner class

public class InvertedHalfPyramid
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter a number");
        int x = sc.nextInt();  // 'x' controls the size of the pyramid
                               // Example: x=5 makes a pyramid with 5 rows

        // NOTE: Despite the class name 'InvertedHalfPyramid',
        //       this code actually prints a REGULAR right-aligned half pyramid
        //       (stars increase row by row from top to bottom)
        //       An INVERTED pyramid would have stars DECREASING row by row
        //       See the suggested fix at the bottom!

        // Outer loop controls the ROWS (top to bottom)
        // Runs from 1 to x — so there are x rows total
        for (int i = 1; i <= x; i++)
        {
            // STEP 1: Print leading spaces for right-alignment
            // Spaces decrease as we go down each row
            // Row 1 → (x-1) spaces, Row 2 → (x-2) spaces, ..., Row x → 0 spaces
            // This pushes the stars to the RIGHT creating a right-aligned look
            for (int k = x - 1; k >= i; k--)
            {
                System.out.print(" ");  // Print one space per iteration
            }

            // STEP 2: Print stars for the current row
            // Stars INCREASE as we go down each row
            // Row 1 → 1 star, Row 2 → 2 stars, ..., Row x → x stars
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");  // Print one star per iteration
            }

            System.out.println();  // Move to next line after finishing each row
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}