package com.pratise;

public class CirClr2 {
    public static void main(String[] args) {
        for (int i =1; i <=7; i++) {//行数
            for (int k = 1; k <=7-i; k++) {//列数
                System.out.print(" ");//控制输出的空格数
            }
            for (int j = 1; j <=i; j++) {//控制输出的图案数
                System.out.print("* ");//打印图案
            }
            System.out.println( );//执行图案之后的空格
        }

        for (int i =1; i <=7; i++) {//行数
            for (int k = 1; k <=i; k++) {//列数
                System.out.print(" ");//控制输出的空格数
            }
            for (int j = 1; j <=7-i; j++) {//控制输出的图案数
                System.out.print("* ");//打印图案
            }
            System.out.println( );//执行图案之后的空格
        }

    }
}
