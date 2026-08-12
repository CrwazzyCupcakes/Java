import java.util.HashMap;

public class HashMap_Creation {
    public static void main(String[] args) {

        // HashMap<String, Integer> ageMap = new HashMap<>();

        // HashMap             -> class from java.util. Stores data as
        //                        KEY-VALUE pairs in a hash table.
        //                        Keys are unique, values can repeat.

        // <String, Integer>   -> TWO generic type parameters this time:
        //                        first is the KEY type, second is the
        //                        VALUE type. Here: String keys mapped
        //                        to Integer values.

        // String, Integer     -> both must be objects (generics rule),
        //                        so Integer wrapper is used, not int.

        // new HashMap<>()     -> constructor call, creates the object.

        // <>                  -> diamond operator, infers <String, Integer>
        //                        from the left side automatically.
        HashMap<String, Integer> ageMap = new HashMap<>();

        // put(key, value) -> inserts a key-value pair
        ageMap.put("Messi", 10);
        ageMap.put("Cristiano", 7);

        System.out.println(ageMap);   // {Messi=10, Cristiano=7} order not guaranteed

        System.out.println(ageMap.size());

        // NOTE: HashMap allows ONE null key and multiple null values.
        // Order is NOT guaranteed - use LinkedHashMap if insertion
        // order matters, or TreeMap if sorted key order is needed.
    }
}