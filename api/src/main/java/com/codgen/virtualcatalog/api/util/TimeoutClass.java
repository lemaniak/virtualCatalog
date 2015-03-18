package com.codgen.virtualcatalog.api.util;


/**
 * Created by vicente on 12/03/15.
 */
public class TimeoutClass {

    private static Integer counter=0;
    private static Integer counter2=0;


    public  void increase(){
        System.out.println("Thread 1: Holding lock 1...");
        synchronized (counter){
            try{Thread.sleep(10);}
            catch (InterruptedException iex){}
            System.out.println("Thread 1: Waiting for lock 2...");
            synchronized (counter2){
                System.out.println("Thread 1: Holding lock 1 & 2...");
            }
        }

//        Thread t = Thread.currentThread();
//        String name = t.getName();
//        System.out.println("name=" + name +" inside increase");
    }

    public  void increase2(){
        System.out.println("Thread 2: Holding lock 2...");
        synchronized (counter2){
            try{Thread.sleep(10);}
            catch (InterruptedException iex){}
            System.out.println("Thread 2: Waiting for lock 1...");
            synchronized (counter){
                System.out.println("Thread 2: Holding lock 1 & 2...");
            }
        }

//        Thread t = Thread.currentThread();
//        String name = t.getName();
//        System.out.println("name=" + name +" inside increase");
    }
}
