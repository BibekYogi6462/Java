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
class Cat{
    int age;
    String name;
    
    private static int count =0;
    
    public void sound()
    {
        System.out.println("meow");
    }
    
    Cat()
    {
        count++;
    }
    
    public static int getCount()
    {
       return count;
    }
    
}  

public class StaticExample1 {
    public static void main(String[] args) {
        
    
    Cat c = new Cat();
    c.age=15;
    c.name="Ravi";
    c.sound();    
    
    Cat d = new Cat();
    d.name="Kale";
    d.age=5;
    d.sound();
    
        System.out.println(Cat.getCount());
}
}

