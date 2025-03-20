/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_one;

/**
 *
 * @author Bibek Yogi
 */
public class SwitchCase {
    
    public static void main(String[] args) {
       int day = 3; // Assuming 1 represents Monday, 2 represents Tuesday, and so on

        String days;
        

        switch (day) {
            
            case 1:
                days = "Sunday";
                break;
            case 2:
                days = "Monday";
                break;
            case 3:
                days = "Tuesday";
                break;
            case 4:
                days = "Wednesday";
                break;
            case 5:
                days = "Thursday";
                break;
            case 6:
                days = "Friday";
                break;
            case 7:
                days = "Saturday";
                break;
            
            default:
                days = "Invalid day";
                break;
        }

        System.out.println("The day of the week is: " + days);
    }
}
 
//       //using switch with an array  
//        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//       
//        
//        int dayIndex = 6; // Assuming 0 represents Monday, 1 represents Tuesday, and so on
//
//        String dayOfWeek;
//
//        switch (daysOfWeek[dayIndex]) {
//            case "Monday":
//                dayOfWeek = "Monday";
//                break;
//            case "Tuesday":
//                dayOfWeek = "Tuesday";
//                break;
//            case "Wednesday":
//                dayOfWeek = "Wednesday";
//                break;
//            case "Thursday":
//                dayOfWeek = "Thursday";
//                break;
//            case "Friday":
//                dayOfWeek = "Friday";
//                break;
//            case "Saturday":
//                dayOfWeek = "Saturday";
//                break;
//            case "Sunday":
//                dayOfWeek = "Sunday";
//                break;
//            default:
//                dayOfWeek = "Invalid day";
//                break;
//        }
//
//        System.out.println("The day of the week is: " + dayOfWeek);
//   
//        }
//}
//    
//}
