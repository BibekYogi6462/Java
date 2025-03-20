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
public class ExceptionHandling {
    public static void main(String[] args) {
        int[] marks ={97,98,95};
        try{
            System.out.println(marks[5]);
        } catch(Exception exception){
            // do things atfer cathing
        }
       
        System.out.println("The name is Bibek");
        
        
        
    }
    
}
