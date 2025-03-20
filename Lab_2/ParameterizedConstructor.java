package Lab_2;

/**
 * This program showcases the use of a parameterized constructor in Java.
 * It defines a class named BOY with data members 'name' and 'id'.
 * The main class ParameterizedConstructor creates an object of BOY using the parameterized constructor
 * and prints the values of the attributes.
 */
class Boy {
    // Data members of the class.
    String name;
    int id;

    // Parameterized constructor
    Boy(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

/**
 * Main class demonstrating the use of a parameterized constructor.
 */
public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Creating an object of BOY class using the parameterized constructor.
        Boy boy1 = new Boy("BIBEK", 4);

        // Printing the values of the attributes.
        System.out.println("Name: " + boy1.name + " and Id: " + boy1.id);
    }
}
