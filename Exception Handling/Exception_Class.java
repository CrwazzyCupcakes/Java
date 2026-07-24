import java.util.Scanner;

// ============================================================
// CUSTOM EXCEPTION
// ============================================================
// By extending Exception, we create our own custom exception.
// This exception will be thrown when the age is invalid.
//
// "Age" is a checked exception because it extends Exception
// directly (rather than RuntimeException).
// ============================================================
class Age extends Exception {

    // --------------------------------------------------------
    // toString()
    // --------------------------------------------------------
    // Used to return a custom description of the exception.
    // When we print the exception object directly:
    //
    // System.out.println(e);
    //
    // Java internally calls e.toString().
    // --------------------------------------------------------
    @Override
    public String toString() {
        return "Age should be between (0 - 99).";
    }

    // --------------------------------------------------------
    // getMessage()
    // --------------------------------------------------------
    // Used to return a custom error message.
    //
    // It can be accessed using:
    // System.out.println(e.getMessage());
    // --------------------------------------------------------
    @Override
    public String getMessage() {
        return "Check the entered Age!";
    }
}


// ============================================================
// MAIN CLASS
// ============================================================
public class Exception_Class {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age (years): ");
        int age = sc.nextInt();

        // ========================================================
        // CHECKING THE CONDITION
        // ========================================================
        // If age is outside the valid range, we manually throw
        // our custom Age exception.
        //
        // throw -> used to explicitly throw an exception.
        // ========================================================
        if (age < 0 || age > 99) {

            try {
                // ------------------------------------------------
                // Creating and throwing our custom exception.
                // ------------------------------------------------
                throw new Age();
            }

            // ----------------------------------------------------
            // CATCH BLOCK
            // ----------------------------------------------------
            // The catch block catches the exception thrown by
            // the try block.
            //
            // "Exception" is the parent class of "Age", so it
            // can catch an Age exception as well.
            // ----------------------------------------------------
            catch (Exception e) {

                // ------------------------------------------------
                // getMessage()
                // Output:
                // Check the entered Age!
                // ------------------------------------------------
                System.out.println(e.getMessage());

                // ------------------------------------------------
                // toString()
                // Output:
                // Age should be between (0 - 99).
                //
                // e.toString() is explicitly called here.
                // ------------------------------------------------
                System.out.println(e.toString());

                // ------------------------------------------------
                // You can also simply write:
                //
                // System.out.println(e);
                //
                // This automatically calls e.toString().
                // ------------------------------------------------

                // ------------------------------------------------
                // printStackTrace()
                // ------------------------------------------------
                // Prints detailed information about the exception,
                // including the class name and the line where
                // the exception occurred.
                //
                e.printStackTrace(System.out);
            }
        }

        // ========================================================
        // VALID AGE
        // ========================================================
        // If the age is between 0 and 99, no exception is thrown.
        // ========================================================
        else {
            System.out.println("Age: " + age);
        }
        sc.close();
    }
}