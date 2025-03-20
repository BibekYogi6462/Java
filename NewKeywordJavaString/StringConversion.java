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
public class StringConversion {
    public static void main(String[] args) {
        String s1 = "java"; //creating string by java string literal
        char ch[]={'s','t','r','i','n','g'};
        String s2 = new String(ch); //converting char array to string
        String s3 =  new String("Example"); //creating java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        System.out.println(ch.length);
    }
}
