// Employee class represents an employee object
class Employee {

    // Instance variables (attributes of an employee)
    int salary;
    String name;

    // Getter method for salary
    public int getSalary() {
        return salary;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String newName) {
        name = newName;
    }
}

public class CustomClass {

    public static void main(String[] args) {

        // Creating an Employee object
        Employee afnan = new Employee();

        // Assigning salary directly
        afnan.salary = 12;

        // Assigning name using setter
        afnan.setName("Afnan");

        // Displaying employee details
        System.out.println("Name   : " + afnan.getName());
        System.out.println("Salary : " + afnan.getSalary());
    }
}