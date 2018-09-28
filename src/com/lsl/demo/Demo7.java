package com.lsl.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo7 {
    public static void main(String[] args) {
        LockExample example = new LockExample();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> example.func());
        service.execute(() -> example.func());
    }
}

class LockExample {
    private Lock lock = new ReentrantLock();
    public void func (){
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " ");
            }
        } catch (Exception e) {

        } finally {
            // 确保释放锁，从而避免发生死锁
            lock.unlock();
        }
    }
}