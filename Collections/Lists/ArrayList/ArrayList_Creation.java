import java.util.ArrayList;

public class ArrayList_Creation {
    public static void main(String[] args) {

        // ArrayList<Integer> numbersList = new ArrayList<>();

        // ArrayList        -> the class itself, from java.util.
        //                     A resizable, array-backed list.

        // <Integer>        -> (left side) the GENERIC TYPE PARAMETER.
        //                     Declares this ArrayList can only hold
        //                     Integer objects. Enforced at compile
        //                     time - can't accidentally add a String
        //                     or Double into it later.

        // Integer, not int -> generics only work with OBJECTS, not
        //                     primitives. That's why the wrapper
        //                     class (Integer) is used instead of
        //                     the primitive (int).

        // new ArrayList<>() -> the constructor call that actually
        //                      creates the ArrayList object in memory.

        // <>                -> (diamond operator, right side) tells
        //                      Java to auto-infer the generic type
        //                      from the left side, so you don't repeat
        //                      <Integer> again. Pre-Java 7 style
        //                      required writing it fully on both sides:
        //                      new ArrayList<Integer>()
        ArrayList<Integer> numbersList = new ArrayList<>();

        // add()      -> method that inserts an element at the end
        //               of the list.
        // Autoboxing -> when add(10) is called, the primitive int
        //               value 10 is automatically converted (wrapped)
        //               into an Integer object, since ArrayList can
        //               only store objects, not primitives.
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);

        // toString() -> ArrayList overrides toString() internally,
        //               so printing it directly displays elements
        //               as [10, 20, 30] - no manual loop needed.
        System.out.println(numbersList);

        // size() -> returns the current number of elements stored
        //           in the list.
        System.out.println(numbersList.size());
    }
}