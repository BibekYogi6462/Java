/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Bibek Yogi
 */
abstract class Animal{
//    int paws;
//    String Size;


abstract void makeNoise();

abstract void eat();

public void sleep(){
    System.out.println("Laying down");
    
}
}

class Horse extends Animal{
    @Override 
    void makeNoise(){
        System.out.println("HIHIHIHIHIHI");
    } 
    @Override
    void eat(){
        System.out.println("Grass");
    }
    
    
//    class Lion extends Animal{
//        @Override
//        void makeNoise(){
//            System.out.println("Roar");
//    }
//        @Override
//        void eat(){
//            System.out.println("Meat");
//}
}


public class Abstraction {
    public static void main(String[] args) {
        Horse Iman = new Horse();
        Iman.makeNoise();
        Iman.eat();
        Iman.sleep();
         
        Horse black = new Horse();
        black.makeNoise();
        
    }
    
}
