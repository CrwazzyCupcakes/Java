import java.util.HashMap;
import java.util.Map;

public class HashMap_Methods {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 10);        // put(key, value) -> insert or update
        map.put("banana", 20);
        map.put("cherry", 30);
        map.put("apple", 15);        // same key -> overwrites old value
        System.out.println(map);     // {apple=15, banana=20, cherry=30}

        System.out.println(map.get("banana"));        // get(key) -> returns value, null if absent

        System.out.println(map.getOrDefault("mango", 0)); // getOrDefault -> fallback value if key missing

        System.out.println(map.containsKey("cherry")); // containsKey() -> true/false check
        System.out.println(map.containsValue(20));      // containsValue() -> true/false check

        map.remove("banana");        // remove(key) -> deletes that pair
        System.out.println(map);

        System.out.println(map.size());    // size() -> number of pairs
        System.out.println(map.isEmpty()); // isEmpty() -> true if size == 0

        // merge/update pattern - common for frequency counting
        map.put("apple", map.getOrDefault("apple", 0) + 1);
        System.out.println(map);

        // ---- Iterating over a HashMap ----
        for (String key : map.keySet()) {          // keySet() -> all keys
            System.out.println(key);
        }

        for (int value : map.values()) {           // values() -> all values
            System.out.println(value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // entrySet() -> key-value pairs together, most common loop
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        map.clear();                  // clear() -> removes everything
        System.out.println(map);      // {}
    }
}