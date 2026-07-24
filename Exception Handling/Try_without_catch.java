import java.util.*;

public class Try_without_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ══════════════════════════════════════════
        // TRY WITHOUT CATCH — only finally
        // valid syntax — useful when you always want
        // cleanup to run but don't need to handle error
        // ══════════════════════════════════════════
        try
        {
            System.out.println("try ran");
        }
        finally
        {
            System.out.println("finally ran");  // always runs
            sc.close();
        }
    }
}