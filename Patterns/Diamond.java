import java.util.*;  // Imports utility package which includes the Scanner class

public class Diamond
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner object to read user input

        System.out.println("Enter the order");
        int n = sc.nextInt();  // 'n' controls the size of the diamond
                               // Example: n=4 makes a diamond that is 7 rows tall (2n-1 rows)

        // ══════════════════════════════════════════
        // UPPER HALF of the diamond (rows 1 to n)
        // ══════════════════════════════════════════
        for (int i = 1; i <= n; i++)  // i represents the current row number
        {
            // STEP 1: Print leading spaces (decreases as we go down)
            // At row 1 → (n-1) spaces, at row 2 → (n-2) spaces, ..., at row n → 0 spaces
            for (int j = n - 1; j >= i; j--)
            {
                System.out.print(" ");
            }

            // STEP 2: Print left side of stars (increases as we go down)
            // At row 1 → 1 star, at row 2 → 2 stars, ..., at row n → n stars
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            // STEP 3: Print right side of stars (mirrors the left side)
            // Starts from j=2 to avoid printing the center star twice
            // At row 1 → 0 stars, at row 2 → 1 star, ..., at row n → (n-1) stars
            for (int j = 2; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();  // Move to next line after finishing each row
        }

        // ══════════════════════════════════════════
        // LOWER HALF of the diamond (rows n down to 1)
        // ══════════════════════════════════════════
        // NOTE: This is a mirror image of the upper half
        //       'i' counts DOWN from n to 1 this time
        for (int i = n; i >= 1; i--)  // i starts at n and decreases to 1
        {
            // STEP 1: Print leading spaces (increases as we go down)
            // At row n → 0 spaces, at row n-1 → 1 space, ..., at row 1 → (n-1) spaces
            for (int j = n - 1; j >= i; j--)
            {
                System.out.print(" ");
            }

            // STEP 2: Print left side of stars (decreases as we go down)
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            // STEP 3: Print right side of stars (mirrors left, avoids center duplicate)
            for (int j = 2; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();  // Move to next line after finishing each row
        }

        sc.close();
    }
}