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
public class MySwitch {
    public static void main(String[] args) {
        int day=8;
        switch(day)
                {
            case 1:
                System.out.println("Sunday");
                break;
             
            case 2:
                System.out.println("Monday");
                break;
                
            case 3:
                System.out.println("Tuesday");
                break;
                
            case 4:
                System.out.println("Wednesday");
                break;
            
            default:
                System.out.println("Thursday - Saturday");
                break;
                

    }
    
}
}
