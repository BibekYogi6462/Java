/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorePackages;
import java.util.Vector;


/**
 *
 * @author Bibek Yogi
 */
public class Vector_Exmaple {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        
        //insert
        int i;
        for(i=0;i<=10;i++)
        {
            vec.add(i);
        }
        
        //Display
        System.out.println(vec);
        System.out.println("Item at index 5 = "+vec.get(5));
        
        
    }
}
