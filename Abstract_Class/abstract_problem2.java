/*
 * Abstract Class Practice Problem
 *
 * Question:
 * Create a class Fountain_Pen that inherits from Pen.
 * Add an extra method change_nip().
 */

// Fountain_Pen inherits from Pen
class Fountain_Pen extends Pen {

    // Implementation of the abstract method Write()
    @Override
    void Write() {
        System.out.println("Hello Hi");
    }

    // Implementation of the abstract method Refill()
    @Override
    void Refill() {
        System.out.println("Gel");
    }

    // Additional method specific to Fountain_Pen
    void change_nip() {
        System.out.println("Change to ball point");
    }
}

/*
 * Main class
 */
public class abstract_problem2 {

    public static void main(String[] args) {

        // Creating an object of Fountain_Pen
        Fountain_Pen p = new Fountain_Pen();

        // Calling inherited methods
        p.Write();
        p.Refill();

        // Calling method specific to Fountain_Pen
        p.change_nip();
    }
}