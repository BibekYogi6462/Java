/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REECURSION;


import java.util.Scanner;

public class FactorialRecursive {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}

