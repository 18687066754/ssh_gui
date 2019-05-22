package com.pratise;

import sun.security.util.Length;

public class Algorithm {
    public static void main(String[] args) {
        //定义一组无须的数组
        int[] arr={23,34,55,25,13,54,112};
        System.out.println("排序之前的数组为：");
        for (int num : arr) {
            System.out.println(num+"");
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int i1 = 0; i1 < arr.length - 1-i; i1++) {
                   if(arr[i1]>arr[i1+1]){
                   int temp= arr[i1];
                   arr[i1]=arr[i1+1];
                   arr[i1+1]=temp;
                   }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.println(num+" ");
        };

    }
}
