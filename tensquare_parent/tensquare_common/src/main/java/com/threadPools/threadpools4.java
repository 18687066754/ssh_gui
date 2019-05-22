package com.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadpools4 {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        System.out.println("===cachedThreadPool===");

        for (int i = 0; i < 4; i++) {

            final  int index=1;
            singleThreadExecutor.execute(new threadForpools(index));
        }
    }
}
