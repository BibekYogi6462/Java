/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iNTERFACEW;


import java.util.*; 
public class SetExample  
{ 
    public static void main(String args[]) 
    { 
Set<String> s = new HashSet<String>(); 
// Adding elements to the Set 
// using add() method 
s.add("Gita"); 
s.add("Sheela"); 
s.add("Nabina"); 
s.add("Shailu"); 
s.add("Sheela"); 
System.out.println(s); 
} 
} 
