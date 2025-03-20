/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HoldingArrayUnit10;

/**
 *
 * @author Bibek Yogi
 */
import java.util.Scanner;
public class Array_Example {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i,max,min;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers");
        for(i=0; i<5; i++)
        {
            a[i] = scan.nextInt();
        }
        max = a[0];
        min = a[0];
        
        for(i=1;i<5;i++){
         if(a[i]>max)
             max = a[i];
        }
        for(i=1;i<5;i++){
         if(a[i]<min)
             min=a[i];
        }
        
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);
        
    }
  
}
