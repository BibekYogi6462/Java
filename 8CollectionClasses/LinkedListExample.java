/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionClasses;



import java.util.*; 
public class LinkedListExample  
{ 
public static void main(String args[]) 
{ 
LinkedList<String>s=new LinkedList<>(); 
s.add("D"); 
s.add("C"); 
s.addLast("G"); 
s.addFirst("A"); 
s.add("E"); 
s.add(1, "B"); 
System.out.println(s); 
boolean status=s.contains("G"); 
if(status) 
System.out.println("List Contains Element 'E' "); 
else 
System.out.println("List Doesnot contains Element 'E' "); 
s.remove(1); 
System.out.println(s); 
s.remove("D"); 
System.out.println(s); 
s.removeLast(); 
System.out.println(s); 
s.removeFirst(); 
System.out.println(s);
}
}
