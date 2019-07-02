package com.xuhu.ds.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {2, 5, 2, 3, 9, 10};

        int compareCount = 0;
        int len = arr.length;


        for (int i = 0; i < len - 1; i++) {
            boolean isCompare = false;
            for (int j = 0; j < len - 1 - i; j++) {
                compareCount++;
                if (arr[j] > arr[j + 1]) {
                    isCompare = true;
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

            if (!isCompare) {
                break;
            }
        }


        System.out.println("比较次数:" + compareCount);
        System.out.println(Arrays.toString(arr));


    }
}
