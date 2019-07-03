package com.xuhu.ds.sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {

        int[] arr = {2, 5, 2, -3, 9, 6, 30, -1, 100, 3, 10};
        System.out.println("比较前~");
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println("比较后~");
        System.out.println(Arrays.toString(arr));

    }

    private static void insertSort(int[] arr) {
        int insIdx;
        int insVal;
        int len = arr.length;
        for (int i = 1; i < len; i++) {

            insIdx = i - 1;
            insVal = arr[i];
            while (insIdx >= 0 && arr[insIdx] > insVal){
                arr[insIdx + 1] = arr[insIdx];
                insIdx--;
            }
            arr[insIdx + 1] = insVal;
        }

    }
}
