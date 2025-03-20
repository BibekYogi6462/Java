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
//Question 7: Deadlock
//Q7: Write a Java program to demonstrate deadlock between two threads. Create two objects and two threads where each thread tries to lock both objects but in different order, causing a deadlock.

class Resource1 {}
class Resource2 {}

class DeadlockThread1 extends Thread {
    private Resource1 r1;
    private Resource2 r2;

    public DeadlockThread1(Resource1 r1, Resource2 r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run() {
        synchronized (r1) {
            System.out.println("Thread 1: Locked Resource 1");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (r2) {
                System.out.println("Thread 1: Locked Resource 2");
            }
        }
    }
}

class DeadlockThread2 extends Thread {
    private Resource1 r1;
    private Resource2 r2;

    public DeadlockThread2(Resource1 r1, Resource2 r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run() {
        synchronized (r2) {
            System.out.println("Thread 2: Locked Resource 2");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (r1) {
                System.out.println("Thread 2: Locked Resource 1");
            }
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource1 r1 = new Resource1();
        Resource2 r2 = new Resource2();

        Thread t1 = new DeadlockThread1(r1, r2);
        Thread t2 = new DeadlockThread2(r1, r2);

        t1.start();
        t2.start();
    }
}
