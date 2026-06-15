import java.util.*;  // Imports utility package which includes the Scanner class

public class NumberTriangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter a number");
        int x = sc.nextInt();  // 'x' controls the number of rows in the triangle
                               // Example: x=5 prints a triangle with 5 rows

        // Outer loop controls the ROWS (top to bottom)
        // 'i' represents the current row number
        // Runs from 1 to x — so there are x rows total
        for (int i = 1; i <= x; i++)
        {
            // Inner loop controls the COLUMNS (left to right) for each row
            // 'j' represents the current column number
            // Runs from 1 to i — so each row has one MORE column than the previous
            // Row 1 → 1 number, Row 2 → 2 numbers, ..., Row x → x numbers
            for (int j = 1; j <= i; j++)
            {
                // ⭐ KEY LOGIC: Add row number and column number together
                // i + j determines whether to print 1 or 0
                int y = i + j;

                // If the sum (i+j) is EVEN → print 1
                // If the sum (i+j) is ODD  → print 0
                // y % 2 == 0 checks if y is divisible by 2 (even)
                // This creates an alternating 0 and 1 pattern in each row
                if (y % 2 == 0)
                {
                    System.out.print("1 ");  // Even sum → print 1
                }
                else
                {
                    System.out.print("0 ");  // Odd sum → print 0
                }
            }

            System.out.println();  // Move to next line after finishing each row
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}