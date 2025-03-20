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
public class myRecursion {
    public static int factorial(int n)
    {
        if(n == 0 || n==1)
        {
            return 1;
        }else{
            return n * factorial(n-1);
            
        }
    }
    
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of "+ number + " is " + result);
    }
    
    
}
