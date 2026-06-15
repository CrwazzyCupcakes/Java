import java.util.Random;

class Roll {
    // A method that simulates rolling a 6-sided die
    public int choice() {
        Random random = new Random();
        
        // random.nextInt(6) generates a number from 0 to 5.
        // Adding 1 shifts the range to 1 to 6 (like a real die).
        int x = random.nextInt(6) + 1;
        
        return x; // Returns the result back to whoever called this method
    }
}

public class Roll_a_die {
    public static void main(String[] args) {
        // OBJECT CREATION (Instantiation):
        // We create an instance/object of the 'Roll' class named 'afnan'.
        Roll afnan = new Roll();
        
        System.out.print("Rolling the die... Result: ");
        
        // Calling the 'choice()' method on our 'afnan' object and printing the returned integer
        System.out.println(afnan.choice());
    }    
}