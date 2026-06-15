import java.util.Scanner;

public class Butterfly {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of butterfly: ");
        int n = sc.nextInt();

        // ==========================
        // Upper Half of Butterfly
        // ==========================
        for (int row = 1; row <= n; row++) {

            // Left Wing
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // Middle Spaces
            int spaces = 2 * (n - row);
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // Right Wing
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // ==========================
        // Lower Half of Butterfly
        // ==========================
        for (int row = n; row >= 1; row--) {

            // Left Wing
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // Middle Spaces
            int spaces = 2 * (n - row);
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            // Right Wing
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}