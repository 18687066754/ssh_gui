package com.pratise;

public class Circlr3 {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) {//行数
            for (int k = 1; k <=7-i; k++) {//列数
                System.out.print(" ");//每行后的空格数
            }
            for (int j = 1; j <=i; j++) {//控制输出的图案数
                System.out.print("* ");//打印图案
            }
            System.out.println( );//执行完图案的空格数
        }

        for (int i = 1; i <=7; i++) {//行数
            for (int k = 1; k <=i; k++) {//列数
                System.out.print(" ");//每行后的空格数
            }
            for (int j = 1; j <=7-i; j++) {//控制输出的图案数
                System.out.print("* ");//打印图案
            }
            System.out.println( );//执行完图案的空格数
        }
    }
}
