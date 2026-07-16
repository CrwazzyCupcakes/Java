// Declares this class as part of the Shapes package
package Shapes;

// Parent class containing different shape classes
public class Shape {

    // Rectangle class
    public static class Rectangle{
        // Length and breadth of rectangle
        private int l,b;

        // Method for setting length and breadth
        public void setter(int l,int b){
            this.l=l;
            this.b=b;
        }

        // Method for calculating area
        public int area(){
            return l*b;
        }

        // Method for calculating perimeter
        public int perimeter(){
            return 2*(l+b);
        }
    }

    // Square class
    public static class Square{
        // Side length of square
        private int a;

        // Method for setting side length
        public void setter(int a){
            this.a=a;
        }

        // Method for calculating area
        public int area(){
            return a*a;
        }

        // Method for calculating perimeter
        public int perimeter(){
            return 4*a;
        }
    }

    // Circle class
    public static class Circle{
        // Radius of circle
        private int r;

        // Method for setting radius
        public void setter(int r){
            this.r=r;
        }

        // Method for calculating area
        public double area(){
            return 3.14*r*r;
        }

        // Method for calculating circumference
        public double perimeter(){
            return 2*3.14*r;
        }
    }

    // Sphere class
    public static class Sphere{
        // Radius of sphere
        private int r;

        // Method for setting radius
        public void setter(int r){
            this.r=r;
        }

        // Method for calculating surface area
        public double area(){
            return 4*3.14*r*r;
        }

        // Method for calculating volume
        public double volume(){
            return 1.67*3.14*r*r*r;
        }
    }

    // Cylinder class
    public static class Cylinder{
        // Radius and height of cylinder
        private int r,h;

        // Method for setting radius and height
        public void setter(int r, int h){
            this.r=r;
            this.h=h;
        }

        // Method for calculating total surface area
        public double area(){
            return (2*3.14*r*r)+(2*3.14*r*h);
        }

        // Method for calculating volume
        public double volume(){
            return 3.14*r*r*h;
        }
    }

}
