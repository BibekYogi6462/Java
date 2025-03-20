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
public class MySwitch {
    public static void main(String[] args)
    {
        int day=7;
        
        String dayofWeek;
        switch(day){
            case 1:
                dayofWeek="Sunday";
                    System.out.println(dayofWeek);
                
                break;
            case 2:
                dayofWeek="Monday";
                    System.out.println(dayofWeek);
                break;
            case 3:
                dayofWeek="Tuesday";
                    System.out.println(dayofWeek);
                break;
            case 4:
                dayofWeek="Wednesday";
                    System.out.println(dayofWeek);
                break;
            case 5:
                dayofWeek="Thursday";
                    System.out.println(dayofWeek);
                break;
            case 6:
                dayofWeek="Friday";
                    System.out.println(dayofWeek);
                break;
            case 7:
                dayofWeek="Saturday";
                System.out.println(dayofWeek);
                break;
    }
        
    }
       
}
