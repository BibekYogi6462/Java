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
class Student{
 String name;
 int roll;
 float marks;


//Student()
//{
//this.name = "Bibek";
//this.roll = 5;
//this.marks = 45.6f;
//}
 
 Student(String name, int roll , float marks)
 {
     this.name = name;
     this.roll=roll;
     this.marks=marks;
 }
}
public class yesterday {
    public static void main(String[] args) {
        Student Bibek = new Student("Bibek",16,45.6f);
        System.out.println(Bibek.name);
        System.out.println(Bibek.roll);
        System.out.println(Bibek.marks);
        System.out.println("The name of Bibek is "+Bibek.name+" Roll is "+Bibek.roll+" and marks is "+Bibek.marks);
        
        Student Darpan = new Student("Darpan",5,45.6f);
         System.out.println(Darpan.name);
        System.out.println(Darpan.roll);
        System.out.println(Darpan.marks);
    }
    
}
