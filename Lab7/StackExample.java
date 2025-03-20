/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author Bibek Yogi
 */
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Popping an element
        String poppedElement = stack.pop();

        // Printing the top element
        String topElement = stack.peek();

        System.out.println("Popped element: " + poppedElement);
        System.out.println("Top element: " + topElement);
    }
}
