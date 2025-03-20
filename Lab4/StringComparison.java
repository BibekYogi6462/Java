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
public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Bibek";
        String str2 = "Yogi";
        
        // Using equals method
        boolean areEqual = str1.equals(str2);
        System.out.println("Using equals method: " + areEqual);
        
        // Using compareTo method
        int comparisonResult = str1.compareTo(str2);
        System.out.println("Using compareTo method: " + comparisonResult);
    }
}
