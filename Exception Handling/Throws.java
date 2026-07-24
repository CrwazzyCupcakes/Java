import java.util.Scanner;

public class Throws {

    // "throws" tells the caller that this method
    // may throw an exception.
    //
    // It does NOT actually throw the exception here.
    // It simply declares the possibility.
    //
    // Syntax:
    // returnType methodName() throws ExceptionType

    static void checkAge(int age) throws Exception {

        // If age is less than 18, we explicitly
        // throw an exception using "throw".
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }

        System.out.println("You are eligible.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        try {
            // Calling a method that has declared
            // "throws Exception".
            checkAge(age);
        }
        catch (Exception e) {
            // The exception is handled here.
            System.out.println(e.getMessage());
        }
    }
}