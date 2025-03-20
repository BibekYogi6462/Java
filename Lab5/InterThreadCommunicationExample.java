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
//Question 6: Inter-Thread Communication
//Q6: Write a Java program that demonstrates inter-thread communication using wait() and notify(). Create a SharedResource class with a method that waits for a condition to be met before continuing execution.
//



class SharedResource {
    private boolean flag = false;

    public synchronized void waitForCondition() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Waiting thread interrupted.");
            }
        }
        System.out.println("Condition met, resuming execution.");
    }

    public synchronized void meetCondition() {
        flag = true;
        notify();
    }
}

class WaitingThread extends Thread {
    private SharedResource resource;

    public WaitingThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.waitForCondition();
    }
}

class NotifyingThread extends Thread {
    private SharedResource resource;

    public NotifyingThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Notifying thread interrupted.");
        }
        resource.meetCondition();
        System.out.println("Condition met and notified.");
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        WaitingThread t1 = new WaitingThread(resource);
        NotifyingThread t2 = new NotifyingThread(resource);

        t1.start();
        t2.start();
    }
}