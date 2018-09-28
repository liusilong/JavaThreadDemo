package com.lsl.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * CachedThreadPool: 一个任务创建一个线程
 * FixedThreadPool: 所有任务只能使用固定大小的线程
 * SingleThreadExecutor： 相当于大小为 1 的 FixedThreadPool
 */
public class Demo3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());
        }   
        executorService.shutdown();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread-name: " + Thread.currentThread().getName());
    }
}