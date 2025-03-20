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
import java.util.HashMap;
public class HashMap_Example {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("vishal",10);
        map.put("sachin",20);
        map.put("vaibhav",30);
        
        System.out.println(map);
        System.out.println("Size of map is:- "+ map.size());
        
        if(map.containsKey("vishal"))
        {
            Integer a = map.get("vishal");
            System.out.println("Value for key \"vishal\" is :- "+a);
        }
    }
}
