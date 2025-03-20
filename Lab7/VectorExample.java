/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author Bibek Yogi
 */
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Adding elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        // Removing an element
        vector.remove(2);

        // Iterating through elements
        System.out.println("Vector elements:");
        for (Integer num : vector) {
            System.out.println(num);
        }
    }
}

