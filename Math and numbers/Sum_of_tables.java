import java.util.Scanner;

public class Sum_of_tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        // TWEAK: Started the loop at i = 1 instead of 0.
        // mathematically, n * 0 is always 0, so skipping it makes the loop more efficient.
        for (int i = 1; i <= 10; i++) {
            // Calculate the product for the current step and add it to the running sum
            sum += (n * i); 
            
            // Optional tracking: helps you see the math happen step-by-step
            // System.out.println("Adding " + n + " x " + i + " = " + (n*i));
        }
        
        System.out.println("The total sum of the multiplication table is: " + sum);
        
        sc.close();
    }    
}