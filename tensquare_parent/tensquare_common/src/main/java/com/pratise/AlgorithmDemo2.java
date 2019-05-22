package com.pratise;

import com.UserDemo.User;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmDemo2 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入学生的编号");
            int id = sc.nextInt();
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();

            list.add(new User(id,name,age));
        }
        long end = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {

            System.out.println("编号："+list.get(i).getId()+"姓名："+list.get(i).getName()+"年龄"+list.get(i).getAge());
        }
        System.out.println("一共消耗了"+(end-start)+"时长");
    }
}
