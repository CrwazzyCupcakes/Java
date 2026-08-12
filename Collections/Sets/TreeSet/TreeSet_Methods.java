import java.util.TreeSet;

public class TreeSet_Methods {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);                 // add() -> insert, keeps sorted automatically
        set.add(10);
        set.add(30);
        set.add(20);
        System.out.println(set);     // [10, 20, 30, 50] - always sorted

        System.out.println(set.first());   // first() -> smallest element
        System.out.println(set.last());    // last() -> largest element

        System.out.println(set.contains(30)); // contains() -> true/false check

        set.remove(10);               // remove(element) -> deletes by value
        System.out.println(set);

        System.out.println(set.size());       // size() -> number of elements

        // ---- TreeSet-specific navigation methods (its main power) ----
        System.out.println(set.higher(20));   // higher() -> smallest element STRICTLY greater
        System.out.println(set.lower(30));    // lower()  -> largest element STRICTLY smaller
        System.out.println(set.ceiling(25));  // ceiling() -> smallest element >= given value
        System.out.println(set.floor(25));    // floor()   -> largest element <= given value

        System.out.println(set.pollFirst());  // pollFirst() -> removes AND returns smallest
        System.out.println(set.pollLast());   // pollLast()  -> removes AND returns largest
        System.out.println(set);

        set.add(5); set.add(15); set.add(25); set.add(35);

        System.out.println(set.headSet(20));   // headSet(x) -> all elements < x
        System.out.println(set.tailSet(20));   // tailSet(x) -> all elements >= x
        System.out.println(set.subSet(15, 30)); // subSet(a,b) -> elements in [a, b)

        for (int n : set) {           // enhanced for-loop -> gives sorted order for free
            System.out.print(n + " ");
        }
        System.out.println();

        set.clear();                  // clear() -> removes everything
        System.out.println(set);      // []
    }
}