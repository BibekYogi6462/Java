/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;


import java.util.Scanner; 
public class ScannerExample 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.print("Name: "); 
        String name=sc.nextLine(); 
        System.out.print("Gender: "); 
        char gender=sc.next().charAt(0); 
 

        System.out.print("Age: "); 
        int age=sc.nextInt(); 
        System.out.print("Mobile No: "); 
        long mobileno=sc.nextLong(); 
        System.out.print("GPA: "); 
        double gpa=sc.nextDouble(); 
        System.out.println("\nName: "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobileno: "+mobileno); 
        System.out.println("GPA: "+gpa); 
    } 
}
