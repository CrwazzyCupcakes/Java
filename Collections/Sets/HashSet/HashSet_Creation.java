import java.util.HashSet;

public class HashSet_Creation {
    public static void main(String[] args) {

        // HashSet<Integer> numbersSet = new HashSet<>();

        // HashSet           -> class from java.util. Implements the
        //                      Set interface. Stores elements using
        //                      a HASH TABLE internally (backed by a
        //                      HashMap under the hood).

        // <Integer>         -> generic type parameter, same concept
        //                      as ArrayList/LinkedList. Only Integer
        //                      objects allowed, checked at compile time.

        // Integer, not int  -> generics need objects, not primitives,
        //                      so wrapper class is used.

        // new HashSet<>()   -> constructor call, creates the object
        //                      with a default internal capacity.

        // <>                -> diamond operator, infers <Integer>
        //                      from the left side automatically.
        HashSet<Integer> numbersSet = new HashSet<>();

        // add() -> inserts element (duplicates automatically ignored)
        numbersSet.add(10);
        numbersSet.add(20);
        numbersSet.add(10);   // duplicate - won't be added again

        System.out.println(numbersSet);   // [10, 20] (order not guaranteed)

        System.out.println(numbersSet.size());   // 2, not 3

        // NOTE: HashSet does NOT maintain insertion order (unlike
        // ArrayList/LinkedList). If order matters, use LinkedHashSet.
        // If sorted order is needed, use TreeSet.
    }
}