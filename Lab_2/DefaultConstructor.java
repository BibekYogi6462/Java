package Lab_2;

/**
 * This program showcases the use of a default constructor in Java.
 * It defines a class named Test with instance variables 'i' (integer) and 's' (String).
 * The main class DefaultConstructor creates an object of Test and prints the default values of its attributes.
 */
class Test {
    int integer;      // Default initialized to 0
    String name;   // Default initialized to null
}

/**
 * Main class demonstrating the use of a default constructor.
 */
public class DefaultConstructor {
    public static void main(String[] args) {
        // Creating an object of Test class using the default constructor.
        Test t = new Test();

        // Printing the default values of the attributes.
        System.out.println("Integer: " + t.integer);     // Output: i: 0
        System.out.println("Name: " + t.name);     // Output: s: null
    }
}
