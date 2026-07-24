import java.util.*;

public class Finally {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ══════════════════════════════════════════
        // FINALLY BLOCK
        // runs ALWAYS — whether exception happened or not
        // used for cleanup — closing scanner, files etc
        // ══════════════════════════════════════════
        try
        {
            String s = null;
            System.out.println(s.length());  // ❌ NullPointerException
        }
        catch (NullPointerException e)
        {
            System.out.println("null error : " + e.getMessage());   // runs
        }
        return 5; // return executes only after finally
        finally
        {
            // this ALWAYS runs no matter what
            // even if no exception
            // even if exception is NOT caught
            System.out.println("finally block ran!");
            sc.close();// always runs
        }
    }
}