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
public class ConditionalStatements {
    public static void main(String[] args){
//        int num=10;
//        if(num%2==0){
//            System.out.println("Even Number");
//        }
//        else if(num%2!=0){
//            System.out.println("Odd Number");
//        }
//        else{
//            System.out.println("Zero");
//            
//            
//        }
//    }
int a=5,b=6,c=9;
if(a>b && a>c)
{
    System.out.println("a is greatest");
}
else if(b>a && b>c){
    System.out.println("b is greatest");
}
else{
    System.out.println("c is greatest");
}
    
    }
}
