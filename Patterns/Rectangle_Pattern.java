import java.util.Scanner;

public class Rectangle_Pattern {
    public static void main(String[] args) {
        // Initialize Scanner to capture dimensions from the console
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length (height) and breadth (width):");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        
        // OUTER LOOP: Controls the rows / height (vertical movement)
        // It runs exactly 'length' times, moving from top to bottom
        for (int i = 0; i < length; i++) {
            
            // INNER LOOP: Controls the columns / width (horizontal movement)
            // For every single row, this loop runs 'breadth' times from left to right
            for (int j = 0; j < breadth; j++) {
                // Print a single asterisk on the same line
                System.out.print("*");
            }
            
            // CRUCIAL STEP: Move the cursor to the next line after completing a full row.
            // This prevents all the asterisks from printing on a single flat line.
            System.out.println();
        }
        
        // Close the scanner resource
        sc.close();
    }
}