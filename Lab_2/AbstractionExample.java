// This program demonstrates abstraction in Java using abstract classes and methods.

// Abstract class representing a generic shape with a draw method.
abstract class Shape {
    abstract void draw();
}

// Concrete class representing a rectangle, extending the Shape class.
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Concrete class representing a triangle, extending the Shape class.
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
}

// Main class demonstrating the use of abstraction with Shape, Rectangle, and Triangle classes.
public class AbstractionExample {
    public static void main(String[] args) {
        // Creating objects of Rectangle and Triangle and invoking their draw methods.
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        rectangle.draw(); // Output: Drawing Rectangle
        triangle.draw();  // Output: Drawing Triangle
    }
}
