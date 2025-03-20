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
public class ScannerInput {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    System.out.println("Input your age: ");
    System.out.println("Input your Salary: ");
    System.out.println("Input your Name: ");
    int age=sc.nextInt();
    float salary=sc.nextFloat();
    String name=sc.nextLine();
        System.out.println(age);
        System.out.println(salary);
        System.out.println(name);
    }
    
    
    
}
