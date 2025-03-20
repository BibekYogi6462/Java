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
public class StringtoanyType {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 = "11.5";
        
        //Converting String to Integer
        int a = Integer.parseInt(s1);
        
        //Converting String to Double
        
       double b = Double.parseDouble(s2);
       double res = (double)a+b;
       System.out.println("Result = "+res);
       
    }
}
