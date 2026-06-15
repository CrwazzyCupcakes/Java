import java.util.*;  // Imports utility package which includes Scanner and Math classes

public class GCD
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter two numbers:");  // Prompt so user knows what to enter
        int a = sc.nextInt();  // First number
        int b = sc.nextInt();  // Second number

        // Initialize GCD to 1
        // 1 is always a common divisor of any two numbers
        // So worst case, the GCD will be 1
        int g = 1;

        // Find the smaller of the two numbers
        // NOTE: We only need to check up to the smaller number because
        //       no number greater than the smaller value can divide both a and b
        //       Example: GCD(12, 8) → only check up to 8, not 12
        int m = Math.min(a, b);

        // Loop from 1 to m (the smaller number)
        // Check every number to see if it divides BOTH a and b evenly
        for (int i = 1; i <= m; i++)
        {
            // If i divides both a and b with no remainder → i is a common divisor
            // We keep updating g every time we find a bigger common divisor
            // By the end of the loop, g will hold the GREATEST common divisor
            // NOTE: We don't break early because we want the LAST (biggest) valid i
            if (a % i == 0 && b % i == 0)
            {
                g = i;  // Update g — this keeps getting replaced with larger divisors
            }
        }

        // Print the final GCD result
        System.out.println("GCD of " + a + " and " + b + " is: " + g);

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}