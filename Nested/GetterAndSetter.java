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
class Ani{
    private String name;
    private int roll;


 public void setName(String name)
{
this.name=name;

}
 public void setRoll(int roll)
{
this.roll=roll;

}
 
 public String getName()
 {
     return name;
     
 }
 public int getRoll()
 {
     return roll;
 }
}
public class GetterAndSetter {
    public static void main(String[] args) {
        Ani a = new Ani();
        a.setName("Bibek");
        a.setRoll(15555);
        System.out.println(a.getName());
        System.out.println(a.getRoll());
        
    }
    
}

