



package ScannerTake;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;



public class ScannerUU {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = Input.nextLine();
        System.out.print("Enter your age: ");
        int age =  Input.nextInt();
        System.out.println("Hello, "+name+"! You are "+age+"");
        
    }
}
