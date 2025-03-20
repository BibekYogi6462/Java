/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Bibek Yogi
 */
class Human{
    String name;
    int age;
}

class Employee extends Human{
    
   int salary;
}


public class Singleinheritance {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "Bibek";
        h1.age = 19;
        
        Employee e1 = new Employee();
        e1.name = "Abhi";
        e1.age= 48;
        e1.salary = 450000;
        System.out.println(h1.name + " " + h1.age);
        System.out.println(e1.name + " " + e1.age+" "+e1.salary);
    }
}
