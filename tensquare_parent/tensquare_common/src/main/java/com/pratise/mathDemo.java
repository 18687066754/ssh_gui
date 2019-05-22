package com.pratise;

public class mathDemo {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println( );
        }


        for (int i = 1; i <=7; i++) {
            for (int k =1; k <=7-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }

        for (int i = 1; i <=7; i++) {
            for (int k =1; k <=i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=7-i; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }

        System.out.println("===========");
        for (int i = 0; i <=7; i++) {
            for (int k = 0; k <=7-i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }

            System.out.println( );
        }
        for (int i = 0; i <=7; i++) {
            for (int k = 0; k <=i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=7-i; j++) {
                System.out.print("* ");
            }
            System.out.println( );

//
//        int[] arr ={12,35,33,49,56,23,11};
//        System.out.print("排序前为：");
//        for (int num : arr) {
//            System.out.print(num+" ");
//        }
//        System.out.println();
//        for (int i=0;i<arr.length-1;i++){
//            for (int i1 = 0; i1 <arr.length-1-i; i1++) {
//                if(arr[i1]>arr[i1+1]){
//                    int temp=arr[i1];
//                    arr[i1]=arr[i1+1];
//                    arr[i1+1]=temp;
//                }
//            }
//        }
//        System.out.print("排序后为:");
//        for (int num : arr) {
//            System.out.print(num+" ");
//        }



//        int[] arr={12,43,45,56,67,43};
//        System.out.print("排序前为：");
//
//        for (int num : arr) {
//            System.out.print(num+" ");
//        }
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int i1 = 0; i1 < arr.length-1-i; i1++) {
//                if(arr[i1]>arr[i1+1]){
//                    int temp=arr[i1];
//                    arr[i1]=arr[i1+1];
//                    arr[i1+1]=temp;
//                }
//            }
//        }
//
//        System.out.print("排序后为：");
//
//        for (int num : arr) {
//            System.out.print(num+" ");
//        }
//        int k = 10;
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < k; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println( );
//        }

//        for (int i =1; i <=5; i++) {
//            System.out.print("x");
//            for (int j = 1; j <=5; j++) {
//                if(i==1||i==5||j==5){
//                    System.out.print("x");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println( );
//        }


//        for (int i = 1; i <=5; i++) {
//            System.out.print("*");
//            for (int j =1; j <=5; j++) {
//                if(i==1||i==5||j==5){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println(  );
//        }


//        for (int i = 1; i <=5; i++) {
//            for (int k = 1; k <=5-i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i*2; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <=8; i++) {
//            for (int k = 1; k <=8-i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i*2; j++) {
//                System.out.print("*");
//            }
//            System.out.println( );
        }


    }
}
