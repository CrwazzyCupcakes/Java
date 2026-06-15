/*
 * Abstract Class Practice Problem
 *
 * Question:
 * Create an abstract class Pen with methods Write() and Refill().
 * Then create a concrete class Trimax that implements these methods.
 */

// Abstract class
abstract class Pen {

    // Abstract method for writing
    // Child classes must provide an implementation
    abstract void Write();

    // Abstract method for refilling the pen
    // Child classes must provide an implementation
    abstract void Refill();
}

// Trimax inherits from Pen
class Trimax extends Pen {

    // Implementation of Write()
    @Override
    void Write() {
        System.out.println("Hello Hi");
    }

    // Implementation of Refill()
    @Override
    void Refill() {
        System.out.println("Gel");
    }
}

/*
 * Main class
 * Program execution starts from main().
 */
public class abstract_problem1 {

    public static void main(String[] args) {

        // Creating an object of Trimax
        Trimax p = new Trimax();

        // Calling methods
        p.Write();
        p.Refill();
    }
}