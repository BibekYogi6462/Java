/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author Bibek Yogi
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define the Person class
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method to print Person objects
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class PersonListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Person objects
        ArrayList<Person> people = new ArrayList<>();

        // Add Person objects to the ArrayList
        people.add(new Person("Bibek", 20));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("David", 21));
        people.add(new Person("Eve", 28));

        // Sort the list by age using a Comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });

        // Print the sorted list
        System.out.println("Sorted list by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

