package com.pratise;

public class Circle {
    public static void main(String[] args) {
//        for (int i = 1; i <=7; i++) {//行数
//            for (int j = 0; j < 7-i; j++) {//列数
//                System.out.print(" ");//控制输出的空格数
//                System.out.print("* ");//输出图形
//            }
//            System.out.println();//每行图形结束后放行
//        }
//
//        for (int i = 1; i <=7; i++) {//行数
//            for (int k=1;k<=i;k++){//列数
//                System.out.print(" ");//控制输出的空格数
//            }
//
//            for (int j = 1; j<=7-i; j++) {//控制输出的图形数量
//                System.out.print("* ");//输出图形
//            }
//            System.out.println();//每行内容输出结束内容空行
//        }
//        for (int i = 1; i <=7; i++) {
//            for (int k = 1; k <=7-i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }
//        for (int i = 1; i <=7; i++) {
//            for (int k = 1; k <=i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=7-i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }

//        double sum=0,item=1;
//        int i=1,n=20;
//
//        while(i<=n){
//            sum=sum+item;
//            i=i+1;
//            item=item*(1.0/i);
//        }
//        System.out.println("sum:"+sum);
//        for (int i = 1; i <=10; i++) {
//            for (int k = 1; k <=10-i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }
//        for (int i = 1; i <=10; i++) {
//            for (int k = 1; k <=i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=10-i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println( );
//        }
//        for (int i = 1; i <=9; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(j+"*"+i+"="+(i*j)+"\t");
//            }
//            System.out.println( );
//        }


        for (int i = 1; i <=10; i++) {
            for (int i1 = 1; i1 <10-i; i1++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }

        for (int i = 1; i <=10; i++) {
            for (int i1 = 1; i1 <i; i1++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=10-i; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }

    }
}
