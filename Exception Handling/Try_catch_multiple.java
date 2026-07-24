import java.util.*;

public class Try_catch_multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ══════════════════════════════════════════
        // MULTIPLE CATCH BLOCKS
        // only ONE catch block runs — the first match
        // order matters — specific exceptions first!
        // ══════════════════════════════════════════
        try
        {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);    // ❌ ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e)
        {
            System.out.println("arithmetic : " + e.getMessage());  // skipped
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array error : " + e.getMessage()); // ✅ this runs
        }
        catch (Exception e)
        {
            // Exception is the parent of ALL exceptions
            // acts like a catch-all / default case
            // always put this LAST — most general goes last
            System.out.println("general error : " + e.getMessage());
        }

        sc.close();
    }
}