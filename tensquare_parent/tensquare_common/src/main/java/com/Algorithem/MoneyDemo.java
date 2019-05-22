package com.Algorithem;

import java.util.Scanner;

public class MoneyDemo {
    public static void main(String[] args) {
        int blance=1000;
        String pwd="123456";
        int fetchMoney=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码");
        String newpwd = sc.next();
        if(pwd.equals(newpwd)){
            System.out.println("请输入你的取款金额");
            fetchMoney = sc.nextInt();
            if (fetchMoney>blance){
                System.out.println("余额不足");
            }else {
                blance-=fetchMoney;
                System.out.println("是否查询余额:(0:否  1：是)");
                int num = sc.nextInt();
                if (num==0){
                    System.out.println("谢谢光临！欢迎下次");
                }else if(num==1){
                    System.out.println("余额为："+blance);
                }else {
                    System.out.println("输入有误");
                }
            }
        }else {
            System.out.println("密码输入错误，请从新输入");
        }
    }
}
