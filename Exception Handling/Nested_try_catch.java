import java.util.*;

public class Nested_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ══════════════════════════════════════════
        // Nested Try-Catch
        // try-catch inside another try-catch
        // inner catch handles inner exception
        // outer catch handles anything inner missed
        // ══════════════════════════════════════════
        try
        {
            System.out.println("outer try");
            try
            {
                int x = 10 / 0;             // ❌ inner exception
            }
            catch (ArithmeticException e)
            {
                System.out.println("inner catch : " + e.getMessage());  // ✅ runs
            }
            System.out.println("outer try continues");  // ✅ still runs
        }
        catch (Exception e)
        {
            System.out.println("outer catch");   // skipped — inner handled it
        }
        sc.close();
    }
}