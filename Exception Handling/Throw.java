import java.util.Scanner;

public class Throw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age =  sc.nextInt();

        // "throw" is used to manually / explicitly
        // throw an exception.
        //
        // Syntax:
        // throw new ExceptionType();

        if (age < 18) {
            throw new ArithmeticException("You are not eligible.");
        }

        System.out.println("You are eligible.");
    }
}