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
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Remove an element from the ArrayList
        list.remove("Cherry");

        // Iterate through the ArrayList and print all elements
        System.out.println("Elements in the ArrayList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
