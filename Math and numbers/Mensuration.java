import java.util.*;  // Imports utility package which includes the Scanner class

// ══════════════════════════════════════════
// CLASS 1: Square
// Contains static methods to calculate area and perimeter of a Square
// NOTE: Not public — only one public class allowed per file
// ══════════════════════════════════════════
class Square
{
    // Calculates and prints the area of a square
    // Formula: side × side (x²)
    public static void area(double x)      // 'x' = length of one side
    {
        System.out.println("Area: " + x * x);
    }

    // Calculates and prints the perimeter of a square
    // Formula: 4 × side
    public static void perimeter(double x) // 'x' = length of one side
    {
        System.out.println("Perimeter: " + 4 * x);
    }
}

// ══════════════════════════════════════════
// CLASS 2: Rectangle
// Contains static methods to calculate area and perimeter of a Rectangle
// NOTE: Takes TWO parameters (length and breadth) unlike Square
// ══════════════════════════════════════════
class Rectangle
{
    // Calculates and prints the area of a rectangle
    // Formula: length × breadth (a × b)
    public static void area(double a, double b)      // 'a' = length, 'b' = breadth
    {
        System.out.println("Area: " + a * b);
    }

    // Calculates and prints the perimeter of a rectangle
    // Formula: 2 × (length + breadth)
    public static void perimeter(double a, double b) // 'a' = length, 'b' = breadth
    {
        System.out.println("Perimeter: " + 2 * (a + b));
    }
}

// ══════════════════════════════════════════
// CLASS 3: Circle
// Contains static methods to calculate area and perimeter of a Circle
// NOTE: Uses 3.14 as an approximation for π (Math.PI is more accurate)
// ══════════════════════════════════════════
class Circle
{
    // Calculates and prints the area of a circle
    // Formula: π × radius² (3.14 × x²)
    // NOTE: For better precision use Math.PI instead of 3.14
    public static void area(double x)      // 'x' = radius
    {
        System.out.println("Area: " + 3.14 * x * x);
    }

    // Calculates and prints the perimeter (circumference) of a circle
    // Formula: 2 × π × radius (2 × 3.14 × x)
    public static void perimeter(double x) // 'x' = radius
    {
        System.out.println("Perimeter: " + 2 * 3.14 * x);
    }
}

// ══════════════════════════════════════════
// CLASS 4: Mensuration (Main Class)
// Controls the flow — lets user pick a shape and prints its measurements
// NOTE: Filename must match this public class → 'Mensuration.java'
// ══════════════════════════════════════════
public class Mensuration
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        // Display menu options to the user
        System.out.println("Enter:");
        System.out.println("1. for square");
        System.out.println("2. for rectangle");
        System.out.println("3. for circle");

        int n = sc.nextInt();  // Read user's menu choice

        // Switch statement routes to the correct shape based on user's choice
        // More efficient than multiple if-else blocks for menu-driven programs
        switch (n)
        {
            // ── CASE 1: Square ──
            case 1:
                System.out.println("Enter the length of the side");
                double a = sc.nextDouble();  // Read the side length

                // NOTE: 'first' object is created but never actually used!
                //       Since area() and perimeter() are STATIC methods,
                //       they are called via the CLASS NAME (Square.area())
                //       not through an object. The object creation is redundant.
                //       You can safely remove: Square first = new Square();
                Square first = new Square();  // ⚠️ Redundant — not needed for static methods

                Square.area(a);       // Calculate and print area of square
                Square.perimeter(a);  // Calculate and print perimeter of square
                break;                // ⭐ Exit switch — without break, code falls into case 2!

            // ── CASE 2: Rectangle ──
            case 2:
                System.out.println("Enter the length and breadth");  // Fixed: 'breath' → 'breadth'
                double l = sc.nextDouble();  // Read the length
                double b = sc.nextDouble();  // Read the breadth

                Rectangle second = new Rectangle();  // ⚠️ Redundant — not needed for static methods

                Rectangle.area(l, b);       // Calculate and print area of rectangle
                Rectangle.perimeter(l, b);  // Calculate and print perimeter of rectangle
                break;                      // ⭐ Exit switch

            // ── CASE 3: Circle ──
            case 3:
                System.out.println("Enter the radius");
                double r = sc.nextDouble();  // Read the radius

                Circle third = new Circle();  // ⚠️ Redundant — not needed for static methods

                Circle.area(r);       // Calculate and print area of circle
                Circle.perimeter(r);  // Calculate and print perimeter of circle
                break;                // ⭐ Exit switch

            // ── DEFAULT: Invalid choice ──
            // Runs if user enters anything other than 1, 2, or 3
            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}