/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

/**
 *
 * @author Bibek Yogi
 */
// Base class Fruit
class Fruit {
    // Attributes
    String name;
    String taste;
    String size;

    // Constructor
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to describe eating the fruit
    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

// Apple class inheriting from Fruit
class Apple extends Fruit {
    // Constructor calling superclass constructor
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    // Overriding eat method to represent apple's taste
    @Override
    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

// Orange class inheriting from Fruit
class Orange extends Fruit {
    // Constructor calling superclass constructor
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    // Overriding eat method to represent orange's taste
    @Override
    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

// Main class to test Fruit, Apple, and Orange
public class FruitDemo {
    public static void main(String[] args) {
        // Create instances of Apple and Orange
        Apple apple = new Apple("Apple", "sweet", "medium");
        Orange orange = new Orange("Orange", "sour", "large");

        // Call eat method for Apple and Orange
        apple.eat();   // Outputs: Apple tastes sweet
        orange.eat();  // Outputs: Orange tastes sour
    }
}

