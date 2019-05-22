package com.pratise;

import com.UserDemo.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo412 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        System.out.println("===================");

        for (int i = 1; i <= 7; i++) {
            for (int k = 1; k <=7 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 7; i++) {
            for (int k = 1; k <=i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print("* ");
            }

            System.out.println( );
        }

//        System.out.println("===========");
//        ArrayList<User> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            System.out.println("请输入你的id");
//            int id = sc.nextInt();
//            System.out.println("请输入你的name");
//            String name = sc.next();
//            System.out.println("请输入你的age");
//            int age = sc.nextInt();
//
//            list.add(new User(id,name,age));
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("id:"+list.get(i).getId()+" "+"姓名："+list.get(i).getName()+"年龄："+list.get(i).getAge());
//        }

        System.out.println("================");
        int[] arr={43,34,23,12,54,43};
        System.out.println("排序前：");
        for (int num : arr) {
            System.out.print(num+" ");
        }
        for (int i = 0; i <arr.length-1; i++) {
            for (int i1 = 0; i1<arr.length-1-i; i1++) {
                if (arr[i1]>arr[i1+1]){
                    int temp=arr[i1];
                    arr[i1]=arr[i1+1];
                    arr[i1+1]=temp;
                }
            }
        }
        System.out.println("排序后：");
        for (int num : arr) {
            System.out.print(num+" ");
        }

    }
}
