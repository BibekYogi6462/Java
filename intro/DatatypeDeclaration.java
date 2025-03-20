/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 *
 * @author Bibek Yogi
 */
public class DatatypeDeclaration {
    public static void main(String[] args){
       byte myByte=100;
       short myShort=10000;
       int myInt=1000000;
//       long myLong=1000000000L;
       float myFloat=1.25f;
       double myDouble=3.14465465465;
//       char myChar = 'A';
//       boolean myBoolean=true;
//       boolean myBoolean2=false;
//       
//       System.out.println("byte: "+myByte);
//       System.out.println("short: "+myShort);
//       System.out.println("int: "+myInt);
//       System.out.println("long: "+myLong);
//       System.out.println("float: "+myFloat);
//       System.out.println("double: "+myDouble);
//       System.out.println("Char : "+myChar);
//       System.out.println("Boolean: "+myBoolean);
//       System.out.println("Boolean 2: "+myBoolean2);
       
       //Type Conversion
    int sum=myByte+myShort; //implicit typeconversiom
    double product=myFloat*myDouble;
    System.out.println(sum);
    System.out.println(product);
    
    byte a = (byte)sum; //explicit typeconversion
    System.out.println(a);
    
    int b=(int)myFloat;
    System.out.println(b);
    
    
}
}