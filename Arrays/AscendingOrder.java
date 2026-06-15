import java.util.Scanner;

public class AscendingOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        // Create array
        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Assume array is ascending initially
        boolean isAscending = true;

        // Compare each element with its previous element
        for (int i = 1; i < size; i++) {

            // If current element is smaller than or equal to previous,
            // array is not strictly ascending
            if (numbers[i] <= numbers[i - 1]) {
                isAscending = false;
                break; // No need to continue checking
            }
        }

        // Display result
        if (isAscending) {
            System.out.println("Array is in ascending order.");
        } else {
            System.out.println("Array is NOT in ascending order.");
        }

        sc.close();
    }
}