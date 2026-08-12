import java.util.LinkedHashSet;

public class Linked_HashSet {
    static void main(String[] args) {
        LinkedHashSet<Integer> numbersSet = new LinkedHashSet<>();

        numbersSet.add(10);
        numbersSet.add(20);
        numbersSet.add(30);
        numbersSet.add(10);
        numbersSet.add(40);

        System.out.println(numbersSet); // Just maintains the order unlike HashSet
    }
}
