import java.util.LinkedList;

public class LinkedList_Methods {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);              // add(element) -> inserts at end
        list.add(20);
        list.addFirst(5);          // addFirst() -> insert at start, O(1)
        list.addLast(30);          // addLast() -> insert at end, O(1)
        System.out.println(list);  // [5, 10, 20, 30]

        System.out.println(list.getFirst());   // getFirst() -> peek first element
        System.out.println(list.getLast());    // getLast() -> peek last element

        System.out.println(list.get(2));       // get(index) -> access element, O(n)

        list.set(1, 99);           // set(index, element) -> replace
        System.out.println(list);  // [5, 99, 20, 30]

        list.removeFirst();        // removeFirst() -> delete first, O(1)
        list.removeLast();         // removeLast() -> delete last, O(1)
        System.out.println(list);  // [99, 20]

        list.remove(Integer.valueOf(20));  // remove(Object) -> remove by value
        System.out.println(list);          // [99]

        list.add(20);
        list.add(30);

        // Deque-style usage (LinkedList can act as stack/queue)
        list.push(1);               // push() -> insert at front (stack behavior)
        System.out.println(list);   // [1, 99, 20, 30]

        list.pop();                 // pop() -> remove and return front element
        System.out.println(list);

        list.offer(40);             // offer() -> insert at end (queue behavior)
        System.out.println(list);

        list.poll();                // poll() -> remove and return first element
        System.out.println(list);

        System.out.println(list.contains(20));  // contains() -> true/false check

        System.out.println(list.size());        // size() -> number of elements

        for (int n : list) {        // enhanced for-loop -> read all elements
            System.out.print(n + " ");
        }
        System.out.println();

        list.clear();               // clear() -> removes everything
        System.out.println(list);   // []
    }
}