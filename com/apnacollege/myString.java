/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege;

/**
 *
 * @author Bibek Yogi
 */
public class myString {
    public static void main(String[] args)
    {
     //Concatenate
        String name1="Bibek";
        String name2="Akku";
        String name3=name1+ " and "+name2;
        System.out.println(name3);
        
      //charAt
      String name="Bibek";
        System.out.println(name.charAt(0));
          System.out.println(name.charAt(1));
       //length function
            System.out.println(name.length());
            
          //replace
          String naam="Bibek";
         String naam1= naam.replace('i','j');
         System.out.println(naam1);
         System.out.println(naam.replace('B', 'J'));
         
         //Substring
         String name4="Bibek and Nabina";
         System.out.println(name4.substring(0,6));
         
         
       
    }
    
}
