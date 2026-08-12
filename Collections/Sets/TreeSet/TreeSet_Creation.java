import java.util.TreeSet;

public class TreeSet_Creation {
    public static void main(String[] args) {

        // TreeSet<Integer> numbersSet = new TreeSet<>();

        // TreeSet           -> class from java.util. Implements the
        //                      Set interface (no duplicates), but
        //                      ALSO keeps elements sorted at all times.
        //                      Internally backed by a Red-Black Tree
        //                      (a self-balancing binary search tree).

        // <Integer>         -> generic type parameter. Elements must
        //                      implement Comparable (Integer already
        //                      does - compares numerically), OR you
        //                      pass a custom Comparator to the
        //                      constructor.

        // Integer, not int  -> generics need objects, not primitives,
        //                      so wrapper class is used.

        // new TreeSet<>()   -> constructor call, creates the object.
        //                      Uses natural ordering (Comparable) by
        //                      default if no Comparator is given.

        // <>                -> diamond operator, infers <Integer>
        //                      from the left side automatically.
        TreeSet<Integer> numbersSet = new TreeSet<>();

        numbersSet.add(30);
        numbersSet.add(10);
        numbersSet.add(20);
        numbersSet.add(10);   // duplicate - ignored, same as HashSet

        System.out.println(numbersSet);   // [10, 20, 30] - ALWAYS sorted

        System.out.println(numbersSet.size());

        // NOTE: unlike HashSet, TreeSet does NOT allow null elements
        // (throws NullPointerException), because it needs to compare
        // elements to keep them sorted, and null can't be compared.
    }
}