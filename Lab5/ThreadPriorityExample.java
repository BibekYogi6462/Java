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
//Q4: Write a Java program that creates three threads with different priorities. Each thread should print its name and priority five times. Use the Thread.currentThread().getPriority() method to print the priority.
//

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread1");
        PriorityThread t2 = new PriorityThread("Thread2");
        PriorityThread t3 = new PriorityThread("Thread3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
