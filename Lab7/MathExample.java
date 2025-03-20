/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author Bibek Yogi
 */
public class MathExample {
    public static void main(String[] args) {
        double number = -22.5;

        double squareRoot = Math.sqrt(Math.abs(number));
        double power = Math.pow(number, 2);
        double absoluteValue = Math.abs(number);

        System.out.println("Square root of " + Math.abs(number) + " is: " + squareRoot);
        System.out.println(number + " to the power of 2 is: " + power);
        System.out.println("Absolute value of " + number + " is: " + absoluteValue);
    }
}