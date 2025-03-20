/*
 * This program demonstrates inheritance in Java.
 * It defines a base class Bird with an eat method.
 * A subclass Parrot extends the Bird class and adds a fly method.
 * The main class InheritanceClass creates instances of Bird and Parrot
 * and calls their methods to showcase inheritance.
 */

package Lab_2;

/**
 * Base class representing a Bird with an eat method.
 */
class Bird {
    public void eat() {
        System.out.println("I am eating");
    }
}

/**
 * Subclass representing a Parrot, extending the Bird class and adding a fly method.
 */
class Parrot extends Bird {
    public void fly() {
        System.out.println("I am flying");
    }
}

/**
 * Main class demonstrating inheritance.
 */
public class InheritanceClass {
    public static void main(String[] args) {
        // Creating instances of Bird and Parrot.
        Bird bird = new Bird();
        Parrot parrot = new Parrot();

        // Calling the eat method from both Bird and Parrot.
        bird.eat();   // Output: I am eating
        parrot.eat();  // Output: I am eating

        // Calling the fly method from Parrot.
        parrot.fly();  // Output: I am flying
    }
}
