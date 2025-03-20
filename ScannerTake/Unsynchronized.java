/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScannerTake;


class Counter{
    int count = 0;
    
    public synchronized void increment(){
        count++;
}
}
public class Unsynchronized {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=1; i<=100000;i++){
                    c.increment();
                }
        } 
    
});
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i=1;i<=100000;i++){
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count = "+c.count);
    }
}
        
   
    
