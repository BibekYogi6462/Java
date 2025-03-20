/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TenMarksSwingQuest;


import java.io.*; 
public class WritingtoFile  
{ 
   public static void main(String args[]) throws IOException  
   {   
      FileOutputStream out = null; 
      try { 
         out = new FileOutputStream("D:\\output.txt"); 
         int a=65; 
         out.write(a); 
      } 
      finally  
      {  
         if (out != null) { 
            out.close(); 
         } 
      } 
   } 
} 
