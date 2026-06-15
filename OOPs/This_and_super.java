class Base {
    // Default (no-argument) constructor
    public Base() {
        System.out.println("This is the base constructor");
    }
    
    // Overloaded constructor accepting an integer parameter
    public Base(int x) {
        System.out.println("This is the base constructor with one value");
    }
}

class Derived extends Base {
    // Constructor for the subclass
    public Derived(int x) {
        // 'super(x)' explicitly invokes the parent constructor that matches this parameter signature.
        // If this line was omitted, Java would automatically call the empty 'Base()' constructor instead.
        super(x);   
        System.out.println("This is the Derived constructor");
    }
}

class This {
    private int x; // Instance variable (belongs to the specific object)

    public int get(int x) {
        // 'this.x' refers to the instance variable above.
        // 'x' refers to the local method parameter.
        // This resolves shadowing where both variables share the same name.
        this.x = x;   
        return this.x; // Returning the updated instance variable
    }
}

public class This_and_super {
    public static void main(String[] args) {
        // Instantiating the Derived class triggers the constructor chain
        Derived afnan = new Derived(5);
        
        System.out.println(); // Blank line for clean output separation
        
        // Testing the 'this' keyword implementation
        This omen = new This();
        System.out.println("Returned value from get(): " + omen.get(10));
    }    
}