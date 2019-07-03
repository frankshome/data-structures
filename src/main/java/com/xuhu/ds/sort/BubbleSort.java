package com.xuhu.ds.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {2, 5, 2, 3, 9, 10};
        System.out.println("比较前~");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("比较后~");
        System.out.println(Arrays.toString(arr));

    }


    private static void bubbleSort(int[] arr) {
        int len = arr.length;
        boolean flag = false;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

            if (!flag) {
                return;
            }
        }
    }
}
