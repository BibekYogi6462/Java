/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;

/**
 *
 * @author Bibek Yogi
 */
public class Human {
   int age;
   String name;
   int salary;
   boolean married;
   static long population;
   public Human(int age, String name, int salary, boolean married)
   {
       this.age = age;
       this.name = name;
       this.salary = salary;
       this.married = married;
       Human.population += 1;
   }
    
}
