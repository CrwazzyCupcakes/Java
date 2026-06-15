import java.util.*;  // Imports utility package which includes the Scanner class

public class MultiplicativeTable
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter the number");
        int n = sc.nextInt();  // 'n' is the number whose table will be printed
                               // Example: n=5 prints the multiplication table of 5

        // Loop runs from 1 to 10 to print all 10 entries of the table
        // 'i' represents the multiplier (1 through 10)
        for (int i = 1; i <= 10; i++)
        {
            int x = n * i;  // Calculate the product of n and current multiplier i
                            // Example: n=5, i=3 → x = 5×3 = 15

            // Print the multiplication table entry in a clean format
            // Example output: 5 x 3 = 15
            System.out.println(n + " x " + i + " = " + x);
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}