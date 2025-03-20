/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TenMarksSwingQuest;



import java.io.*; 
public class DeserialozeExample  
{ 
    public static void main(String args[]) 
    { 
        Student s=new Student(); 
        s.rollno=5; 
        s.name="Bimala"; 
        try 
        { 
            FileOutputStream fout=new 
FileOutputStream("d:\\Student.ser"); 
 
            ObjectOutputStream out=new 
ObjectOutputStream(fout); 
            out.writeObject(s); 
            out.close(); 
            fout.close(); 
            System.out.println("Serialized data is saved in employee.ser"); 
        } 
        catch(IOException e) 
        { 
            e.printStackTrace(); 
        } 
        try 
        { 
            FileInputStream fin=new 
FileInputStream("D:\\Student.ser"); 
            ObjectInputStream in=new ObjectInputStream(fin); 
            s=(Student)in.readObject(); 
            System.out.println("Rollno = "+s.rollno); 
            System.out.println("Name = "+s.name); 
            in.close(); 
            fin.close(); 
        } 
        catch(IOException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 