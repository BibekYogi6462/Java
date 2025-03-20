package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

class Threads extends Thread {

    String name;

    Threads(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println(name + "   ; " + i);

                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}

public class Threading {

    public static void main(String[] args) {
        Threads t = new Threads("Thread 1");
        Threads t1 = new Threads("Thread 2");
        Threads t2 = new Threads("Thread 3");

        t.start();
        t1.start();
        t2.start();

    }
}