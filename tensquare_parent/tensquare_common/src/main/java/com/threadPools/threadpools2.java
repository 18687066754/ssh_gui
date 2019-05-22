package com.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadpools2 {
    public static void main(String[] args) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        System.out.println("===cachedThreadPool===");

        for (int i = 0; i < 4; i++) {

            final  int index=1;
            newFixedThreadPool.execute(new threadForpools(index));
        }
    }
}
