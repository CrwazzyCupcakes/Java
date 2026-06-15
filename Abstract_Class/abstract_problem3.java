/*
 * Abstract Class Practice Problem
 *
 * Question:
 * Create an abstract class Telephone with methods:
 * Ring(), Lift(), and Hang().
 *
 * Then create a SmartTelephone class that implements these methods.
 */

// Abstract class
abstract class Telephone {

    // Method to make the phone ring
    abstract void Ring();

    // Method to answer the call
    abstract void Lift();

    // Method to disconnect the call
    abstract void Hang();
}

// SmartTelephone inherits from Telephone
class SmartTelephone extends Telephone {

    // Implementation of Ring()
    @Override
    void Ring() {
        System.out.println("Ringing...");
    }

    // Implementation of Lift()
    @Override
    void Lift() {
        System.out.println("Hello!");
    }

    // Implementation of Hang()
    @Override
    void Hang() {
        System.out.println("Hanging up...");
    }
}

/*
 * Main class
 */
public class abstract_problem3 {

    public static void main(String[] args) {

        // Parent class reference pointing to a child class object
        Telephone t = new SmartTelephone();

        // Calling overridden methods
        t.Ring();
        t.Lift();
        t.Hang();
    }
}