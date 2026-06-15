import java.util.*;  // Imports utility package which includes the Scanner class

public class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter how many Fibonacci numbers to print:");  // Prompt for user
        int n = sc.nextInt();  // 'n' = how many Fibonacci numbers the user wants to see

        // Print the first two Fibonacci numbers manually
        // The series always starts with 0 and 1 — these are the fixed starting points
        // NOTE: These two are printed outside the loop because the loop
        //       calculates each new number using the previous TWO numbers.
        //       We need at least two numbers to start the calculation.
        System.out.print("0 1 ");

        int a = 0;  // Represents the FIRST number in the pair (starts at 0)
        int b = 1;  // Represents the SECOND number in the pair (starts at 1)

        // Loop runs (n-2) times because we already printed the first 2 numbers above
        // Example: if n=7, loop runs 5 times to print 5 more numbers after 0 and 1
        // NOTE: If user enters n=1 or n=2, this loop won't run at all — only "0 1" prints
        for (int i = 1; i <= n - 2; i++)
        {
            int c = a + b;  // Next Fibonacci number = sum of previous two numbers
                            // Example: 0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8 ...

            System.out.print(c + " ");  // Print the new Fibonacci number

            // Slide the window forward — prepare for the next iteration
            a = b;  // 'a' becomes the old 'b'
            b = c;  // 'b' becomes the newly calculated 'c'
                    // NOTE: This is the KEY step — always update a and b
                    //       so the next iteration adds the correct two numbers
        }

        System.out.println();  // Move to a new line after printing all numbers

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}