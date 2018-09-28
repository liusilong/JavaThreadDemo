package com.lsl.demo;

public class Demo1 {
    static int data = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(data);
            }
        });

        data = 1;

        thread.start();

        Thread.sleep(1000);

        data = 2;

    }
}
