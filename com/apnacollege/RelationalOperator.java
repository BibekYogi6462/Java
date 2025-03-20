/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege;
import java.util.Scanner;

/**
 *
 * @author Bibek Yogi
 */
public class RelationalOperator {
    public static void main(String[] args)
    {
//        Operators
//        a==b
//        a != b
//        a<b
//        a>b
//        a<=b
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the age: ");
//        int age = sc.nextInt();
//        if(age == 19){
//            System.out.println("It is true");
//        }
//        else{
//            System.out.println("It is false");
//        }
              

//     boolean isSunup = true;
//     if(isSunup==true)
//            System.out.println("Day");
//     else
//            System.out.println("Night");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("You can vote bro");
        }
        else{
            System.out.println("You cannot vote");
        }
    }
    
}
