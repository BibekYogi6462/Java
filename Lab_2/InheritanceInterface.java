/*
 * This program illustrates the use of interfaces in Java.
 * It defines an interface Drawable with a draw method.
 * Two classes, Square and Circle, implement the Drawable interface by providing their own draw implementations.
 * The main class InheritanceInterface showcases the usage of the interface by creating objects of Square and Circle
 * and calling their draw methods through the Drawable interface reference.
 */

package Lab_2;

/**
 * Interface representing a drawable object with a draw method.
 */
interface Drawable {
    void draw();
}

/**
 * Class representing a Square, implementing the Drawable interface.
 */
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}



/**
 * Main class demonstrating the use of the Drawable interface.
 */
public class InheritanceInterface {
    public static void main(String[] args) {
        // Creating objects of Square and Circle and referencing them through the Drawable interface.
        Drawable square = new Square();
     

        // Calling the draw method through the Drawable interface reference.
        square.draw(); // Output: Drawing square
  
    }
}
