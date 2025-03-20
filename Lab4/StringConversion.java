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
public class StringConversion {
    public static void main(String[] args) {
        // Convert integer to string
        int number = 999;
        String str = Integer.toString(number);
        System.out.println("Converted integer to string: " + str);
        
        // Convert string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("String in uppercase: " + upperStr);
        
        // Convert string to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerStr);
    }
}
