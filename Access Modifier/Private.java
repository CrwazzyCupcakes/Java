// Imports Private_Dog class from animals package
import animals.Private_Dog;

// Main class for private access example
public class Private
{
    public static void main(String[] args)
    {
        // Creating Private_Dog object
        Private_Dog d = new Private_Dog();

        //d.name = "Bruno";     // ❌ ERROR — private field!
        //d.age = 5;            // ❌ ERROR — private field!

        // Using public setter method
        d.setName("Bruno");   // ✅ works — public method

        // Using public getter method
        System.out.println(d.getName());          // ✅ works — public method

        // Using public setter method
        d.setAge(5);          // ✅ works — public method

        // Using public getter method
        System.out.println(d.getAge());           // ✅ works — public method
    }
}
