 
package Lab3;
/*Design a Java program that involves a recursive function. 
Implement exception handling to catch potential StackOverflowError, and demonstrate how to handle it gracefully to prevent program termination.
*/

/**
 *
 * @author user
 */ 
public class RecursiveExample {
    public static void main(String[] args) {
        try {
            // Start the recursive function
            recursiveFunction(0);
        } catch (StackOverflowError e) {
            // Handle StackOverflowError gracefully
            System.out.println("StackOverflowError occurred: " + e.getMessage());
            System.out.println("Program terminated gracefully.");
        }
    }

    public static void recursiveFunction(int count) {
        // Base case: Stop recursion when count exceeds a certain limit
        if (count > 1000) {
            System.out.println("Recursion limit reached. Stopping.");
            return;
        }

        // Recursive call
        recursiveFunction(count + 1);
    }
}