package com.xuhu.algorithm.search;

public class InsertValueSearch {


    public static int search(int[] arr, int left, int right, int findVal) {
        int len = arr.length;
        if (left > right || findVal < arr[0] || findVal > arr[len - 1]) {
            return -1;
        }

        int mid = left + (right - left) * (findVal - arr[left]) / (arr[right] - arr[left]);
        if (findVal > arr[mid]) {
            return search(arr, mid + 1, right, findVal);
        }

        if (findVal < arr[mid]) {
            return search(arr, left, mid - 1, findVal);
        }

        return mid;
    }

}
