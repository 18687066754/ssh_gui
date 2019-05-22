package com.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class threadpools3 {
    public static void main(String[] args) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
        System.out.println("===cachedThreadPool===");

        for (int i = 0; i < 4; i++) {

            final  int index=1;
            //延迟3秒
            newScheduledThreadPool.schedule(new threadForpools(index),3, TimeUnit.SECONDS);
        }
    }
}
