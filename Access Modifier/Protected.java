// Imports Dog class from pets package
import pets.Dog;

// Main class for protected access example
public class Protected
{
    public static void main(String[] args)
    {
        // Creating Dog object
        Dog d = new Dog();

        // Calling public method
        d.bark();                 // ✅ works

        // d.name = "test";      // ❌ ERROR — Main is not a subclass
        // d.breathe();          // ❌ ERROR — Main is not a subclass
    }
}
