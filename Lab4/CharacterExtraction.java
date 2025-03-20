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
public class CharacterExtraction {
    public static void main(String[] args) {
        String str = "Bibek Yogi";
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
    }
}