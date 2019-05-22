package com.pratise;

import java.util.*;

public class FOr {
    public static void main(String[] args) {
//        List<Demo> demosList = new ArrayList<>();
//        while (true){
//            demosList.add(new Demo());
//        }
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            ArrayList alist = new ArrayList();
            LinkedList llist = new LinkedList();
            long starttime = System.currentTimeMillis();

            for (int i = 0; i < num; i++) {
                alist.add(i);
            }
            long endtime = System.currentTimeMillis();

            System.out.println("ArrayList运行时间为："+(endtime-starttime)+"ms");

            long starttime1 = System.currentTimeMillis();

            for (int i = 0; i < num; i++) {
                llist.add(i);
            }
            long endtime1 = System.currentTimeMillis();

            System.out.println("LinkedList运行时间为："+(endtime1-starttime1)+"ms");
        }
        new Hashtable<>();

    }
}
