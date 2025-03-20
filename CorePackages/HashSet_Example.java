/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorePackages;

/**
 *
 * @author Bibek Yogi
 */
import java.util.HashSet;
public class HashSet_Example {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        
        //Adding elements into HashSet
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India"); //Adding duplicate elements
        
        System.out.println("h");
        System.out.println("List contains India or not:"+ h.contains("India"));
        
        h.remove("Australia");
        System.out.println("List after removing Australia: \n"+h);
        
        
    }
}
