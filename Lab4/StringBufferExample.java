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
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hey, Are you fine?");
        
        // Reversing the string
        sb.reverse();
        System.out.println("Reversed string: " + sb.toString());
        
        // Appending a new string
        sb.append(" Yes Sir.");
        System.out.println("After appending: " + sb.toString());
    }
}
