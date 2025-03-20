/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

import java.util.Scanner;

public class OddIntegerSum {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many odd numbers to sum: ");
        int n = sc.nextInt();
        
        int count = 0;  // to count the number of odd numbers summed
        for(i = 1; count < n; i++) {
            if(i % 2 != 0) { // Check if the number is odd
                sum += i;
                count++;
            }
        }
        
        System.out.println("The sum of the first " + n + " odd numbers is: " + sum);
    }
}
