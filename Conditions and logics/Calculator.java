import java.util.Scanner;

public class Calculator {

    // Addition Method
    public static void add(int a, int b) {
        System.out.println("Result = " + (a + b));
    }

    // Subtraction Method
    public static void sub(int a, int b) {
        System.out.println("Result = " + (a - b));
    }

    // Multiplication Method
    public static void mul(int a, int b) {
        System.out.println("Result = " + (a * b));
    }

    // Division Method
    public static void div(int a, int b) {

        // Prevent division by zero
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return;
        }

        System.out.println("Result = " + (a / b));
    }

    // Modulus Method
    public static void mod(int a, int b) {

        if (b == 0) {
            System.out.println("Cannot perform modulus by zero!");
            return;
        }

        System.out.println("Result = " + (a % b));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Enter:
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Modulus
                """);

        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {

            case 1:
                add(a, b);
                break;

            case 2:
                sub(a, b);
                break;

            case 3:
                mul(a, b);
                break;

            case 4:
                div(a, b);
                break;

            case 5:
                mod(a, b);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}