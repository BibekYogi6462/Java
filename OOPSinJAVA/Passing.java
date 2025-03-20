/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPSinJAVA;

/**
 *
 * @author Bibek Yogi
 */
public class Passing {
   public static class Studentt{
       String name;
       int rollno;
       double percent;
       
   }
   public static void change(Studentt x){
       x.name="Rohan";
   }
    
    public static void main(String[] args) {
      Studentt s1 = new Studentt();
      s1.name= "bibek";
      s1.rollno = 76;
      s1.percent = 92.5;
       System.out.println(s1.name);
       change(s1);
        System.out.println(s1.name);
    }
    
}

