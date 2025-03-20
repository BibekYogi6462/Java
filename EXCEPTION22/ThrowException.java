/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXCEPTION22;

/**
 *
 * @author Bibek Yogi
 */
import java.util.Scanner;

public class ThrowException {
    void validate(int age)
    {
        if(age<16)
            throw new ArithmeticException("Error bro");
    
    else
    System.out.println("You are elegible");
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThrowException e = new ThrowException();
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        e.validate(n);
    }
}