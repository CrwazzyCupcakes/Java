import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Anonymous_and_Lambda {

    // ============================================================
    // Abstract class - used later to show where lambdas CAN'T be
    // used, only anonymous classes can.
    // ============================================================
    static abstract class Animal {
        abstract void makeSound();
    }

    // ============================================================
    // Functional interface - an interface with EXACTLY ONE abstract
    // method. Required for lambdas to work (Runnable, Comparator,
    // and this custom one below all qualify).
    // ============================================================
    interface Greeting {
        void greet(String name);
    }

    public static void main(String[] args) {

        // ------------------------------------------------------
        // ANONYMOUS CLASS - a class with NO NAME, defined and
        // instantiated in one place. Used to override a method
        // inline, without creating a separate named class file.
        // ------------------------------------------------------
        Runnable r1 = new Runnable() {
            @Override
            public void run() {                 // overriding run() inline
                System.out.println("Running (anonymous class)");
            }
        };
        r1.run();


        // ------------------------------------------------------
        // LAMBDA EXPRESSION - shorthand for an anonymous class,
        // but ONLY works with functional interfaces (single
        // abstract method). Same result as above, way less code.
        // ------------------------------------------------------
        Runnable r2 = () -> System.out.println("Running (lambda)");
        // ()  -> no parameters needed for run()
        // ->  -> separates parameters from the body
        r2.run();


        // ------------------------------------------------------
        // Anonymous class implementing a custom functional interface
        // ------------------------------------------------------
        Greeting g1 = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hello, " + name + " (anonymous class)");
            }
        };
        g1.greet("Afnan");

        // same thing as a lambda
        Greeting g2 = (name) -> System.out.println("Hello, " + name + " (lambda)");
        g2.greet("Afnan");


        // ------------------------------------------------------
        // Anonymous class as a Comparator - OLD style sorting
        // ------------------------------------------------------
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30); list.add(10); list.add(20);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;                    // ascending order
            }
        });
        System.out.println(list);


        // ------------------------------------------------------
        // Same sort using a LAMBDA - this is what you've already
        // used before in your ArrayList/PriorityQueue notes
        // ------------------------------------------------------
        list.sort((a, b) -> b - a);              // descending order this time
        System.out.println(list);


        // ------------------------------------------------------
        // WHERE LAMBDAS CANNOT BE USED - abstract classes.
        // Lambdas only work for interfaces with ONE abstract method,
        // NOT for abstract classes. Must use anonymous class here.
        // ------------------------------------------------------
        Animal cat = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Meow");
            }
        };
        cat.makeSound();

        // Animal dog = () -> System.out.println("Woof");  // ERROR - won't compile!
        // Lambdas need a functional INTERFACE, not an abstract class.


        // ------------------------------------------------------
        // forEach() with lambda - common pattern you've used before
        // ------------------------------------------------------
        list.forEach(n -> System.out.println("Value: " + n));

        // method reference - even shorter version of a lambda,
        // used when the lambda ONLY calls one existing method
        list.forEach(System.out::println);


        // ============================================================
        // QUICK SUMMARY:
        //  - Anonymous class -> no name, inline class definition,
        //    works with interfaces AND abstract classes, more verbose
        //  - Lambda -> shorthand for anonymous class, ONLY works with
        //    functional interfaces (single abstract method), concise
        //  - Use lambdas whenever possible (cleaner, modern standard)
        //  - Fall back to anonymous class only for abstract classes,
        //    multi-method interfaces, or when you need extra state
        // ============================================================
    }
}