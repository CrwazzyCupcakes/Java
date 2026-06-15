import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        
        // --- METHOD 1: Using the Random Class ---
        // Create an instance of the Random class
        Random ran = new Random();
        
        // ran.nextInt(max) generates a number from 0 (inclusive) up to max (exclusive).
        // Passing 11 gives us a range of 0 to 10.
        int num1 = ran.nextInt(11); 
        System.out.println("Method 1 Result: " + num1);
        
        
        // --- METHOD 2: Using Math.random() ---
        // Math.random() generates a double decimal value from 0.0 (inclusive) to 1.0 (exclusive).
        // Multiplying by 11 scales the range up to 0.0 - 10.999...
        // (int) is a typecast that chops off the decimal part, leaving integers from 0 to 10.
        int num2 = (int)(Math.random() * 11); 
        System.out.println("Method 2 Result: " + num2);
    }
}