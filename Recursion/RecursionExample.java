/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Bibek Yogi
 */
public class RecursionExample {
    public static void sayHi(int count)
    {
        System.out.println("hi");
        count--;
        if(count>=1)
        {
                sayHi(count); 
        }
     
    }
    public static void main(String[] args) {
        sayHi(3);
    }
    
}
