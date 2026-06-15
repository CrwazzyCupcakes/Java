import java.util.Scanner;

public class Sum_of_odd {
    
    // Method to calculate and print the sum of all odd numbers up to 'n'
    // Changed to camelCase to match standard Java method naming conventions
    public static void printSumOfOdds(int n) {
        int sum = 0;
        
        // OPTIMIZATION 1: Flipped condition to eliminate the empty 'if' block
        for (int i = 1; i <= n; i++) {
            // The % (modulo) operator finds the remainder of i divided by 2.
            // If the remainder is NOT 0, the number is odd.
            if (i % 2 != 0) {
                sum += i; // Adds the odd number to our running total
            }
        }
        
        System.out.println("The sum of odd numbers up to " + n + " is: " + sum);
    }
    
    /* PRO-TIP / OPTIMIZATION 2: An even faster loop approach!
       Instead of checking every number, we can start at 1 and increment by 2 (i += 2).
       This automatically skips all even numbers completely without needing an 'if' statement:
       
       for (int i = 1; i <= n; i += 2) {
           sum += i;
       }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the limit (n): ");
        int n = sc.nextInt();
        
        // Call our method to execute the calculation
        printSumOfOdds(n);
        
        sc.close();
    }
}