/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TenMarksSwingQuest;


import java.io.*; 
public class ReadingFromFile  
{ 
public static void main(String args[]) throws IOException  
 
   {   
      FileInputStream out = null; 
      try { 
         out = new FileInputStream("D:\\output.txt"); 
         System.out.println(out.read()); 
      } 
      finally  
      {  
         if (out != null) { 
            out.close(); 
         } 
      } 
   } 
}   
