/*
 * Interface Inheritance Example
 *
 * Question:
 * Create a TVremote interface.
 * Create a SmartTVremote interface that extends TVremote.
 * Create a TV class that implements SmartTVremote.
 */

// Parent Interface
interface TVremote {

    // Turn the TV ON
    void ON();

    // Turn the TV OFF
    void OFF();
}

// Child Interface
// SmartTVremote inherits all methods of TVremote
interface SmartTVremote extends TVremote {

    // Increase volume
    void Volume_up();

    // Decrease volume
    void Volume_down();
}

// TV class implements SmartTVremote
class TV implements SmartTVremote {

    // Implementing ON()
    public void ON() {
        System.out.println("TV turned ON");
    }

    // Implementing OFF()
    public void OFF() {
        System.out.println("TV turned OFF");
    }

    // Implementing Volume_up()
    public void Volume_up() {
        System.out.println("TV volume increased");
    }

    // Implementing Volume_down()
    public void Volume_down() {
        System.out.println("TV volume decreased");
    }
}

/*
 * Main class
 */
public class interface_problem1 {

    public static void main(String[] args) {

        // Interface reference pointing to TV object
        SmartTVremote samsung = new TV();

        // Calling methods through interface reference
        samsung.ON();
        samsung.OFF();
        samsung.Volume_up();
        samsung.Volume_down();
    }
}