import java.util.Scanner;

public class Recursion {
    
    // Recursive method to find the sum of the first 'x' natural numbers
    public static int sum(int x) {
        // BASE CASE: This stops the recursion.
        // If x is 0 or negative, we stop calling the method and return 0.
        if (x <= 0) {
            return 0;
        }
        // RECURSIVE CASE: The method calls itself with a smaller value (x - 1).
        else {
            // It waits for the result of sum(x - 1), then adds x to it.
            return x + sum(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of 'n': ");
        int n = sc.nextInt();
        
        // Call the recursive method and print the final result
        int totalSum = sum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + totalSum);
        
        sc.close(); // Clean up the scanner resource
    }   
}