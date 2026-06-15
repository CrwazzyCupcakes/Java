import java.util.*;  // Imports utility package which includes the Scanner class

public class Loops
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // Scanner to read user input

        System.out.println("Enter length and breadth");  // Fixed typo: 'breath' → 'breadth'
        int l = sc.nextInt();  // 'l' = length  → controls the number of ROWS
        int b = sc.nextInt();  // 'b' = breadth → controls the number of COLUMNS

        // ══════════════════════════════════════════
        // METHOD 1: FOR LOOP (your original code)
        // Best used when: you know exactly how many times to loop
        // ══════════════════════════════════════════
        System.out.println("\n--- For Loop ---");
        for (int i = 0; i < l; i++)          // Outer loop: runs l times for rows
        {
            for (int j = 0; j < b; j++)      // Inner loop: runs b times for columns
            {
                System.out.print("*");        // Print star without moving to next line
            }
            System.out.println();             // Move to next line after each row
        }

        // ══════════════════════════════════════════
        // METHOD 2: WHILE LOOP
        // Best used when: you don't know how many times to loop in advance
        //                 loop continues as long as a condition is true
        // ══════════════════════════════════════════
        System.out.println("\n--- While Loop ---");
        int i = 0;                            // Initialize row counter OUTSIDE the loop
        while (i < l)                         // Keep looping as long as i is less than l
        {
            int j = 0;                        // Initialize column counter — must reset to 0 each row!
            while (j < b)                     // Keep looping as long as j is less than b
            {
                System.out.print("*");        // Print star
                j++;                          // ⭐ IMPORTANT: increment j manually or infinite loop!
            }
            System.out.println();             // Move to next line after each row
            i++;                              // ⭐ IMPORTANT: increment i manually or infinite loop!
        }

        // ══════════════════════════════════════════
        // METHOD 3: DO-WHILE LOOP
        // Best used when: you want the loop body to execute AT LEAST ONCE
        //                 condition is checked AFTER the loop body runs
        // NOTE: For l=0 or b=0, do-while still prints once — be careful!
        // ══════════════════════════════════════════
        System.out.println("\n--- Do-While Loop ---");
        int row = 0;                          // Initialize row counter
        do
        {
            int col = 0;                      // Initialize column counter — reset each row
            do
            {
                System.out.print("*");        // Print star — runs at least once!
                col++;                        // Increment column counter
            }
            while (col < b);                  // Check condition AFTER printing

            System.out.println();             // Move to next line after each row
            row++;                            // Increment row counter
        }
        while (row < l);                      // Check condition AFTER printing each row

        // ══════════════════════════════════════════
        // METHOD 4: FOR-EACH LOOP
        // Best used when: iterating over arrays or collections
        // NOTE: For-each can't directly replicate the grid pattern since
        //       we need index control for rows and columns
        //       So we use a char array to demonstrate it meaningfully
        // ══════════════════════════════════════════
        System.out.println("\n--- For-Each Loop ---");
        // Create a char array representing one row of stars
        char[] starRow = new char[b];         // Array of size b (breadth)
        Arrays.fill(starRow, '*');            // Fill every element with '*'

        // Use a regular for loop for rows (for-each can't count rows easily)
        for (int r = 0; r < l; r++)
        {
            // For-each loop iterates over every star in the starRow array
            for (char star : starRow)         // 'star' takes value of each element one by one
            {
                System.out.print(star);       // Print each star character
            }
            System.out.println();             // Move to next line after each row
        }

        sc.close();  // ✅ Closes the Scanner to free up resources
    }
}