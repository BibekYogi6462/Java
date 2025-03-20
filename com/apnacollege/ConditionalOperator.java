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
public class ConditionalOperator {
            public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     int cash = sc.nextInt();
     if(cash<10){
            System.out.println("cANNOT BUY ANYTHING");
            System.out.println("can buy");
    }
     else if(cash>10 && cash<40)
     {
         System.out.println("Can buy one thing");
     }
     else{
         System.out.println("Can buy all thing");
     }
   
}
     
    
}

