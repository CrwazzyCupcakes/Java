public class DiagonalStar
{
    // This is a static method called 'print' that takes an integer 'number'
    // 'number' controls the size of the star pattern (acts as the grid size)
    public static void print(int number)
    {
        // Validation check: pattern only makes visual sense if size is 5 or more
        if (number < 5)
        {
            System.out.println("Invalid Value");
            return;  // Exits the method early — nothing below this runs if invalid
        }

        // Outer loop controls the ROWS (top to bottom)
        for (int row = 1; row <= number; row++)
        {
            // Inner loop controls the COLUMNS (left to right) for each row
            for (int column = 1; column <= number; column++)
            {
                // CONDITION 1: Print '*' on the FIRST ROW or FIRST COLUMN
                // This forms the TOP edge and LEFT edge of the border
                if (row == 1 || column == 1)
                {
                    System.out.print("*");
                }

                // CONDITION 2: Print '*' on the LAST ROW or LAST COLUMN
                // This forms the BOTTOM edge and RIGHT edge of the border
                else if (row == number || column == number)
                {
                    System.out.print("*");
                }

                // CONDITION 3: Print '*' where row == column
                // This forms the MAIN DIAGONAL (top-left → bottom-right)
                // Example for size 6: positions (1,1), (2,2), (3,3), (4,4), (5,5), (6,6)
                else if (row == column)
                {
                    System.out.print("*");
                }

                // CONDITION 4: Print '*' where column == number - row + 1
                // This forms the ANTI-DIAGONAL (top-right → bottom-left)
                // Example for size 6: positions (1,6), (2,5), (3,4), (4,3), (5,2), (6,1)
                else if (column == number - row + 1)
                {
                    System.out.print("*");
                }

                // If none of the above conditions match, print a blank space
                // These are the interior empty cells of the pattern
                else
                {
                    System.out.print(" ");
                }
            }

            // After finishing all columns in a row, move to the next line
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        // Calling the print method with size 6
        // You can change this number to get a bigger/smaller pattern (minimum 5)
        print(6);
    }
}