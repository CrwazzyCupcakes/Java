import java.util.*;  // Imports utility package which includes the Scanner class

public class HalfPyramid
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter the order");
        int n = sc.nextInt();  // 'n' controls the size of the pyramid
                               // Example: n=5 makes a pyramid with 5 rows

        // Outer loop controls the ROWS (top to bottom)
        // Runs from 1 to n — so there are n rows total
        for (int i = 1; i <= n; i++)
        {
            // Inner loop controls the COLUMNS (left to right) for each row
            // NOTE: This loop always runs from 1 to n regardless of which row we're on
            //       This means EVERY row prints the same n numbers
            //       This makes a RECTANGLE, not a pyramid!
            //       To make a true half pyramid, the inner loop should run
            //       from 1 to i (not 1 to n) so each row prints one more number
            for (int j = 1; j <= n; j++)
            {
                System.out.print(j);  // Print the column number j (not i)
                                      // So every row prints: 1 2 3 4 5 (for n=5)
            }

            System.out.println();  // Move to next line after finishing each row
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}