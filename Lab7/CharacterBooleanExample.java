/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author Bibek Yogi
 */
public class CharacterBooleanExample {
    public static void main(String[] args) {
        char ch = 'a';
        String boolStr = "true";

        // Checking character properties
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        char upperCaseChar = Character.toUpperCase(ch);

        // Parsing string to boolean
        boolean boolValue = Boolean.parseBoolean(boolStr);

        System.out.println("Character: " + ch);
        System.out.println("Is digit: " + isDigit);
        System.out.println("Is letter: " + isLetter);
        System.out.println("Uppercase version: " + upperCaseChar);
        System.out.println("Boolean value: " + boolValue);
    }
}


