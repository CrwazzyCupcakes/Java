import java.util.Scanner;

public class CheckIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        // Array declaration
        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter the numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Element to search
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < size; i++) {

            if (numbers[i] == target) {
                System.out.println("Found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number not found in array.");
        }

        sc.close();
    }
}