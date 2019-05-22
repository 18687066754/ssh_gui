package com.pratise;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmDemo{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc= new Scanner(System.in);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+i+"个同学的姓名");
            String name = sc.next();
            System.out.println("请输入第"+i+"个同学的年龄");
            int age = sc.nextInt();
            list.add(new Student(name,age));
        }
        long end = System.currentTimeMillis();

        System.out.println("==========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名："+list.get(i).getName()+",年龄："+list.get(i).getAge());
        }
        System.out.println("总共耗时："+(end-start)+"ms");

    }
}
