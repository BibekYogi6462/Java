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
public class StringHandling {
    public static void main(String[] args) {
        // Using String concatenation
        String str1 = "Hello, ";
        String str2 = "World!";
        String result = str1.concat(str2);
        System.out.println("Using String concatenation: " + result);
        
        // Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        System.out.println("Using StringBuilder: " + sb.toString());
    }
}