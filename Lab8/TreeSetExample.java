/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author Bibek Yogi
 */
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> set = new TreeSet<>();

        // Add elements to the TreeSet
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(1);
        set.add(15);

        // Print the elements in ascending order
        System.out.println("Elements in the TreeSet in ascending order:");
        for (Integer number : set) {
            System.out.println(number);
        }
    }
}

