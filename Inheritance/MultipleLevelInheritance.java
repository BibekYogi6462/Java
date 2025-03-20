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
class Dog {
    void eat()
    {
        System.out.println("I am eating");   
    }
}



class Cat extends Dog{
void walk(){
        System.out.println("I am Walking");   

}
}

class Bird extends Cat{
    void fly()
    {
        System.out.println("I am flying");
    }
}




public class MultipleLevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Bird b = new Bird();
        
        d.eat();
        
        c.eat();  //properties extended by cat of dog
        c.walk();
        
        b.walk(); //properties extended by bird of cat
        b.fly();
        b.eat();
        
        
        
        
    }
 
}
