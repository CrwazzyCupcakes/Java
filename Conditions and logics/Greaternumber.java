import java.util.*;  // Imports utility package which includes the Scanner class

public class Greaternumber
{
    // Static method that compares two numbers and prints the greater one
    // Takes two integers 'a' and 'b' as parameters (passed in from main)
    // NOTE: Method name 'Greater' starts with uppercase — Java convention says
    //       method names should start with lowercase (e.g. 'findGreater')
    //       This may cause a yellow warning in your IDE!
    public static void findGreater(int a, int b)
    {
        // Compare a and b
        // If a is strictly greater than b → print a
        if (a > b)
        {
            System.out.println("The greater number is: " + a);
        }
        // If b is greater than OR equal to a → print b
        // NOTE: This else block also handles the case where a == b
        //       In that case both numbers are equal, but b gets printed
        //       Consider adding an else if (a == b) block to handle this case!
        else
        {
            System.out.println("The greater number is: " + b);
        }

        // 'return' is optional in void methods — method exits automatically
        // Kept here just as an explicit end marker
        return;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter two numbers:");  // Prompt so user knows what to enter
        int a = sc.nextInt();  // First number
        int b = sc.nextInt();  // Second number

        findGreater(a, b);  // Pass both numbers to findGreater method to compare

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}