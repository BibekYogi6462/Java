/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFunctions;


public class GetChars {
    public static void main(String[] args) {
        String s = "Hello My name is ABBgi.";
        int start = 16;
        int end = 22;
        char buf[] = new char[90];
//        char buf[] = new char[end-start];
        s.getChars(start,end,buf,5);
        System.out.println(buf);
    }
    
}
