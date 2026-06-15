import java.util.*;  // Imports utility package which includes the Scanner class

public class Eligiblevote
{
    // Static method that checks if a person is eligible to vote
    // Takes 'age' as a parameter (passed in from main)
    public static void Eligiblevote(int age)
    {
        // Check if age is greater than 18
        // NOTE: In real life, the voting age is 18 AND above (>=18)
        //       Your current code uses >18 which means exactly 18 would show "Not Eligible"
        //       Consider changing to age >= 18 to be accurate
        if (age > 18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not Eligible to vote");
        }

        // 'return' here is optional since this is a void method
        // A void method automatically ends after the last line
        // But it's not wrong to have it — it just explicitly marks the end
        return;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input from keyboard

        // Read the age entered by the user
        int age = sc.nextInt();

        // Pass the age to the Eligiblevote method to check and print the result
        Eligiblevote(age);

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}