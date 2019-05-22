package com.pratise;

import com.UserDemo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ListDemo {
    public static void main(String[] args) {


        final ArrayList<Object> list1 = new ArrayList<>();
        list1.add(1);

        final HashSet<String> map = new HashSet<>();
        map.add("张三");

        final HashMap<String, String> hashMap = new HashMap<>();


        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入你的编号：");
            int id = sc.nextInt();
            System.out.println("请输入你的姓名：");
            String name = sc.next();
            System.out.println("请输入你的年龄：");
            int age = sc.nextInt();

            list.add(new User(id, name, age));

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("编号："+list.get(i).getId()+" "+"姓名"+list.get(i).getName()+"年龄："+" "+list.get(i).getAge());
        }
    }
}
