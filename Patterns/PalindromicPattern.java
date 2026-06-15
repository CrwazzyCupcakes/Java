import java.util.*;  // Imports utility package which includes the Scanner class

public class PalindromicPattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter the order");
        int n = sc.nextInt();  // 'n' controls the size of the pattern
                               // Example: n=5 makes a pattern with 5 rows

        // Outer loop controls the ROWS (top to bottom)
        // 'i' represents the current row number
        // Also controls how wide each palindromic row is
        for (int i = 1; i <= n; i++)
        {
            // ── STEP 1: Print leading spaces for centre alignment ──
            // Spaces decrease as we go down each row
            // Row 1 → (n-1) spaces, Row 2 → (n-2) spaces, ..., Row n → 0 spaces
            // This centres the palindromic numbers like a pyramid
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");  // Print one space per iteration
            }

            // ── STEP 2: Print LEFT side of palindrome (counting DOWN) ──
            // Starts from i and counts DOWN to 1
            // Row 1 → prints: 1
            // Row 2 → prints: 2 1
            // Row 3 → prints: 3 2 1
            // Row 4 → prints: 4 3 2 1
            // This is the descending left half of the palindrome
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j);  // Print j counting downward
            }

            // ── STEP 3: Print RIGHT side of palindrome (counting UP) ──
            // Starts from 2 (NOT 1) and counts UP to i
            // ⭐ KEY: starts at j=2 to avoid printing '1' twice (centre duplicate)
            // Row 1 → prints: nothing (j=2 > i=1, loop doesn't run)
            // Row 2 → prints: 2
            // Row 3 → prints: 2 3
            // Row 4 → prints: 2 3 4
            // This is the ascending right half of the palindrome
            for (int j = 2; j <= i; j++)
            {
                System.out.print(j);  // Print j counting upward
            }

            System.out.println();  // Move to next line after finishing each row
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}