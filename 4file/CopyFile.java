/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TenMarksSwingQuest;


import java.io.*; 
public class CopyFile { 
 
   public static void main(String args[]) throws IOException {   
      FileInputStream in = null; 
      FileOutputStream out = null; 
 
      try { 
         in = new FileInputStream("D:\\input.txt"); 
         out = new FileOutputStream("D:\\output.txt"); 
          
         int c; 
         while ((c = in.read()) != -1) { 
            out.write(c); 
         } 
      }finally { 
         if (in != null) { 
            in.close(); 
         } 
         if (out != null) { 
            out.close(); 
         } 
      } 
   } 
}
