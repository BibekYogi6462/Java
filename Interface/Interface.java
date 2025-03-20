/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Bibek Yogi
 */
  
      
 interface a{
          
        public void display();
          public void print();
  }
      
class b implements a {
 @Override
 public void display()
 {
     System.out.println("Displaying");
 }
 
 @Override
 public void print()
 {
     System.out.println("Printing");
 }
}
      
  
public class Interface {
    public static void main(String[] args) {
        b bag = new b();
        bag.display();
        bag.print();
    }
    
}
