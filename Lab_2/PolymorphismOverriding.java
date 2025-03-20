/*
 * This program demonstrates polymorphism in Java through method overriding.
 * It defines a base class Animal with a method sound.
 * Two subclasses, Cat and Dog, extend the Animal class and override the sound method with their own implementations.
 * The main class PolymorphismOverriding showcases polymorphism by creating instances of Cat and Dog
 * as objects of the base class Animal and calling their overridden sound methods.
 */

package Lab_2;

/**
 * Base class representing an Animal with a sound method.
 */
class Animal {
    public void sound() {
        System.out.println("Animal is making a sound");
    }
}

/**
 * Subclass representing a Cat, extending the Animal class and overriding the sound method.
 */
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat is meowing");
    }
}

/**
 * Subclass representing a Dog, extending the Animal class and overriding the sound method.
 */
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }
}

/**
 * Main class demonstrating polymorphism through method overriding.
 */
public class PolymorphismOverriding {

    public static void main(String[] args) {
        // Creating instances of Cat and Dog as objects of the base class Animal.
        Animal myCat = new Cat(); // Cat is meowing
        Animal myDog = new Dog(); // Dog is barking

        // Calling the overridden sound methods to demonstrate polymorphism.
        myCat.sound(); // Output: Cat is meowing
        myDog.sound(); // Output: Dog is barking
    }
}
