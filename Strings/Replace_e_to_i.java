import java.util.Scanner;

public class Replace_e_to_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the word: ");
        String original = sc.next();
        
        // Initialize an empty string to accumulate our modified characters
        String result = "";
        
        // Loop through each character of the original string, one by one
        for (int i = 0; i < original.length(); i++) {
            
            // If the current character is 'e', append 'i' to our result string instead
            if (original.charAt(i) == 'e') {
                result += 'i'; 
            }
            // Otherwise, append the original character as it is
            else {
                result += original.charAt(i);
            }
        }
        
        // Output the newly constructed string
        System.out.println("Modified word: " + result);
        
        sc.close();
    }
}