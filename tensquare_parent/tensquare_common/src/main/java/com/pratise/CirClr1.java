package com.pratise;

public class CirClr1 {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) {//行数
            for (int k = 1; k < 7-i; k++) {//列数
                System.out.print(" ");//控制输出的空格数
            }
            for (int j = 0; j <=i; j++) {//控制输出的图案数量
                System.out.print("* ");//输出图形
            }
            System.out.println();//
        }

        for (int i = 1; i <=7; i++) {//行数
            for (int k = 1; k <=i; k++) {//列数
                System.out.print(" ");//控制输出的空格数
            }
            for (int j = 0; j <7-i; j++) {//控制输出的图案数量
                System.out.print("* ");//输出图形
            }
            System.out.println();//
        }
    }
}
