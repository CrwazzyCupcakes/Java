import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Methods {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(50, "fifty");        // put(key, value) -> insert, keeps sorted by key
        map.put(10, "ten");
        map.put(30, "thirty");
        map.put(10, "TEN");          // same key -> overwrites old value
        System.out.println(map);     // {10=TEN, 30=thirty, 50=fifty} sorted by key

        System.out.println(map.get(30));            // get(key) -> returns value, null if absent

        System.out.println(map.getOrDefault(99, "none")); // getOrDefault -> fallback if key missing

        System.out.println(map.containsKey(50));     // containsKey() -> true/false check

        map.remove(30);               // remove(key) -> deletes that pair
        System.out.println(map);

        System.out.println(map.size());        // size() -> number of pairs

        // ---- TreeMap-specific navigation methods (its main power) ----
        map.put(20, "twenty"); map.put(40, "forty");

        System.out.println(map.firstKey());     // firstKey() -> smallest key
        System.out.println(map.lastKey());      // lastKey()  -> largest key

        System.out.println(map.higherKey(20));  // higherKey() -> smallest key STRICTLY greater
        System.out.println(map.lowerKey(40));   // lowerKey()  -> largest key STRICTLY smaller
        System.out.println(map.ceilingKey(25)); // ceilingKey() -> smallest key >= given
        System.out.println(map.floorKey(25));   // floorKey()   -> largest key <= given

        System.out.println(map.firstEntry());   // firstEntry() -> smallest key-value pair
        System.out.println(map.pollFirstEntry()); // pollFirstEntry() -> removes & returns smallest pair
        System.out.println(map);

        System.out.println(map.headMap(40));    // headMap(x) -> all entries with key < x
        System.out.println(map.tailMap(40));    // tailMap(x) -> all entries with key >= x

        // ---- Iterating (sorted order guaranteed) ----
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        map.clear();                  // clear() -> removes everything
        System.out.println(map);      // {}
    }
}