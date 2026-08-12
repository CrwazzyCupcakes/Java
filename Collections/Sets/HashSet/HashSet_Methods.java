import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Methods {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);                // add() -> inserts, ignores duplicates
        set.add(20);
        set.add(30);
        set.add(20);                // duplicate, ignored
        System.out.println(set);    // order not guaranteed

        System.out.println(set.contains(20));   // contains() -> true/false check

        set.remove(10);              // remove(element) -> deletes by value
        System.out.println(set);

        System.out.println(set.size());          // size() -> number of elements

        System.out.println(set.isEmpty());       // isEmpty() -> true if size == 0

        HashSet<Integer> other = new HashSet<>();
        other.add(30);
        other.add(40);
        other.add(50);

        // ---- Set operations ----
        HashSet<Integer> union = new HashSet<>(set);
        union.addAll(other);         // addAll() -> union of two sets
        System.out.println("Union: " + union);

        HashSet<Integer> intersection = new HashSet<>(set);
        intersection.retainAll(other);  // retainAll() -> intersection
        System.out.println("Intersection: " + intersection);

        HashSet<Integer> difference = new HashSet<>(set);
        difference.removeAll(other);    // removeAll() -> difference
        System.out.println("Difference: " + difference);

        // safe removal while looping -> use Iterator
        Iterator<Integer> it = union.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();          // iterator.remove() -> safe delete
            }
        }
        System.out.println(union);

        for (int n : union) {         // enhanced for-loop -> read all elements
            System.out.print(n + " ");
        }
        System.out.println();

        union.clear();                // clear() -> removes everything
        System.out.println(union);    // []
    }
}