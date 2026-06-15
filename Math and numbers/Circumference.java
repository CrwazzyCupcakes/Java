import java.util.Scanner;

public class Circumference {

    // Calculates and prints circumference of a circle
    public static void calculateCircumference(double radius) {

        // Formula:
        // Circumference = 2 × π × r
        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference = " + circumference);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        calculateCircumference(radius);

        sc.close();
    }
}