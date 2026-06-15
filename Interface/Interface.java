interface Shape{
    int a=5;
    void Area();
    //void Perimeter(); // in iterfaces you have to implement all
    // the methods in derived class
}

class Circle implements Shape {
    float r = 5;
    int a = 10;

    public void Area() {
        System.out.println("Area of circle = " + 22 * r * r / 7);
    }
}

class Rectangle implements Shape{
    float l=2;
    float b=3;
    int a=10;
    public void Area(){
        System.out.println("Area of rectangle = "+l*b);
    }
}

public class Interface {
    public static void main() {
        Shape c = new Circle(); // not if Base name = new Derived
        Rectangle r = new Rectangle(); // overrides const. only if Derived name = new Derived
        c.Area();
        r.Area();
        System.out.println(c.a);
        System.out.println(r.a);
    }
}