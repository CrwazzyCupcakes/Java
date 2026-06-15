import java.util.*;  // Imports utility package which includes the Scanner class

public class NumberPyramid
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter the order");
        int n = sc.nextInt();  // 'n' controls the size of the pyramid
                               // Example: n=5 makes a pyramid with 5 rows

        // Outer loop controls the ROWS (top to bottom)
        // 'i' represents the current row number AND the number to be printed in that row
        // Row 1 → prints 1, Row 2 → prints 2, ..., Row n → prints n
        for (int i = 1; i <= n; i++)
        {
            // ── STEP 1: Print leading spaces for centre alignment ──
            // Spaces decrease as we go down each row
            // Row 1 → (n-1) spaces, Row 2 → (n-2) spaces, ..., Row n → 0 spaces
            // This pushes the numbers toward the centre creating a pyramid shape
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");   // Print one space per iteration
            }

            // ── STEP 2: Print the row number 'i' exactly 'i' times ──
            // Row 1 → prints "1" once
            // Row 2 → prints "2" twice
            // Row 3 → prints "3" three times ... and so on
            // Each number is followed by a space for separation
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");  // Print current row number followed by space
                                            // ⭐ NOTE: 'i' is printed (not 'j')
                                            //    so every number in a row is the same
            }

            System.out.println();  // Move to next line after finishing each row
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}