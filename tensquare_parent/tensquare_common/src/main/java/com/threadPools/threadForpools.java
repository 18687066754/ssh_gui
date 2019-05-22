package com.threadPools;

import org.springframework.aop.framework.adapter.AdvisorAdapter;

public class threadForpools  implements Runnable {
    private  Integer index;

    public threadForpools(Integer index) {
        this.index = index;
    }

    @Override
    public void run() {
        try {

            System.out.println("开始处理线程");
            Thread.sleep(1000*index);
            System.out.println("我的线程标识是："+this.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
