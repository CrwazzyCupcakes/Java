// Declares this class as part of the animals package
package animals;

// Class showing default access inside same package
class Bruno
{
    // Method for testing Default_Dog access
    void test()
    {
        // Creating Default_Dog object
        Default_Dog d = new Default_Dog();
        d.name = "Bruno";     // ✅ works — same package
        d.bark();             // ✅ works — same package
    }
}
