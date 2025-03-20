/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionYT;

/**
 *
 * @author Bibek Yogi
 */
public class Trycatch {
    public static void main(String[] args) {
        try{
            int a =100,b=0,c;
            c=a/b;
            System.out.println(c);    
        }
        catch(Exception e) //Write only Exception if you dont know exceptionclassname
        {
            System.out.println(e);
        }
        
    }
}
