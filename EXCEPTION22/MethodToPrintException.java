/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXCEPTION22;

/**
 *
 * @author Bibek Yogi
 */
public class MethodToPrintException {
    public static void main(String[] args) {
        
    
    try{
    int a=100,b=0,c;
    c=a/b;
            System.out.println(c);
}
    catch(ArithmeticException e){
//        e.printStackTrace();
//        System.out.println(e);
        System.out.println(e.getMessage());
    
    
}
}
}