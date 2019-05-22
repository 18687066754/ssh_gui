package com.UserDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生序号");
        int id = sc.nextInt();
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();

        ArrayList list = new ArrayList<>();
        list.add(id);
        list.add(name);
        list.add(age);
        for (int i = 0; i < list.size(); i++) {
            User user = new User();
            System.out.println("学生id:"+user.getId()+"学生姓名"+user.getName()+"学生年龄："+user.getAge());
        }
    }
}
