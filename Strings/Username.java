import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your email address: ");
        String email = sc.next();
        
        // Initialize index pointer for the '@' symbol
        int atIndex = 0;
        
        // Loop through the string to locate the '@' symbol position
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atIndex = i; // Store the index where '@' is found
                break;       // OPTIMIZATION: Stop looping immediately since emails only have one '@'
            }
        }
        
        // email.substring(start, end) extracts characters from 'start' (inclusive) up to 'end' (exclusive)
        String username = email.substring(0, atIndex);
        
        System.out.println("Extracted Username: " + username);
        
        sc.close();
    }    
}