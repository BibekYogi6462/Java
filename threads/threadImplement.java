package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

class thread implements Runnable {

    String name;

    thread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println(name + "   : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}

public class threadImplement {

    public static void main(String[] args) {
        threading t = new threading("Thread 1");
        threading t1 = new threading("Thread 2");
        threading t2 = new threading("Thread 3");

        Thread thre = new Thread(t);
        Thread thre2 = new Thread(t1);

        thre.start();
        thre2.start();

    }
}