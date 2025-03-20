/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewKeywordJavaString;

/**
 *
 * @author Bibek Yogi
 */
public class ConversionOfString {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;
        
        //Converting other types to string
        
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        
        //Concatination of two Strings
        String s3 = s1 +s2;
        System.out.println(s3);
    }
}
