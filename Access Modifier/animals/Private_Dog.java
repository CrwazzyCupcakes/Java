// Declares this class as part of the animals package
package animals;

// Class for private access example
public class Private_Dog
{
    private String name;      // private — only Dog class can touch this
    private int age;          // private — only Dog class can touch this

    // ✅ Dog class CAN access its own private fields
    // Public method for setting name
    public void setName(String name)
    {
        this.name = name;     // ✅ works — inside same class
    }

    // Public method for getting name
    public String getName()
    {
        return name;          // ✅ works — inside same class
    }

    // Public method for setting age
    public void setAge(int age)
    {
        this.age = age;     // ✅ works — inside same class
    }

    // Public method for getting age
    public int getAge()
    {
        return age;          // ✅ works — inside same class
    }
}
