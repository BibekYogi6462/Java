/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bibek Yogi
 */
    import java.util.Arrays;

public class Lab8 {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] array = {5, 3, 8, 4, 2, 7, 1, 10, 6, 9};

        // Sort the array in ascending order
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

}
