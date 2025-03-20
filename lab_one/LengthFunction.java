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
public class LengthFunction {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {11,12,13,14,15};
        
         
        // Print the length of the array
        System.out.println("Array Length: " + numbers.length);
        
        
        /*Every array has an in-built length property whose value is the size of the array where
        size implies the total number of elements that an array can contain.*/
       

        // Display all elements of the array
        System.out.println("\nArray Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        
    }
}

    

