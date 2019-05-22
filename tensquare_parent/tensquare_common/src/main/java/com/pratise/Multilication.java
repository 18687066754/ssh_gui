package com.pratise;

public class Multilication {
    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(i+"*"+j+"="+(i*j)+"\t");
//            }
//            System.out.println( );
//        }

        for (int i = 1; i <=7; i++) {
            for (int k = 1; k <=7-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println( );
            }

        for (int i = 1; i <=7; i++) {
            for (int k = 1; k <=i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=7-i; j++) {
                System.out.print("* ");
            }
            System.out.println( );






//        for (int i = 1; i <=7; i++) {//行数
//            for (int k = 1; k <=7-i; k++) {//列数
//                System.out.print(" ");//每行执行的空格数
//            }
//            for (int j = 1; j <=i; j++) {//控制输出的图案数量
//                System.out.print("* ");//打印图案
//
//            }
//            System.out.println( );
//        }
//        for (int i = 1; i <=7; i++) {//行数
//            for (int k = 1; k <=i; k++) {//列数
//                System.out.print(" ");//每行执行的空格数
//            }
//            for (int j = 1; j <=7-i; j++) {//控制输出的图案数量
//                System.out.print("* ");//打印图案
//
//            }
//            System.out.println( );//执行完图案之后的空格
        }
    }
}
