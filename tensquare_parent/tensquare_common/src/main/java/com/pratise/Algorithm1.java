package com.pratise;

public class Algorithm1 {
    public static void main(String[] args) {
        int[] arr={12,34,5,14,74,54,21,33};
        System.out.println("排序之前的数组为：");
        for (int num : arr) {
            System.out.println(num+" ");
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int i1 = 0; i1 < arr.length-1-i; i1++) {
                if (arr[i1]>arr[i1+1]){
                    int temp=arr[i1];
                    arr[i1]=arr[i1+1];
                    arr[i1+1]=temp;
                }
            }
        }
        System.out.println("排序之后的数组为：");
        for (int num : arr) {
            System.out.println(num+" ");
        }
    }
}
