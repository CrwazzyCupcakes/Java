public class BubbleSort {

    public static void main(String[] args) {

        // Unsorted array
        int[] arr = {7, 8, 3, 1, 2};

        // Bubble Sort Algorithm
        for (int pass = 0; pass < arr.length; pass++) {

            // After each pass, the largest element
            // gets placed at its correct position.
            for (int current = 0; current < arr.length - pass - 1; current++) {

                // Swap if elements are in wrong order
                if (arr[current] > arr[current + 1]) {

                    int temp = arr[current];
                    arr[current] = arr[current + 1];
                    arr[current + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}