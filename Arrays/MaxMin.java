import java.util.*;  // Imports utility package which includes the Scanner class

public class MaxMin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter the size");
        int size = sc.nextInt();  // Number of elements the array will hold

        int number[] = new int[size];  // Create an integer array of the given size

        System.out.println("Enter the numbers:");  // Prompt user to enter numbers
        // Loop to fill the array with user input one element at a time
        for (int i = 0; i < size; i++)
        {
            number[i] = sc.nextInt();  // Store each number at index i
        }

        // Initialize min with the FIRST element of the array
        // This is correct — always initialize min/max with an actual array value
        // ✅ Good practice: using number[0] as starting point
        int min = number[0];

        // ⚠️ BUG ALERT: max is initialized with number[size-1] (the LAST element)
        // This is risky! The last element might not be the largest
        // Example: array = {5, 3, 8, 1, 2} → number[size-1] = 2
        //          but the actual max is 8!
        // ✅ FIX: Initialize max with number[0] just like min
        int max = number[0];  // Fixed: changed number[size-1] to number[0]

        // Loop through every element in the array
        // Compare each element with current min and max
        for (int i = 0; i < size; i++)
        {
            // If current element is smaller than current min → update min
            if (number[i] < min)
            {
                min = number[i];  // New minimum found!
            }

            // If current element is larger than current max → update max
            // NOTE: Using separate 'if' (not 'else if') means BOTH conditions
            //       are checked for every element independently
            //       This is correct because an element can't be both min and max
            //       (unless all elements are equal) but checking both is safe
            if (number[i] > max)
            {
                max = number[i];  // New maximum found!
            }
        }

        // Print the final max and min values found
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}