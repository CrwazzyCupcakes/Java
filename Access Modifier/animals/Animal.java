// File 1: Animal.java
// Declares this class as part of the animals package
package animals;

// Parent class for protected access example
public class Animal
{
    protected String name;        // protected field

    // Protected method for breathing
    protected void breathe()      // protected method
    {
        System.out.println(name + " is breathing");
    }
}
