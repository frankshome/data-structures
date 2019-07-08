package com.xuhu.algorithm.search;

/**
 * 二分法要求数组必须是顺序的
 */
public class BinarySearch {

    public static int binarySearch(int[] arr,int left, int right, int findVal) {

        int len = arr.length;
        if (left > right || findVal < arr[0] || findVal > arr[len - 1]) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (findVal < arr[mid]) {
            return binarySearch(arr, left, mid - 1, findVal);
        }

        if (findVal > arr[mid]) {
            return binarySearch(arr, mid + 1, right, findVal);
        }

        return mid;



    }

}
