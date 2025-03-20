/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nested;

/**
 *
 * @author Bibek Yogi
 */
class Animal
{
    
    void eat()
    {
        System.out.println("Eating");
    }
    
    class Monkey{
     void climb()
     {
         System.out.println("I am Climbing");
    }
}
}
public class Example2 {
    public static void main(String[] args) {
      Animal l = new Animal();
      l.eat();
      Animal.Monkey m = l.new Monkey();
      m.climb();
      
    }
}
    

