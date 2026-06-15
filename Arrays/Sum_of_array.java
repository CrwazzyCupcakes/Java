import java.util.Scanner;

public class Sum_of_array {
    public static void main(String[] args) {
        // Initialize the Scanner object for console input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        System.out.println("Enter the " + size + " decimal values:");
        // Allocate a memory block for an array holding 'size' number of float values
        float[] arr = new float[size];
        
        // LOOP 1: Populating the array
        // We track positions using the index variable 'i', starting at 0 up to size - 1
        for (int i = 0; i < size; i++) {
            System.out.print("Element at index " + i + ": ");
            arr[i] = sc.nextFloat();
        }
        
        // Initialize an accumulator variable to hold the running total
        float sum = 0;
        
        // LOOP 2: Accumulating the sum
        // We traverse the array again, pulling out each value and adding it to 'sum'
        for (int i = 0; i < size; i++) {
            sum += arr[i]; // Equivalent to: sum = sum + arr[i]
        }
        
        // Print the final accumulated total
        System.out.println("\nThe sum of all elements is: " + sum);
        
        // Close the scanner resource
        sc.close();
    }    
}