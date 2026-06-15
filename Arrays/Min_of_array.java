import java.util.*;  // Imports utility package which includes the Scanner class

public class Min_of_array
{
    // ⚠️ BUG ALERT: 'main' method is missing the 'static' keyword!
    // Without 'static', Java cannot run this as the entry point of the program
    // Java's main method MUST always be: public static void main(String args[])
    // Non-static main means Java would need an object of this class to call it
    // which is impossible since Java looks for a static main to start execution
    // ✅ FIX: Add 'static' keyword to the main method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter the size");
        int size = sc.nextInt();  // Number of elements the array will hold

        int arr[] = new int[size];  // Create an integer array of the given size

        System.out.println("Enter the values");
        // Loop to fill the array with user input one element at a time
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();  // Store each number at index i
        }

        // Initialize min with the FIRST element of the array
        // ✅ Good practice: always initialize min with an actual array value
        //    Never initialize with 0 — the array might not contain 0!
        int min = arr[0];

        // Loop starts at i=1 because arr[0] is already stored in min
        // No need to compare min with itself at index 0
        for (int i = 1; i < size; i++)
        {
            // If current element is smaller than current min → update min
            if (min > arr[i])
            {
                min = arr[i];  // New minimum found — update min
            }
        }

        // Second loop to find the INDEX of the minimum value
        // NOTE: This finds the LAST occurrence of min if it appears multiple times
        //       Example: arr={3,1,5,1,2} → min=1, index will be 3 (not 1)
        //       To find the FIRST occurrence, use 'break' after finding it
        int index = 0;  // Will store the index where min is found
        for (int i = 0; i < size; i++)
        {
            if (min == arr[i])  // Check if current element equals the minimum
            {
                index = i;  // Update index — keeps updating if duplicates exist
                break;      // ✅ Added break to stop at FIRST occurrence of min
            }
        }

        // Print the minimum value and its index in the array
        System.out.println("The minimum is: '" + min + "' at Index: (" + index + ")");

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}