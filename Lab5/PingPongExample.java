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
//Question 3: Understanding Thread Execution
//Q3: Write a Java program that creates two threads by extending Thread. One thread should print "Ping" and the other should print "Pong", each with a delay of 200 milliseconds. Observe the interleaving of "Ping" and "Pong" in the output.

class PingThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Ping");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Ping thread interrupted.");
        }
    }
}

class PongThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Pong");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Pong thread interrupted.");
        }
    }
}

public class PingPongExample {
    public static void main(String[] args) {
        PingThread ping = new PingThread();
        PongThread pong = new PongThread();
        
        ping.start();
        pong.start();
    }
}
