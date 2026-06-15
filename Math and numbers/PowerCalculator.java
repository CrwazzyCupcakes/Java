import java.util.Scanner;

public class PowerCalculator {

    // Method to calculate and print the power of a number
    // In Java, method names should start with a lowercase letter (camelCase)
    public static void calculateExponential(int base, int exponent) {
        
        // Math.pow(a, b) computes a raised to the power of b (base^exponent)
        // It always returns a 'double' data type, which is why 'result' is a double
        double result = Math.pow(base, exponent);
        
        // Printing the final calculated value
        System.out.println("Result: " + result);
        
        // Note: 'return;' is optional here because the method return type is 'void'
    }

    public static void main(String[] args) {
        // Initialize the Scanner object for taking user input
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user makes the console interactive and user-friendly
        System.out.print("Enter the base number: ");
        int baseInput = sc.nextInt();
        
        System.out.print("Enter the exponent (power): ");
        int exponentInput = sc.nextInt();
        
        // Calling our custom method and passing the inputs as arguments
        calculateExponential(baseInput, exponentInput);
        
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}