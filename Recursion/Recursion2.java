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
public class Recursion2 {
    public static int fibonacci(int n)
    {
        if (n<=1)
        {
            return n;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("Fibonacci sequence up to "+n+" terms");
        for(int i = 0 ; i<n; i++)
        {
            System.out.println(fibonacci(i) + " ");
        }
    }
    
}
