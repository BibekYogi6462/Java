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
class Student1
{
String name;
int age;
String stream;
char section;

Student1()
{
    name ="Bibek";
    age = 19;
    stream = "BCA";
    section ='A';
            
}
Student1( String name,int age,String stream, char section){
    this.name=name;
    this.age=age;
    this.stream=stream;
    this.section=section;

}
//String Student1getdetails(){
// return "Name: "+ name +" Age: " + age + " Stream: "+ stream +"Section: "+section;    
//}
}
public class Constructor {
    public static void main(String[] args) {
        Student1 x = new Student1("Abhi",23,"BIM",'A');
        Student1 y = new Student1("Bibek",04,"BCA",'A');
        
    }
    
}
