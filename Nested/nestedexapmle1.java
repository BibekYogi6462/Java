/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nested;

/**
 *
 * @author Bibek Yogi
 */

class abc{
    public void idk()
    {
        System.out.println("I dont know");
    }
    
    
    class def extends abc{
        public void istg()
        {
            System.out.println("I sear to God.");
        }
    }
}

public class nestedexapmle1 {
    public static void main(String[] args) {
        
    
    abc a = new abc();
    abc.def d = a.new def();
//    abc.def d = new abc.def();
    a.idk();
    d.istg();
    d.idk();
   }
}
