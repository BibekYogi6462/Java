/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author Bibek Yogi
 */
public class StringModification {
    public static void main(String[] args) {
        String str = "My name is Bibek Yogi";
        String modifiedStr = str.replace('n', 'g');
        
        System.out.println("Original string: " + str);
        System.out.println("Modified string: " + modifiedStr);
    }
}
