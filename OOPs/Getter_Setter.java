// ══════════════════════════════════════════
// CLASS 1: Employee
// Represents an Employee with an id and name
// Uses ENCAPSULATION — fields are private and
// accessed only through public getter/setter methods
// NOTE: Not public because only one public class allowed per file
// ══════════════════════════════════════════
class Employee
{
    // Private fields — cannot be accessed directly from outside this class
    // This is ENCAPSULATION: hiding data and protecting it from direct modification
    private int id;      // Stores the employee's ID number
    private String name; // Stores the employee's name

    // ══════════════════════════════════════════
    // GETTERS — methods that RETRIEVE the value of private fields
    // They are public so they can be called from outside the class
    // ══════════════════════════════════════════

    // Returns the employee's ID
    public int getId()
    {
        return id;  // Sends back the value of 'id' to wherever this method was called
    }

    // Returns the employee's name
    public String getName()
    {
        return name;  // Sends back the value of 'name' to wherever this method was called
    }

    // ══════════════════════════════════════════
    // SETTERS — methods that SET/UPDATE the value of private fields
    // They are public so they can be called from outside the class
    // ══════════════════════════════════════════

    // Sets the employee's ID
    // 'x' is the new value passed in from outside
    public void setId(int x)
    {
        // 'this.id' refers to the CLASS field 'id'
        // 'x' is the parameter passed into this method
        // 'this' keyword distinguishes between the field and the parameter
        this.id = x;
    }

    // Sets the employee's name
    // 'x' is the new value passed in from outside
    public void setName(String x)
    {
        this.name = x;  // Assign the passed value to the class field 'name'
    }
}

// ══════════════════════════════════════════
// CLASS 2: Getter_Setter
// Main class — controls the flow of the program
// NOTE: Filename must match this public class → 'Getter_Setter.java'
// ══════════════════════════════════════════
public class Getter_Setter
{
    public static void main(String args[])
    {
        // Create an object of the Employee class
        // 'afnan' is the object name — represents one Employee instance
        Employee afnan = new Employee();

        // Use SETTERS to assign values to the private fields
        // We cannot do 'afnan.name = "Afnan"' directly — it's private!
        // We MUST go through the setter methods
        afnan.setName("Afnan");  // Sets name to "Afnan"
        afnan.setId(10);         // Sets id to 10

        // Use GETTERS to retrieve and print the private field values
        // We cannot do 'afnan.name' directly — it's private!
        // We MUST go through the getter methods
        System.out.println(afnan.getName());  // Prints: Afnan
        System.out.println(afnan.getId());    // Prints: 10

        // NOTE: No Scanner is used in this program (no user input needed)
        //       so sc.close() is not required here ✅
    }
}