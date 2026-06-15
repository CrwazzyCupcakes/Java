import java.util.*;  // Imports the utility package which includes the Scanner class

public class CombinedString
{
    public static void main(String args[])
    {
        // Scanner is used to take input from the user via the keyboard
        Scanner sc = new Scanner(System.in);

        // Ask the user how many words they want to enter
        System.out.println("Enter the size");
        int size = sc.nextInt();  // Stores the number of words the user wants to input

        // Ask the user to enter the words
        System.out.println("Enter the words");

        // Create a String array to hold all the words entered by the user
        // Array size is whatever the user entered above
        String words[] = new String[size];

        // Loop to read each word one by one and store it in the array
        for (int i = 0; i < size; i++)
        {
            words[i] = sc.next();  // sc.next() reads one word at a time (stops at space/enter)
        }

        // Start combining words — begin with the first word as the base
        String combined = words[0];

        // Loop starts from index 1 (since index 0 is already in 'combined')
        // Each iteration appends the next word directly to the combined string
        for (int i = 1; i < size; i++)
        {
            combined = combined + words[i];  // Concatenation: joins words together without spaces
        }

        // Print the total length (number of characters) of the combined string
        // NOTE: Since no spaces are added between words, the length is the sum
        //       of all individual word lengths
        System.out.println(combined.length());
        sc.close();
    }
}