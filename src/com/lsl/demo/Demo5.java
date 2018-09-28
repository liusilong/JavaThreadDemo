package com.lsl.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ExecutorService 中断
 * shutdown() : 等待线程都执行完毕后在关闭
 * shutdownNow() : 立即关闭
 */
public class Demo5 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        // 立即关闭
        // service.shutdownNow();
        // 等待线程执行完成之后再关闭
        service.shutdown();
        System.out.println("Main run");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        System.out.println("Main run 2");
    }
}