import java.util.Scanner;

public class AverageOfMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store marks of 6 subjects
        int[] marks = new int[6];

        System.out.println("Enter marks of 6 subjects:");

        // Input marks
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // Variable to store total marks
        double total = 0;

        // Calculate sum of all marks
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        // Average marks (often referred to as percentage in such programs)
        double average = total / marks.length;

        System.out.println("Average Marks = " + average);

        sc.close();
    }
}