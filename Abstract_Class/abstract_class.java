/*
 * Abstract Class Example
 *
 * An abstract class is a class that cannot be instantiated (objects cannot be created directly).
 * It is used as a blueprint for other classes.
 * Abstract methods do not have a body and must be implemented by child classes.
 */

// Abstract class
abstract class Greet {

    // Abstract method
    // Every child class must provide its own implementation of Hello()
    abstract void Hello();
}

// Child class inheriting from Greet
class English extends Greet {

    // Implementing the abstract method
    void Hello() {
        System.out.println("Hello");
    }
}

// Child class inheriting from Greet
class French extends Greet {

    // Implementing the abstract method
    void Hello() {
        System.out.println("Hola"); // Note: "Hola" is Spanish, not French.
        // French greeting should be "Bonjour".
    }
}

// Child class inheriting from Greet
class Spanish extends Greet {

    // Implementing the abstract method
    void Hello() {
        System.out.println("Halo"); // Note: "Halo" is not a Spanish greeting.
        // Spanish greeting should be "Hola".
    }
}

/*
 * Main class
 * Program execution starts from the main() method.
 */
public class abstract_class {

    public static void main(String args[]) {

        // Creating objects of child classes
        English obj1 = new English();
        French obj2 = new French();
        Spanish obj3 = new Spanish();

        // Calling the Hello() method for each object
        // Demonstrates Runtime Polymorphism through method overriding
        obj1.Hello();
        obj2.Hello();
        obj3.Hello();
    }
}