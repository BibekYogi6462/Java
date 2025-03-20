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
 //create a class
   class Student{
             int  rollno ;
            String name;
            float marks ;
            
           //We need a way to add the values of the above propeties object by object
            
           //
            
            
//            void greeting()
//            {
//                System.out.println("Hello "+ name);
//            }
            
            
//            void changeName(String newName{
//                name = newName;
//            }
            
//            Student()
//            {
//                this.rollno=13;
//                this.name="Biebk"; 
//                this.marks=45.6f;
//            }
            
            
            Student(int rollno, String name, float marks){
                this.rollno=rollno;
                this.name=name; 
                this.marks=marks;
            }  
            
//            Student (Student other){
//                this.name = other.name;
//                this.rollno = other.rollno;
//                this.marks= other.marks;
//            }
        }
public class Main {
        public static void main(String[] args) {
//        
//            int [] numbers = new int[5];
//            String[] name = new String[5];
//            
            
            //Data of 5 students
//            int [] rollno = new int[5];
//            String[] name = new String[5];
//            float[] marks = new float[50];
            
////            Student[] students = new Student[5];


           Student kunal = new Student(13,"Bibek",85.6f);
           
////           kunal.rollno=56;
////           kunal.name="Bibek";


           System.out.println(kunal.rollno);
           System.out.println(kunal.name);
           System.out.println(kunal.marks);
//           kunal.greeting();

//Student random = new Student(Kunal);


 
           
           
            
            
           
           
            //new - dynamically allocates memory and returns referenc eto it.
            
            
    }
        
       
     
    
}
