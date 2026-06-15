import java.util.*;  // Imports utility package which includes the Scanner class

public class InvertedNumberPattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter a number");
        int x = sc.nextInt();  // 'x' controls the size of the pattern
                               // Example: x=5 starts with 5 numbers and decreases

        // Outer loop controls the ROWS (top to bottom)
        // ⭐ KEY: Loop counts DOWN from x to 1 (i-- instead of i++)
        // This is what makes it INVERTED — starts with the biggest row first
        // Row 1 → prints x numbers, Row 2 → prints x-1 numbers, ... Last row → prints 1 number
        for (int i = x; i >= 1; i--)
        {
            // Inner loop controls the COLUMNS (left to right) for each row
            // Runs from 1 to i — so each row prints one LESS number than the previous
            // ⭐ KEY: 'i' decreases each row so the inner loop shrinks each time
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");  // Print column number j followed by a space
                                            // Always prints 1, 2, 3... up to current i
            }

            System.out.println();  // Move to next line after finishing each row
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}