import java.util.TreeMap;

public class TreeMap_Creation {
    public static void main(String[] args) {

        // TreeMap<String, Integer> ageMap = new TreeMap<>();

        // TreeMap             -> class from java.util. Stores key-value
        //                        pairs like HashMap, but ALSO keeps
        //                        keys sorted at all times. Internally
        //                        backed by a Red-Black Tree.

        // <String, Integer>   -> two generic type parameters: KEY type
        //                        first, VALUE type second. Here: String
        //                        keys mapped to Integer values.

        // String, Integer     -> keys must implement Comparable
        //                        (String already does - alphabetical
        //                        order), OR you pass a Comparator to
        //                        the constructor.

        // new TreeMap<>()     -> constructor call, creates the object.
        //                        Uses natural key ordering by default.

        // <>                  -> diamond operator, infers <String, Integer>
        //                        from the left side automatically.
        TreeMap<String, Integer> ageMap = new TreeMap<>();

        ageMap.put("Afnan", 20);
        ageMap.put("Zara", 25);
        ageMap.put("Riley", 22);

        System.out.println(ageMap);   // {Afnan=20, Riley=22, Zara=25} - sorted by KEY

        System.out.println(ageMap.size());

        // NOTE: unlike HashMap, TreeMap does NOT allow a null key
        // (throws NullPointerException), since it needs to compare
        // keys to keep them sorted. Null VALUES are still allowed.
    }
}