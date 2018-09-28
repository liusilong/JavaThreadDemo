package com.lsl.demo;

public class Demo2 {
    static int data = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> data = 1);

        thread.start();

        Thread.sleep(1000);
        System.out.println(data);

    }
}
