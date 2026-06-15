import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // Create a Scanner object to capture input from the console
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        System.out.println("--- Multiplication Table for " + n + " ---");
        
        // FOR LOOP: 'i' starts at 1 and increments by 1 on each turn.
        // The loop continues running as long as 'i' is less than or equal to 10.
        for (int i = 1; i <= 10; i++) {
            
            // Calculate the product of the fixed number (n) and the changing counter (i)
            int result = n * i;
            
            // Print the formatted row
            // e.g., if n=5 and i=3, it prints: "5 x 3 = 15"
            System.out.println(n + " x " + i + " = " + result);
        }
        
        // Close the scanner resource to keep memory clean
        sc.close();
    }    
}