import java.util.ArrayDeque;

public class Dequeue_Creation {
    public static void main(String[] args) {

        // ArrayDeque<Integer> numbersDeque = new ArrayDeque<>();

        // ArrayDeque        -> class from java.util. Implements the
        //                      Deque (Double Ended Queue) interface.
        //                      Backed internally by a resizable array
        //                      (circular array), NOT nodes like
        //                      LinkedList.

        // <Integer>         -> generic type parameter, same concept
        //                      as ArrayList/LinkedList. Only Integer
        //                      objects allowed, checked at compile time.

        // Integer, not int  -> generics need objects, not primitives,
        //                      so wrapper class is used.

        // new ArrayDeque<>() -> constructor call, creates the object
        //                       with a default internal capacity.

        // <>                 -> diamond operator, infers <Integer>
        //                       from the left side automatically.
        ArrayDeque<Integer> numbersDeque = new ArrayDeque<>();

        // addFirst() / addLast() -> insert at either end, O(1) since
        // it's a circular array under the hood (no shifting needed).
        numbersDeque.addLast(10);
        numbersDeque.addFirst(5);

        System.out.println(numbersDeque);   // [5, 10]

        System.out.println(numbersDeque.size());

        // NOTE: ArrayDeque does NOT allow null elements
        // (unlike LinkedList, which does).
    }
}