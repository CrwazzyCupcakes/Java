import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the word or sentence: ");
        // Using nextLine() allows the program to read spaces between words correctly
        String original = sc.nextLine();
        
        // Convert the original String into a mutable StringBuilder object
        StringBuilder word = new StringBuilder(original);
        
        // Initialize an empty StringBuilder to store our reversed text
        StringBuilder result = new StringBuilder("");
        
        // Loop backwards starting from the last index down to 0
        // e.g., if length is 5, indices are 4, 3, 2, 1, 0
        for (int i = word.length() - 1; i >= 0; i--) {
            // Append the character at index 'i' to the end of our result
            result.append(word.charAt(i));
        }
        
        // Print out the final reversed string
        System.out.println("Reversed: " + result);
        
        sc.close();
    }    
}