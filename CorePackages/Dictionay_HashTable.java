/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorePackages;
import java.util.*;
/**
 *
 * @author Bibek Yogi
 */
public class Dictionay_HashTable {
    public static void main(String[] args) {
        Hashtable hash = new Hashtable();
        
        //put some elements
        hash.put(1, "beer");
        hash.put(2, "tea");
        hash.put(5, "Coffee");
        System.out.println(hash);
        System.out.println("Getting value of key 5:"+ hash.get(5));
        
        //remove
        hash.remove(2);
        System.out.println(hash);
    }
}
