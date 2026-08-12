import java.util.LinkedList;

public class LinkedList_Creation {
    public static void main(String[] args) {

        // LinkedList<Integer> numbersList = new LinkedList<>();

        // LinkedList        -> class from java.util. Stores elements
        //                      as NODES, each node holding data +
        //                      a reference to the previous and next
        //                      node (doubly linked list).

        // <Integer>         -> generic type parameter, same as
        //                      ArrayList. Only Integer objects allowed,
        //                      checked at compile time.

        // Integer, not int  -> generics need objects, not primitives,
        //                      so wrapper class is used.

        // new LinkedList<>() -> constructor call, creates the object.
        //                       Internally starts with no nodes.

        // <>                -> diamond operator, infers <Integer>
        //                      from the left side automatically.
        LinkedList<Integer> numbersList = new LinkedList<>();

        // addFirst() / addLast() -> LinkedList-specific methods,
        // possible because of its node structure (O(1) at both ends).
        numbersList.add(1);
        numbersList.addLast(10);
        numbersList.addFirst(5);

        System.out.println(numbersList);   // [5, 10]

        System.out.println(numbersList.size());
    }
}