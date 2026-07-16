// Imports Public_Dog class from animals package
import animals.Public_Dog;

// Main class for public access example
public class Public
{
    public static void main(String[] args)
    {
        // Creating Public_Dog object
        Public_Dog d = new Public_Dog();

        d.name = "Bruno";     // ✅ accessible — public field
        d.bark();             // ✅ accessible — public method
    }
}
