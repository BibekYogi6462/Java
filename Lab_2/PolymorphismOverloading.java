/*
 * This program demonstrates method overloading in Java.
 * Method overloading allows the same method name with different parameters.
 * In this example, there are two methods with the name 'figure' in the Method_Overloading class,
 * each taking a different number of parameters.
 * The main class PolymorphismOverloading creates an object of Method_Overloading and calls both methods
 * to calculate the area of a rectangle and a square, showcasing method overloading.
 */

package Lab_2;

/**
 * Class demonstrating method overloading in Java.
 */
class Method_Overloading {

    // Method Overloading by changing the number of arguments (or parameters).

    // Method 1: Calculate the area of a rectangle with two parameters (length and breadth).
    double figure(double length, double breadth) {
        return (length * breadth);
    }

    // Method 2: Calculate the area of a square with one parameter (side length).
    double figure(double side) {
        return (side * side);
    }
}

/**
 * Main class demonstrating the use of method overloading with the Method_Overloading class.
 */
public class PolymorphismOverloading {
    public static void main(String[] args) {
        // Creating an object of Method_Overloading.
        Method_Overloading obj = new Method_Overloading();

        // Calling the overloaded methods to calculate areas and displaying the results.
        System.out.println("Area of Rectangle: " + obj.figure(5.55, 6.78));
        System.out.println("Area of Square: " + obj.figure(3.45));
    }
}
