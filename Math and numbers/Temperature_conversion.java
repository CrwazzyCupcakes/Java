import java.util.Scanner;

public class Temperature_conversion {

    // --- Celsius Conversions ---
    public static double convertCelsiusToFahrenheit(double c) {
        // Formula: (C * 9/5) + 32
        return (c * 9.0 / 5.0) + 32;
    }

    public static double convertCelsiusToKelvin(double c) {
        // Formula: C + 273.15 (Using precise scientific value 273.15)
        return c + 273.15;
    }

    // --- Fahrenheit Conversions ---
    public static double convertFahrenheitToCelsius(double f) {
        // Formula: (F - 32) * 5/9
        return (5.0 / 9.0) * (f - 32);
    }

    public static double convertFahrenheitToKelvin(double f) {
        // Formula: ((F - 32) * 5/9) + 273.15
        return ((f - 32) * 5.0 / 9.0) + 273.15;
    }

    // --- Kelvin Conversions ---
    public static double convertKelvinToCelsius(double k) {
        // Formula: K - 273.15
        return k - 273.15;
    }

    public static double convertKelvinToFahrenheit(double k) {
        // Formula: ((K - 273.15) * 9/5) + 32
        return (k - 273.15) * (9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Presenting a structured user menu
        System.out.println("--- Temperature Converter Menu ---");
        System.out.println("1: Celsius to Fahrenheit   2: Fahrenheit to Celsius");
        System.out.println("3: Celsius to Kelvin       4: Kelvin to Celsius");
        System.out.println("5: Fahrenheit to Kelvin    6: Kelvin to Fahrenheit");
        System.out.print("Select conversion option (1-6): ");
        int choice = sc.nextInt();
        
        System.out.print("Enter the temperature value: ");
        double inputTemp = sc.nextDouble();
        
        System.out.print("Converted Temperature: ");
        // Switch control structure routes execution to matching case based on 'choice'
        switch (choice) {
            case 1:
                System.out.println(convertCelsiusToFahrenheit(inputTemp) + " °F");
                break;
            case 2:
                System.out.println(convertFahrenheitToCelsius(inputTemp) + " °C");
                break;
            case 3:
                System.out.println(convertCelsiusToKelvin(inputTemp) + " K");
                break;
            case 4:
                System.out.println(convertKelvinToCelsius(inputTemp) + " °C");
                break;
            case 5:
                System.out.println(convertFahrenheitToKelvin(inputTemp) + " K");
                break;
            case 6:
                System.out.println(convertKelvinToFahrenheit(inputTemp) + " °F");
                break;
            default:
                System.out.println("Error: Invalid option selected.");
                break;
        }
        
        sc.close();
    }    
}