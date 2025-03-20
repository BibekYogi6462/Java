/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionClasses;


import java.util.*; 
public class HashSetExample  
{ 
public static void main(String args[]) 
{ 
HashSet<String>s=new HashSet<>(); 
s.add("Devendra"); 
s.add("Bindu"); 
s.add("Hari"); 
s.add("Binayak"); 
s.add("Soba Raj"); 
s.add("Binayak");  //adding duplicate elements 
System.out.println(s); 
s.remove("Soba Raj"); 
System.out.println(s); 
System.out.println("\nIterating over list: "); 
Iterator<String> itr=s.iterator(); 
while(itr.hasNext()) 
System.out.println(itr.next()); 
} 
}
