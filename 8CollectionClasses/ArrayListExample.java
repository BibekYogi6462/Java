/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionClasses;

import java.util.*;


public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> s = new ArrayList<>();

        // Add elements to the ArrayList
        s.add("Devendra");
        s.add("Bindu");
        s.add("Hari");
        s.add("Binayak");
        s.add("Soba Raj");

        // Get a ListIterator to iterate through the elements
        ListIterator<String> litr = s.listIterator();

        // Use the iterator to print all elements in the ArrayList
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
    }
}
