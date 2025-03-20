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
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");

        // Check if a specific element is in the set
        String elementToCheck = "Cherry";
        if (set.contains(elementToCheck)) {
            System.out.println(elementToCheck + " is in the set.");
        } else {
            System.out.println(elementToCheck + " is not in the set.");
        }

        // Print all elements in the HashSet using an enhanced for loop
        System.out.println("Elements in the HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}

