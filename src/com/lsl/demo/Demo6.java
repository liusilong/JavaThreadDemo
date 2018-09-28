package com.lsl.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo6 {
    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();
        SynchronizedExample example2 = new SynchronizedExample();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> example.func1());
        service.execute(() -> example2.func1());
    }
}

class SynchronizedExample {
    public void func1() {
        synchronized (SynchronizedExample.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println();
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}