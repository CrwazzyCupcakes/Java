// Imports all classes from animals package
import animals.*;

// Main class for calling animal sound methods
public class Sounds {
    public static void main(String[] args) {
        // Creating Dog object
        Dog dog = new Dog();

        // Calling dog sound method
        dog.Bark();

        // Creating Cat object
        Cat cat = new Cat();

        // Calling cat sound method
        cat.Meow();
    }
}
