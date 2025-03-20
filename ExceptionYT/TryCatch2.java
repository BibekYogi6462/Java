/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionYT;
import java.io.FileInputStream;


/**
 *
 * @author Bibek Yogi
 */
public class TryCatch2 {
    public static void main(String[] args) {
        
    
    try{
    
    FileInputStream fis = new FileInputStream("d:/abc.txt");
}
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
