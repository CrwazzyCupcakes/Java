// Imports all classes from Shapes package
import Shapes.*;

// Imports Shape class
import Shapes.Shape;

// Imports Scanner class for user input
import java.util.Scanner;

// Main class for mensuration calculations
public class Mensuration_Package {
    public static void main(String[] args) {
        // Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Displays available shape options
        System.out.println("Enter :\n1. For Rectangle\n2. For Square" +
                "\n3. For Circle\n4. For Sphere\n5. For Cylinder");

        // Takes user choice
        int choice = sc.nextInt();

        // Selects calculation based on user choice
        switch(choice){
            // Rectangle case
            case 1:
            {
                // Creating Rectangle object
                Shape.Rectangle r = new Shape.Rectangle();

                // Taking length and breadth
                System.out.println("Enter length and breadth : ");
                int l = sc.nextInt();
                int b = sc.nextInt();

                // Setting rectangle values
                r.setter(l,b);

                // Displaying rectangle results
                System.out.println("Perimeter : "+r.perimeter());
                System.out.println("Area : "+r.area());
                break;
            }
            // Square case
            case 2:
            {
                // Creating Square object
                Shape.Square s = new Shape.Square();

                // Taking side length
                System.out.println("Enter side length : ");
                int a = sc.nextInt();

                // Setting square value
                s.setter(a);

                // Displaying square results
                System.out.println("Perimeter : "+s.perimeter());
                System.out.println("Area : "+s.area());
                break;
            }
            // Circle case
            case 3:
            {
                // Creating Circle object
                Shape.Circle c = new Shape.Circle();

                // Taking radius
                System.out.println("Enter radius : ");
                int r = sc.nextInt();

                // Setting circle value
                c.setter(r);

                // Displaying circle results
                System.out.println("Perimeter : "+c.perimeter());
                System.out.println("Area : "+c.area());
                break;
            }
            // Sphere case
            case 4:
            {
                // Creating Sphere object
                Shape.Sphere s = new Shape.Sphere();

                // Taking radius
                System.out.println("Enter radius : ");
                int r = sc.nextInt();

                // Setting sphere value
                s.setter(r);

                // Displaying sphere results
                System.out.println("Area : "+s.area());
                System.out.println("Volume : "+s.volume());
                break;
            }
            // Cylinder case
            case 5:
            {
                // Creating Cylinder object
                Shape.Cylinder c = new Shape.Cylinder();

                // Taking radius and height
                System.out.println("Enter radius and height : ");
                int r = sc.nextInt();
                int h = sc.nextInt();

                // Setting cylinder values
                c.setter(r,h);

                // Displaying cylinder results
                System.out.println("Area : "+c.area());
                System.out.println("Volume : "+c.volume());
                break;
            }
            // Runs for invalid choice
            default:
            {
                System.out.println("Wrong choice");
            }
        }
    }
}
