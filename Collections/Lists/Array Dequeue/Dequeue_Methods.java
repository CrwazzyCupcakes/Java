import java.util.ArrayDeque;

public class Dequeue_Methods {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);        // addFirst() -> insert at front, O(1)
        deque.addLast(20);         // addLast() -> insert at end, O(1)
        deque.offerFirst(5);       // offerFirst() -> insert at front (queue-safe)
        deque.offerLast(30);       // offerLast() -> insert at end (queue-safe)
        System.out.println(deque); // [5, 10, 20, 30]

        System.out.println(deque.getFirst());   // getFirst() -> peek front, throws if empty
        System.out.println(deque.getLast());    // getLast() -> peek end, throws if empty

        System.out.println(deque.peekFirst());  // peekFirst() -> peek front, returns null if empty
        System.out.println(deque.peekLast());   // peekLast() -> peek end, returns null if empty

        deque.removeFirst();       // removeFirst() -> delete front, throws if empty
        deque.removeLast();        // removeLast() -> delete end, throws if empty
        System.out.println(deque); // [10, 20]

        deque.addFirst(1);
        deque.addLast(40);

        // ---- Using ArrayDeque as a STACK (LIFO) ----
        deque.push(99);             // push() -> insert at front
        System.out.println(deque);
        System.out.println(deque.pop());   // pop() -> remove and return front element
        System.out.println(deque);

        // ---- Using ArrayDeque as a QUEUE (FIFO) ----
        deque.offer(50);            // offer() -> insert at end
        System.out.println(deque.poll());  // poll() -> remove and return front element
        System.out.println(deque);

        System.out.println(deque.contains(20));  // contains() -> true/false check

        System.out.println(deque.size());        // size() -> number of elements

        System.out.println(deque.isEmpty());      // isEmpty() -> true if size == 0

        for (int n : deque) {       // enhanced for-loop -> read all elements
            System.out.print(n + " ");
        }
        System.out.println();

        deque.clear();               // clear() -> removes everything
        System.out.println(deque);   // []
    }
}