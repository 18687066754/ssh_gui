package com.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadpools1 {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        System.out.println("===cachedThreadPool===");

        for (int i = 0; i < 4; i++) {

            final  int index=1;
           cachedThreadPool.execute(new threadForpools(index));
        }
    }
}
