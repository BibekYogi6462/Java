/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iNTERFACEW;


import java.util.*; 
public class ListInterfaceExample  
{ 
    public static void main(String args[]) 
    { 
List<Integer>l1=new ArrayList<Integer>(); 
l1.add(0,5); 
l1.add(1,7); 
System.out.println(l1); 
List<Integer>l2=new ArrayList<Integer>(); 
l2.add(6); 
l2.add(9); 
l2.add(12); 
l1.addAll(1,l2); 
System.out.println(l1); 
l1.remove(1); 
System.out.println(l1); 
l1.set(0, 11); 
System.out.println(l1); 
} 
}
