import java.util.Scanner;  // Imports only the Scanner class (more precise than import java.util.*)

public class NumberCounter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Scanner to read user input

        // Counters to track how many positive, negative, and zero values are entered
        // All initialized to 0 — no numbers counted yet at the start
        int positive = 0;  // Counts numbers greater than 0
        int negative = 0;  // Counts numbers less than 0
        int zero     = 0;  // Counts numbers equal to 0

        char choice;  // Stores user's yes/no decision to continue or stop
                      // Declared OUTSIDE the loop so the while condition can access it

        // ══════════════════════════════════════════
        // DO-WHILE LOOP
        // ⭐ KEY: do-while always runs AT LEAST ONCE
        //        Perfect here because we always want to enter at least one number
        //        before asking if they want to continue
        //        Condition is checked AFTER each iteration
        // ══════════════════════════════════════════
        do
        {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();  // Read the number entered by user

            // Classify the number into one of three categories
            if (num > 0)
            {
                positive++;  // Increment positive counter
                             // Shorthand for: positive = positive + 1
            }
            else if (num < 0)
            {
                negative++;  // Increment negative counter
            }
            else             // num must be 0 if not positive or negative
            {
                zero++;      // Increment zero counter
            }

            // Ask user if they want to enter another number
            System.out.print("Do you want to enter another number? (y/n): ");

            // scanner.next() reads the next word/token entered
            // .charAt(0) extracts only the FIRST character of that input
            // This handles cases where user types 'yes' or 'YES' — only 'y'/'Y' is checked
            choice = scanner.next().charAt(0);

        }
        // Loop continues as long as user enters 'y' or 'Y'
        // Both lowercase and uppercase Y are accepted — case insensitive check
        while (choice == 'y' || choice == 'Y');

        // ══════════════════════════════════════════
        // PRINT FINAL RESULTS
        // '\n' adds a blank line before results for cleaner output
        // ══════════════════════════════════════════
        System.out.println("\n========= Results =========");
        System.out.println("Count of Positive numbers : " + positive);
        System.out.println("Count of Negative numbers : " + negative);
        System.out.println("Count of Zeros            : " + zero);
        System.out.println("Total numbers entered     : " + (positive + negative + zero));
        // ✅ Added total count — useful to know how many numbers were entered overall

        scanner.close();  // ✅ Already present — Closes the Scanner to free up resources
    }
}