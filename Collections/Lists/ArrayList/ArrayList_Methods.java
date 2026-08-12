import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);          // add(element) -> inserts at end
        list.add(20);
        list.add(30);
        list.add(1, 99);       // add(index, element) -> inserts at position
        System.out.println(list);              // [10, 99, 20, 30]

        int val = list.get(2);                 // get(index) -> access element
        System.out.println(val);               // 20

        list.set(0, 55);                       // set(index, element) -> replace
        System.out.println(list);              // [55, 99, 20, 30]

        list.remove(1);                        // remove(int) -> removes by INDEX
        System.out.println(list);              // [55, 20, 30] 

        list.remove(Integer.valueOf(30));      // remove(Object) -> removes by VALUE
        System.out.println(list);              // [55, 20]

        System.out.println(list.size());       // size() -> number of elements

        System.out.println(list.contains(20)); // contains() -> true/false check

        System.out.println(list.indexOf(20));  // indexOf() -> position, -1 if absent

        System.out.println(list.isEmpty());    // isEmpty() -> true if size == 0

        list.add(5);
        Collections.sort(list);                // sort() -> ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // sort descending
        System.out.println(list);

        // safe removal while looping -> use Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();                   // iterator.remove() -> safe delete
            }
        }
        System.out.println(list);

        // enhanced for-loop -> simplest way to read all elements
        for (int n : list) {
            System.out.print(n + " ");
        }
        System.out.println();

        list.clear();                          // clear() -> removes everything
        System.out.println(list);              // []
    }
}