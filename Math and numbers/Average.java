public class Average {

    // VarArgs method
    // Allows any number of integer arguments to be passed
    public static int avg(int... numbers) {

        int sum = 0;

        // Enhanced For Loop
        // Iterates through every element in numbers
        for (int num : numbers) {
            sum += num;
        }

        // Average Formula:
        // Average = Sum / Number of Elements
        return sum / numbers.length;
    }

    public static void main(String[] args) {

        // Array containing values whose average is to be found
        int[] values = {1, 2, 3, 6, 8};

        System.out.println("Average = " + avg(values));
    }
}