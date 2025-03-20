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

public class ImplicitAndExplicitConversion {
    public static void main(String[] args) {
        // Define int variable
        int num = 5004;

        // Implicit Conversion (Widening): Automatic conversion from smaller to larger data type.
        double doubleNum = num; // Implicit conversion from int to double
        float floatNum = num;   // Implicit conversion from int to float

        System.out.println("Value after implicit conversion to double: " + doubleNum);
        System.out.println("Value after implicit conversion to float: " + floatNum);

        // Explicit Conversion (Narrowing): Manual conversion from larger to smaller data type.
        int convertedInt = (int) doubleNum; /* Explicit conversion from double to int*/
        short convertedShort = (short) floatNum; // Explicit conversion from float to short

        System.out.println("\nValue after explicit conversion from double to int: " + convertedInt);
        System.out.println("Value after explicit conversion from float to short: " + convertedShort);
    }
}

