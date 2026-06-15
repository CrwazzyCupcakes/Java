import java.util.Scanner;

// Represents phone call related actions
class Call {

    // Simulates calling a person
    public static void call(String contactName) {
        System.out.println("Calling " + contactName + "...");
    }

    // Simulates ringing
    public static void ring() {
        System.out.println("Ringing...");
    }

    // Simulates rejecting the call
    public static void deny() {
        System.out.println("Call Denied!");
    }
}

public class CellPhoneCall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter whom to call: ");
        String name = sc.nextLine();

        // Since all methods are static,
        // object creation is actually unnecessary.
        Call.call(name);
        Call.ring();

        // Uncomment to simulate rejection
        // Call.deny();

        sc.close();
    }
}