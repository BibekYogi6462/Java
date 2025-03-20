/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TenMarksSwingQuest;


public class ThreadDeadlock { 
  
    String str1 = "Java"; 
    String str2 = "Python"; 
      
    Thread t1 = new Thread("My Thread 1"){ 
        public void run(){ 
            while(true){ 
                synchronized(str1){ 
                    try{ 
                        Thread.sleep(100); 
                    } 
                    catch(InterruptedException e){ 
                        e.printStackTrace(); 
                    } 
                    synchronized(str2){ 
                        System.out.println(str1 + str2); 
                    } 
                } 
            } 
        } 
    }; 
      
    Thread t2 = new Thread("My Thread 2"){ 
        public void run(){ 
            while(true){ 
                synchronized(str2){ 
                    synchronized(str1){ 
                        System.out.println(str2 + str1); 
                    } 
                } 
            } 
        } 
    }; 
      
    public static void main(String a[]){ 
        ThreadDeadlock obj = new ThreadDeadlock(); 
        obj.t1.start(); 
        obj.t2.start(); 
    } 
} 
