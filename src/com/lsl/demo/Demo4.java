package com.lsl.demo;

/**
 * 线程中断
 */
public class Demo4 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        t.interrupt();
        System.out.println("main run");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread run");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}