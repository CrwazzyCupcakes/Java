import java.util.*;  // Imports utility package which includes the Scanner class

public class Factorial
{
    // Static method that calculates and prints the factorial of a number
    // Takes 'x' as a parameter (passed in from main)
    // NOTE: Method name 'Factorial' starts with uppercase — Java convention says
    //       method names should start with lowercase (e.g. 'calcFactorial')
    //       This may cause a yellow warning in your IDE — same issue as before!
    public static void calcFactorial(int x)
    {
        int f = 1;  // Initialize factorial result to 1
                    // NOTE: Starting at 1 is important because multiplying by 0 would give 0

        // Only calculate if the number is 0 or positive
        // Factorial is not defined for negative numbers
        if (x >= 0)
        {
            // Loop starts from x and counts DOWN to 1
            // Example for x=5: f = 5×4×3×2×1 = 120
            // NOTE: Loop stops at i=1, not i=0, because multiplying by 0 would reset f to 0
            for (int i = x; i >= 1; i--)
            {
                f = f * i;  // Multiply f by current value of i each iteration
            }

            // Print the final factorial result
            // Special case: if x=0, the loop never runs and f stays 1
            // This is mathematically correct because 0! = 1
            System.out.println("Factorial of " + x + " is: " + f);
        }
        else
        {
            // Negative numbers don't have a factorial — print error message
            System.out.println("Invalid number");
        }

        // 'return' is optional in void methods — method exits automatically
        // Kept here just as an explicit end marker
        return;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter a number:");  // Prompt so user knows what to enter
        int x = sc.nextInt();  // Read the number entered by the user

        calcFactorial(x);  // Pass the number to the calcFactorial method

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}