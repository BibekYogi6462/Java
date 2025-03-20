/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScannerTake;

/**
 *
 * 
 */
class Data{
    private int number;
    private boolean isValueSet = false;
    
    //Method to produce data
    public synchronized void produce(int num)
    {
        while(isValueSet)
        {
         try{
             wait(); //wait until consumer consumes the value
         } 
         catch(InterruptedException e){
             e.printStackTrace();
         }
        }
        number = num;
        System.out.println("Produced: " + num);
        isValueSet = true;
        notify(); 
    }
    
    
    //Method to consume data
    public synchronized void consume()
    {
        while(!isValueSet)
        {
         try{
             wait();
         }   
         catch(InterruptedException e)
         {
             e.printStackTrace();
         }
        }
        System.out.println("Consumed: "+number);
        isValueSet = false;
        notify();
    }
}

class Consumer implements Runnable{
    private Data data;
    public Consumer (Data data)
    {
        this.data = data;
    }
    
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            data.consume();
            try{
                Thread.sleep(1000); //Simulate some processing time
            }
            catch(InterruptedException e){ 
                e.printStackTrace();
            }
        }
    }
    
}

class Producer implements Runnable{
    private Data data;
    public Producer(Data data)
    {
        this.data = data;
    }
    
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            data.produce(i);
            try{
                Thread.sleep(1000); //Simulate some processing time
            }
            catch(InterruptedException e){ 
                e.printStackTrace();
            }
        }
    }
    
}

public class ThreadCommunication {
    public static void main(String[] args) {
        Data data = new Data();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
        
        
    }
    
}
