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
public class StringSearch {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String substr = "fox";
        
        int index = str.indexOf(substr);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }
    }
}