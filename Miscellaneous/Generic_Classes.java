public class Generic_Classes {

    // ============================================================
    // GENERIC CLASS - a class that works with ANY type, decided
    // when you create an object of it. You've already been USING
    // generics this whole time (ArrayList<Integer>, HashMap<K,V>) -
    // this is how to BUILD your own class that works the same way.
    // ============================================================

    // <T> after the class name -> declares a TYPE PARAMETER.
    // "T" is just a placeholder name (convention: single uppercase
    // letter) - it means "some type, decided later by whoever uses
    // this class." Could be named anything, but T (Type) is standard.
    static class Box<T> {
        private T item;    // field type is T - unknown until the class is used

        // constructor also uses T
        public Box(T item) {
            this.item = item;
        }

        public T getItem() {          // return type T
            return item;
        }

        public void setItem(T item) { // parameter type T
            this.item = item;
        }
    }


    // ------------------------------------------------------
    // Generic class with MULTIPLE type parameters - same idea as
    // HashMap<K, V> using two generic types (key type, value type)
    // ------------------------------------------------------
    static class Pair<A, B> {
        private A first;
        private B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        public A getFirst() { return first; }
        public B getSecond() { return second; }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }


    // ------------------------------------------------------
    // Generic method - a method with its OWN type parameter,
    // independent of the class it's in (notice <T> before the
    // return type). Useful for utility/helper methods.
    // ------------------------------------------------------
    static <T> void printItem(T item) {
        System.out.println("Item: " + item);
    }


    // ------------------------------------------------------
    // Bounded type parameter - restricts T to only types that
    // extend/implement a certain class or interface (here: Number,
    // so only Integer, Double, Float etc. are allowed, not String)
    // ------------------------------------------------------
    static class NumericBox<T extends Number> {
        private T number;

        public NumericBox(T number) {
            this.number = number;
        }

        public double getDoubleValue() {
            return number.doubleValue();   // safe - Number guarantees this method exists
        }
    }


    public static void main(String[] args) {

        // ------------------------------------------------------
        // Using Box<T> with different types - SAME class, DIFFERENT
        // types plugged in at creation time. This is the entire
        // point of generics: one class definition, reusable safely
        // for many types, with compile-time type checking.
        // ------------------------------------------------------
        Box<Integer> intBox = new Box<>(10);
        System.out.println(intBox.getItem());          // 10

        Box<String> stringBox = new Box<>("Afnan");
        System.out.println(stringBox.getItem());        // Afnan

        // intBox.setItem("text");   // ERROR - Box<Integer> only accepts Integer


        // ------------------------------------------------------
        // Using Pair<A, B> - two independent types at once
        // ------------------------------------------------------
        Pair<String, Integer> student = new Pair<>("Afnan", 20);
        System.out.println(student);                    // (Afnan, 20)
        System.out.println(student.getFirst());          // Afnan
        System.out.println(student.getSecond());         // 20


        // ------------------------------------------------------
        // Using the generic method - type is inferred automatically
        // from whatever argument you pass in
        // ------------------------------------------------------
        printItem(100);           // T becomes Integer
        printItem("Hello");        // T becomes String
        printItem(3.14);           // T becomes Double


        // ------------------------------------------------------
        // Using the bounded generic class - only Number subtypes allowed
        // ------------------------------------------------------
        NumericBox<Integer> nBox = new NumericBox<>(42);
        System.out.println(nBox.getDoubleValue());      // 42.0

        // NumericBox<String> sBox = new NumericBox<>("text"); // ERROR - String is not a Number


        // ============================================================
        // WHY GENERICS MATTER:
        //  - COMPILE-TIME TYPE SAFETY - catches wrong-type mistakes
        //    before running the program, not with a runtime crash
        //  - NO CASTING NEEDED - without generics (old Java), you'd
        //    have to manually cast Object back to the real type every
        //    time you retrieved something, which is error-prone
        //  - CODE REUSE - one Box/Pair class works for ANY type,
        //    instead of writing IntBox, StringBox, DoubleBox separately
        //  - This is EXACTLY how ArrayList<T>, HashMap<K,V>, and every
        //    other collection you've used is built internally
        // ============================================================
    }
}