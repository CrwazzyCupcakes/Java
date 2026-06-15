import java.util.Random;  // Imports only the Random class from the utility package
                          // NOTE: This is better practice than 'import java.util.*'
                          //       because it imports only what you need, not everything

// ══════════════════════════════════════════
// CLASS 1: Flip
// Responsible for generating the random coin flip result
// NOTE: This class does NOT have 'public' keyword — that means it is
//       package-private (only accessible within the same file/package)
//       Only ONE public class is allowed per .java file in Java
// ══════════════════════════════════════════
class Flip
{
    // Method that simulates a coin flip using random number generation
    // Returns 0 or 1 — representing the two sides of a coin
    public int computer_choice()
    {
        Random random = new Random();  // Create a Random object to generate random numbers

        // nextInt(2) generates a random integer between 0 (inclusive) and 2 (exclusive)
        // So it can only produce: 0 or 1
        // Think of it as: 0 = Heads, 1 = Tails
        int x = random.nextInt(2);

        return x;  // Send the result (0 or 1) back to wherever this method was called
    }
}

// ══════════════════════════════════════════
// CLASS 2: Flip_a_coin
// The main class — controls the flow of the program
// NOTE: The filename must match this public class name → 'Flip_a_coin.java'
// ══════════════════════════════════════════
public class Flip_a_coin
{
    public static void main(String args[])
    {
        // Create an object of the Flip class to access its computer_choice() method
        // 'afnan' is the object name — you can name it anything (e.g. 'coin', 'flipper')
        Flip afnan = new Flip();

        // Call computer_choice() and check the returned value
        // If it returns 0 → Heads
        // If it returns 1 → Tails
        if (afnan.computer_choice() == 0)
        {
            System.out.println("Heads");
        }
        else
        {
            System.out.println("Tails");
        }

        // NOTE: No Scanner is used in this program (no user input needed)
        //       so sc.close() is not required here ✅
    }
}