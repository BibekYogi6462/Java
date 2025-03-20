
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege;
import java.util.Arrays;

/**
 *
 * @author Bibek Yogi
 */
public class MyArray {
    public static void main(String[] args)
    
    {    
        
        int age=30;
        int physics=30;
        int chemistry=60;
        int  English=76;
        
        int[] marks = new int[3];
        marks[0]=97;
        marks[1]=87;
        marks[2]=95;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        
        //length
        System.out.println(marks.length);
        
        //sort function
        
        Arrays.sort(marks);
          System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        
        
        //if we know aleeady element
        int[] maarks={97,65,96,56};
        
    }
}
