import java.util.*;  // Imports utility package which includes the Scanner class

public class HollowRectangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter the length and breadth");  // Fixed typo: 'breath' → 'breadth'
        int l = sc.nextInt();  // 'l' = length  → controls the number of ROWS
        int b = sc.nextInt();  // 'b' = breadth → controls the number of COLUMNS

        // Outer loop controls the ROWS (top to bottom)
        // Runs from 1 to l — so there are l rows total
        for (int i = 1; i <= l; i++)
        {
            // Inner loop controls the COLUMNS (left to right) for each row
            // Runs from 1 to b — so there are b columns per row
            for (int j = 1; j <= b; j++)
            {
                // Print '*' only on the BORDER of the rectangle
                // Border conditions:
                // i == 1 → TOP row
                // i == l → BOTTOM row
                // j == 1 → LEFT column
                // j == b → RIGHT column
                if (i == 1 || i == l || j == 1 || j == b)
                {
                    System.out.print("*");  // Border cell → print star
                }
                else
                {
                    System.out.print(" ");  // Interior cell → print space (hollow part)
                }
            }

            System.out.println();  // Move to next line after finishing each row
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}