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
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int num;
        do{
         System.out.println("Enter the number");
        num = sc.nextInt();
            System.out.println("Here :");
            System.out.println("");
        }while(num>=0);
        System.out.println("The ENd");
        
    }
}
