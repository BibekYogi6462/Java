/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author Bibek Yogi
 */

//Question 2: Creating Threads by Implementing Runnable
//Q2: Write a Java program that creates and starts a new thread by implementing the Runnable interface. The thread should print the names of the first five months of the year with a delay of 300 milliseconds between each name.

class MyRunnable implements Runnable {
    public void run() {
        String[] months = {"January", "February", "March", "April", "May"};
        try {
            for (String month : months) {
                System.out.println(month);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}