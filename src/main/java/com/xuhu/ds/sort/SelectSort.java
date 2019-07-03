package com.xuhu.ds.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, -3, 9, 6, 30, -1, 100, 3, 10};
        System.out.println("比较前~");
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println("比较后~");
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {

        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            int minNum = arr[i];
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < minNum) {
                    minIndex = j;
                    minNum = arr[j];
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = minNum;
        }
    }
}
