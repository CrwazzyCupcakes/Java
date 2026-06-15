import java.util.Scanner;

public class Addition_of_Matrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input dimensions of matrices
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Creating matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        // Input first matrix
        System.out.println("\nEnter elements of Matrix 1:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix1[row][col] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("\nEnter elements of Matrix 2:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix2[row][col] = sc.nextInt();
            }
        }

        // Add corresponding elements
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                sum[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }

        // Display result
        System.out.println("\nSum of Matrices:");

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(sum[row][col] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}