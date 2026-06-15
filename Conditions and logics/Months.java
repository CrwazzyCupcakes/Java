import java.util.Scanner;  // Imports only the Scanner class (more precise than import java.util.*)

public class Months
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter the number of the month (1-12):");  // Prompt for user
        int x = sc.nextInt();  // Read the month number entered by the user

        System.out.print("Your month is ");  // Printed before switch — no newline yet

        // Switch statement maps the number to its corresponding month name
        // More efficient and cleaner than 12 if-else blocks
        // ⭐ Each case MUST end with 'break' to prevent fall-through to the next case
        switch (x)
        {
            case 1:
                System.out.println("January");    // ✅ Capitalized
                break;

            case 2:
                System.out.println("February");   // ✅ Fixed typo: 'february' → 'February'
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            // Runs if user enters any number outside 1-12
            // ⭐ default doesn't need a 'break' since it's the last case
            //    but adding one is good practice for consistency
            default:
                System.out.println("\nInvalid! Please enter a number between 1 and 12");
                // NOTE: Your original message was "in your dreams" which is fun
                //       but changed to a clearer message — feel free to revert! 😄
                break;
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}