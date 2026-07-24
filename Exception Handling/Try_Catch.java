import java.util.*;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ══════════════════════════════════════════
        // BASIC TRY-CATCH
        // ══════════════════════════════════════════

        // try  → put risky code here
        // catch → what to do IF exception occurs
        // if NO exception → catch block is SKIPPED
        // if exception → jumps to catch IMMEDIATELY
        //                remaining try code is SKIPPED
        try {
            int a = 10;
            int b = 0;
            int c = a / b;              // ❌ ArithmeticException — divide by zero
            System.out.println(c);      // skipped if exception occurs above
        } catch (ArithmeticException e) {
            // e.getMessage() → returns the error message as a String
            // e.printStackTrace() → prints full error details (useful for debugging)
            System.out.println("caught : " + e.getMessage());  // / by zero
        }
        sc.close();
    }
}