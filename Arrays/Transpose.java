import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();
        
        // Declare a 2D array (matrix) with the user's dimensions
        int[][] number = new int[row][column];
        
        System.out.println("Enter the elements of the matrix:");
        // NESTED LOOPS TO READ: Row-major order input collection
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                number[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n--- Transposed Matrix ---");
        // NESTED LOOPS TO PRINT: We flip the boundaries!
        // The outer loop now runs up to 'column', and the inner loop runs up to 'row'
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                // By printing [j][i], we read down the columns of the original matrix
                // instead of reading across the rows.
                System.out.print(number[j][i] + " ");
            }
            // Move cursor to the next line after completing a transposed row
            System.out.println();
        }
        
        sc.close();
    }
}