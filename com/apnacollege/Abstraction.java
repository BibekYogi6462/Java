/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apnacollege;

/**
 *
 * @author Bibek Yogi
 */
//Abstraction is hiding internal implemntatiton details and just highlignting the feature

abstract class Vehicle{
   abstract void start();
}
class Car extends Vehicle{
void start()
{
    System.out.println("Starting with key");
}
}

class Scooter extends Vehicle{
    void start()
    {
        System.out.println("starts with key");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car c = new Car();
        Scooter s = new Scooter();
        c.start();
        s.start();
    }
    
}
