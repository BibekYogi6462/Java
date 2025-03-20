/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_one;

/**
 *
 * @author Bibek Yogi
 */

public class BreakAndContinue {
    public static void main(String[] args) {
        // Example of Break Statement: Jumping out of a loop when a specific condition is met.
        System.out.println("Example of Break Statement:");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; // The loop will run up to 3, and then break out.
            }
            System.out.println(i);
        }

        // Example of Continue Statement: Skipping an iteration based on a specified condition.
        System.out.println("\nExample of Continue Statement:");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; // Skip iteration when i is 4.
            }
            System.out.println(i);
        }
        
        
        
    }
}
