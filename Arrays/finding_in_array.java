import java.util.*;  // Imports utility package which includes the Scanner class

public class finding_in_array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        // Ask user for the size of the array
        System.out.println("Enter the size");
        int size = sc.nextInt();  // Number of elements the array will hold

        // Ask user to enter the numbers to fill the array
        System.out.println("Enter the numbers");
        int arr[] = new int[size];  // Create an integer array of the given size

        // Loop to fill the array with user input one element at a time
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();  // Store each number at index i
        }

        // Ask user for the number they want to search for
        System.out.println("Enter the number to be checked");
        int x = sc.nextInt();  // The number to search for in the array

        // 'temp' acts as a COUNTER for how many times x was NOT found
        // If temp equals size at the end, it means x was never found in the array
        int temp = 0;

        // Loop through every element in the array to search for x
        for (int i = 0; i < size; i++)
        {
            if (x == arr[i])  // Check if current element matches the search number
            {
                // Found a match — print the index where it was found
                // NOTE: This handles DUPLICATE values too!
                //       If x appears multiple times, all positions will be printed
                System.out.println("The number is present at the index: " + i);
            }
            else
            {
                temp++;  // No match at this index — increment the counter
            }
        }

        // After the loop, if temp equals size it means EVERY index was a mismatch
        // Which means the number was never found anywhere in the array
        if (temp == size)
        {
            System.out.println("The number is not present");
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}