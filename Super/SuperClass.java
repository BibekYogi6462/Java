/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super;


class Person{
    void message()
    {
        System.out.println("This is person class");
    }
}

class Student extends Person{
    void message()
    {
        System.out.println("This is student class");
    }
    
    void display()
    {
        message();
         super.message();
}
}
public class SuperClass {
    public static void main(String[] args) {
        
    }
}
