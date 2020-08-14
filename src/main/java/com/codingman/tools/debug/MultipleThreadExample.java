package com.codingman.tools.debug;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程调试
 *
 * @author ty
 */
public class MultipleThreadExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 2; i++) {
            executorService.execute(new Runnable() {
                public void run() {
                    uuid();
                }
            });
        }
        executorService.shutdown();
    }

    private static void uuid() {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
    }
}
