/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HoldingArrayUnit10;

/**
 *
 * @author Bibek Yogi
 */
import java.util.ArrayList;
public class ArrayList_Example {
    public static void main(String[] args) {
        
        //Creating an array list
        ArrayList<String> a1 = new ArrayList<String>();
        System.out.println("Initial size of a1: "+a1.size());
        
        //add elements to the array list
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1,"A2");
        System.out.println("Size of al after additions: "+a1.size());
        
        //Displaying the array
        System.out.println("Contents of a1: "+a1);
        
        //Remove elements from the array list
        a1.remove("F");
        a1.remove(2);
        System.out.println("Size of al after deletions: "+a1.size());
        System.out.println("Contents of List: "+a1);
        
    }
}
