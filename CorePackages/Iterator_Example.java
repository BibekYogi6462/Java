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
import java.util.Iterator;

public class Iterator_Example {
    public static void main(String[] args) {
          HashSet<String> h = new HashSet<String>();

          // Adding elements into HashSet using add()
          h.add("India");
          h.add("Australia");
          h.add("South Africa");
          h.add("India");  //adding duplicate elements
          
          //Iterating over hash set items
          System.out.println("Interating over list: ");
          Iterator<String> i = h.iterator();
          while(i.hasNext())
              System.out.println(i.next());
          
    }
    
}
