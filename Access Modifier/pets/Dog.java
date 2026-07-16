// File 2: Dog.java
// Declares this class as part of the pets package
package pets;                     // DIFFERENT package from Animal

// Imports parent Animal class
import animals.Animal;

// Dog inherits protected members from Animal
public class Dog extends Animal   // Dog INHERITS from Animal
        // 'extends' = Dog is a subclass of Animal
{
    // Public method for dog sound
    public void bark()
    {
        name = "Bruno";           // ✅ works — Dog is a subclass so it
        breathe();                //    can access protected members
        System.out.println(name + " says Woof!");
    }
}
