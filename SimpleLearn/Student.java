/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleLearn;


public class Student {
    String name;
    int age;
    String address;
    

public Student(String name, int age, String address){
this.name=name;
this.age=age;
this.address=address;
}

public void setName(String name){
this.name=name;

}

public void setAge(int age)
{
this.age=age;
}

public void setAddress(String address){
this.address=address;
}

public String getName(){
return name;
}
public int getAge(){
    return age;
}
public String getAddress(){
    return address;
}
    public static void main(String[] args) {
        Student RAM = new Student("RAM",19,"Dhumbarahi");
        System.out.println(RAM.getName());
        System.out.println(RAM.getAge());
        System.out.println(RAM.getAddress());
        
    }
        
}
