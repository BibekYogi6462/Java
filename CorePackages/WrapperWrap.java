package CorePackages;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bibek Yogi
 */
public class WrapperWrap {
    public static void main(String[] args) {
        //wrapping int to integer
        int a = 10;
        Integer obji = new Integer(a);
        
        //Wrapping double to double
        double d = 10.5;
        Double objd = new Double(d);
        
        //Wrapping char to character
        char c = 'x';
        Character objc =  new Character(c);
        
        System.out.println("After Wrapping...");
        System.out.println("Integer = "+obji);
        System.out.println("Double = "+objd);
        System.out.println("Character= "+objc);
        
        //unwrapping Integer to int
        int a1 = obji;
        
        //unwrapping Double to double
        double d1 = objd;
        
        //Unwrapping Character to char
        char c1 = objc;
        
        System.out.println("After Unwrapping...");
        System.out.println("Integer = "+a1);
        System.out.println("Double = "+d1);
        System.out.println("Character= "+c1);
    }
}
