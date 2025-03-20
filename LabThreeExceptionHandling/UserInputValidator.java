package LabThreeExceptionHandling;
/*Explain the concept of user-defined exceptions in Java.
Develop a custom exception class named "InvalidInputException" and demonstrate its usage in a program where user input is validated.


*/
/**
 *
 * @author user
 */
// Custom exception class
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
// Example program demonstrating the usage of custom exception
public class UserInputValidator {
    public static void main(String[] args) {
        try {
            validateInput("someInput"); // Change this to test different inputs
        } catch (InvalidInputException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    // Method to validate user input
    public static void validateInput(String input) throws InvalidInputException {
        // Check if input is null or empty
        if (input == null || input.isEmpty()) {
            throw new InvalidInputException("Input cannot be null or empty.");
        }

        // Check if input length is less than 3 characters
        if (input.length() < 3) {
            throw new InvalidInputException("Input length must be at least 3 characters.");
        }

        // Other validation rules can be added as needed
        // For example, checking for specific patterns, ranges, etc.
        
        // If input passes all validations, perform further processing
        System.out.println("Input is valid: " + input);
    }
}