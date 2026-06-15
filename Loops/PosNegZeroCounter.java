import java.util.Scanner;

public class PosNegZeroCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);
        
        // Initialize counters for positive, negative, and zero numbers
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        char choice;
        
        // Use a do-while loop because we want to run the code at least once
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            
            // Condition 1: Check if the number is greater than 0
            if (number > 0) {
                positiveCount++;
            } 
            // Condition 2: Check if the number is less than 0
            else if (number < 0) {
                negativeCount++;
            } 
            // Condition 3: If it's neither, it must be exactly 0
            else {
                zeroCount++;
            }
            
            // Ask the user if they want to continue or stop
            System.out.print("Do you want to enter another number? (y/n): ");
            // sc.next() grabs the input as a String, and .charAt(0) takes the first letter
            choice = sc.next().toLowerCase().charAt(0);
            
            System.out.println(); // Prints a blank line for cleaner formatting
            
        } while (choice == 'y'); // The loop continues AS LONG AS the user types 'y'
        
        // Print the final tallied results
        System.out.println("--- Final Results ---");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Number of Zeros:  " + zeroCount);
        
        // Close the scanner to free up system resources (good programming practice)
        sc.close();
    }
}