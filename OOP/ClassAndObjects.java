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
 class Student{
//     private String name;
//     private int age;
//     private String section;
//     private String stream;
     
 public String name;
 public int age;
 public String section;
 public String stream;
//     
     
     
//     
//     public String getDetails(){
//         return "Name: "+ name +", Age: "+ age+", Section: "+section +", Stream: "+ stream;
//     }
     
     //Method to set the name of the student
     public void setName(String name){
         this.name = name;
         
     }
     
     //Method to set the age of the student
   public void setAge (int age){
         this.age = age;
        
    }
   
   //Method to set the section of the student
   public void setSection(String section){
       this.section=section;
   }
   
   //Method to set the stream of the student
   public void setStream(String stream)
   {
       this.stream=stream;
   }
 
    
     public String getDetails(){
         return "Name: "+ name +", Age: "+ age+", Section: "+section +", Stream: "+ stream;
     }
 }

public class ClassAndObjects {
    public static void main(String[] args)
    {
//        Student Bibek=new Student();
//        Student Gyan=new Student();
//        Bibek.name="Bibek";
//        Gyan.name="Gyan";
//        Bibek.age=15;
//        Gyan.age=13;
//        Bibek.section="A";
//        Gyan.section="B";
//        Bibek.stream="BCA";
//        Gyan.stream="BCA";
//        System.out.println(Bibek.getDetails());
//        System.out.println(Gyan.getDetails()); 
        
        
        Student Bibek=new Student();
        Student Gyan=new Student();
        Bibek.setName("Bibek");
        Gyan.setName("Gyan");
        Bibek.setAge(15);
        Gyan.setAge(13);
        Bibek.setSection("A");
        Gyan.setSection("B");
        Bibek.setStream("BCA");
        Gyan.setStream("BCA");
        System.out.println("Student 1: "+Bibek.getDetails());
        System.out.println("Student 2: "+Gyan.getDetails());  
        
   
    }
}
