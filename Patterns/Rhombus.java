import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the order (size) of the rhombus: ");
        int n = sc.nextInt();
        
        // OUTER LOOP: Controls the rows (runs from row 1 to row n)
        for (int i = 1; i <= n; i++) {
            
            // INNER LOOP 1: Prints decreasing spaces before the stars
            // Row 1 gets (n-1) spaces, Row 2 gets (n-2) spaces, etc.
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            
            // INNER LOOP 2: Prints exactly 'n' stars for every single row
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            
            // Move cursor to the next line after completing the current row
            System.out.println();
        }
        
        sc.close();
    }
}