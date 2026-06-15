public class InsertionSort
{
    public static void main(String[] args)
    {
        // The array to be sorted
        // NOTE: You can change these values or take input from Scanner if needed
        int[] arr = {7, 8, 3, 1, 2};

        // ══════════════════════════════════════════
        // INSERTION SORT ALGORITHM
        // Idea: Similar to sorting playing cards in your hand
        //       Pick one card at a time and insert it into its correct position
        //       among the already sorted cards on the left
        // ══════════════════════════════════════════

        // Outer loop starts from index 1 (not 0)
        // because a single element (index 0) is already considered sorted
        for (int i = 1; i < arr.length; i++)
        {
            // 'current' holds the element we are trying to place correctly
            // Think of it as the card you just picked up
            int current = arr[i];

            // 'j' starts just to the LEFT of the current element
            // It will scan leftward to find the correct position for 'current'
            int j = i - 1;

            // Shift all elements that are GREATER than 'current' one position to the RIGHT
            // This creates an empty slot where 'current' will be inserted
            // ⚠️ BUG ALERT: Missing j-- inside the while loop!
            //    Without j--, 'j' never decreases and the loop runs FOREVER (infinite loop)
            //    Fix: add j-- inside the while loop as shown below
            while (j >= 0 && arr[j] > current)
            {
                arr[j + 1] = arr[j];  // Shift element one position to the right
                j--;                   // ✅ FIXED: Move j leftward to check next element
                                       // ⚠️ THIS LINE WAS MISSING IN YOUR ORIGINAL CODE!
            }

            // Place 'current' in its correct sorted position
            // j+1 because j was decremented one extra time after the last comparison
            arr[j + 1] = current;  // ✅ FIXED: Changed arr[j] to arr[j+1]
                                    // ⚠️ YOUR ORIGINAL HAD arr[j] WHICH IS ALSO A BUG!
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");  // Print each element separated by a space
        }
        System.out.println();  // Move to next line after printing all elements

        // NOTE: No Scanner is used in this program (no user input needed)
        //       so sc.close() is not required here ✅
    }
}