import java.util.Random;   // Imports Random class to generate random numbers
import java.util.*;        // Imports utility package which includes Scanner
                           // NOTE: Since you already import java.util.Random above,
                           //       'import java.util.*' covers Random too
                           //       So the first import line is redundant but not harmful

public class Guess_the_number
{
    public static void main(String args[])
    {
        // Create a Random object to generate the secret number
        Random random = new Random();

        // Generate a random number between 1 and 100
        // nextInt(100) gives 0-99, so +1 shifts it to 1-100
        int n = random.nextInt(100) + 1;

        System.out.println("Enter your number between 1-100");  // Fixed typo: 'you' → 'your'

        Scanner scanner = new Scanner(System.in);  // Scanner to read user's guesses
        int x = scanner.nextInt();                 // Read the first guess from the user

        // Loop allows up to 99 attempts (i goes from 1 to 99)
        // 'i' tracks how many tries the user has made
        // NOTE: Using a for loop here is a bit unusual for this kind of game
        //       A 'while(true)' loop would be more natural and readable
        //       But this works fine since we always break out when correct
        for (int i = 1; i < 100; i++)
        {
            // CASE 1: User's guess is too HIGH
            if (x > n)
            {
                System.out.println("The number is less than " + x);  // Hint: go lower
                System.out.println("Try again!");
                x = scanner.nextInt();  // Read the next guess
                continue;               // Skip to next iteration of the loop
                                        // NOTE: 'continue' here jumps back to the for loop
                                        //       which increments i and checks i<100
            }

            // CASE 2: User's guess is too LOW
            else if (x < n)
            {
                System.out.println("The number is greater than " + x);  // Hint: go higher
                System.out.println("Try again!");
                x = scanner.nextInt();  // Read the next guess
                continue;               // Skip to next iteration of the loop
            }

            // CASE 3: User's guess is CORRECT (x == n)
            else
            {
                // Super rare special case — got it on the very first try!
                if (i == 1)
                {
                    System.out.println("Whoa! You got it in one try!");
                    break;  // Exit the loop immediately — game over
                }

                // Normal win — took more than one try
                System.out.println("You Win!!!");
                System.out.println("You guessed the number (" + n + ") in " + i + " tries!");
                break;  // Exit the loop immediately — game over
            }
        }

        scanner.close();  // ✅ Closes the Scanner to free up resources
    }
}