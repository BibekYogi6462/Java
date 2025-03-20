
package LabThreeExceptionHandling;
/*rite a Java program to simulate a banking system where a user can withdraw money from an account. Implement exception handling to deal with scenarios like insufficient balance (using a custom exception) and invalid withdrawal amounts.

*/
/**
 *
 * @author user
 */
// Custom exception class for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank account class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws InsufficientBalanceException {
        // Check if the withdrawal amount is negative or zero
    if (amount <= 0) {
    throw new IllegalArgumentException("Invalid withdrawal amount: " + amount);
        }

        // Check if there is enough balance to withdraw
    if (amount > balance) {
   throw new InsufficientBalanceException("Insufficient balance. "
           + "Available balance: " + balance);
        }

        // Perform the withdrawal
        balance -= amount;
    System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount account = new BankAccount(1000);

        try {
            // Try to withdraw money
            account.withdraw(500); // Change the withdrawal amount to test different scenarios
        } catch (InsufficientBalanceException e) {
            // Handle insufficient balance exception
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle invalid withdrawal amount exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}