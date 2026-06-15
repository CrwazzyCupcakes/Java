public class SelectionSort {
    public static void main(String[] args) {
        // Initialize an unsorted array of integers
        int[] arr = {7, 8, 3, 1, 2};
        
        // OUTER LOOP: Moves the boundary of the unsorted subarray
        // We only need to go up to arr.length - 1 because the last element will automatically be sorted
        for (int i = 0; i < arr.length - 1; i++) {
            
            // Assume the current first element of the unsorted part is the minimum
            int minIndex = i;
            
            // INNER LOOP: Scans the remaining unsorted elements to find the actual smallest number
            for (int j = i + 1; j < arr.length; j++) {
                // If we find an element smaller than our current minimum, update minIndex
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // SWAP PROCESS: Swap the found minimum element with the first element of the unsorted part
            // We use a temporary variable 'temp' so we don't overwrite and lose the value at arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        // PRINTING: Loop through the sorted array to display the results
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Prints a newline for clean output
    }    
}