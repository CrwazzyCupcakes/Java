/*
 * Multiple Interface Implementation Example
 *
 * A Smartphone can:
 * 1. Take Photos (Camera)
 * 2. Provide Location (GPS)
 * 3. Play Music (MusicPlayer)
 */

// Camera interface
interface Camera {

    // Abstract method
    void Photo();
}

// GPS interface
interface GPS {

    // Abstract method
    void location();

    /*
     * Default Method
     * Provides a default implementation.
     * Implementing classes may override it if needed.
     */
    default void country() {
        System.out.println("India");
    }

    /*
     * Static Method
     * Belongs to the interface itself.
     * Called using InterfaceName.methodName()
     */
    static void planet() {
        System.out.println("Earth-13B");
    }
}

// Music Player interface
interface Musicplayer {

    // Abstract method
    void Music();
}

// Smartphone implements multiple interfaces
class Smartphone implements Camera, GPS, Musicplayer {

    // Camera implementation
    public void Photo() {
        System.out.println("Click Click!");
    }

    // GPS implementation
    public void location() {
        System.out.println("HYD");
    }

    // MusicPlayer implementation
    public void Music() {
        System.out.println("Raindance");
    }
}

public class poly_interface {

    public static void main(String args[]) {

        // Smartphone reference
        Smartphone s = new Smartphone();

        // GPS reference pointing to Smartphone object
        GPS g = new Smartphone();

        // Accessing all methods through Smartphone reference
        s.Photo();
        s.location();
        s.Music();

        // Accessing only GPS methods through GPS reference
        g.location();

        // Default method
        g.country();

        // Static interface method
        GPS.planet();

        // g.Music(); ❌ Error
        // GPS reference can access only GPS methods
    }
}