/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 *
 * @author Bibek Yogi
 */
public class myArray {
    public static void main(String[] args)
    {
        int[] myArray={5,6,7,8,9};
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
           
        System.out.println(myArray[0]+myArray[1]);
        
        //Changing the value of index 0;
        myArray[0]=15;
        System.out.println(myArray[0]+myArray[1]);
        
        //length fucntion
        System.out.println(myArray.length);
        
           
    }
    
}
