/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TenMarksSwingQuest;


import java.io.*; 
class Studentinfo implements Serializable 
{ 
    String name; 
    int rid; 
    static String contact; 
    Studentinfo(String n, int r, String c) 
    { 
    this.name = n; 
    this.rid = r; 
    this.contact = c; 
    } 
} 
 
public class Serialiazation { 
    public static void main(String[] args) { 
     try 
        { 
            Studentinfo si = new Studentinfo("Abhi", 104, "110044"); 
            FileOutputStream fos = new FileOutputStream("student.ser"); 
            ObjectOutputStream oos = new ObjectOutputStream(fos); 
            oos.writeObject(si); 
            oos.close(); 
            fos.close(); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
    } 
} 
