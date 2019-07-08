package com.xuhu.algorithm.search;

public class SeqSearch {

    public static int seqSearch(int[] arr, int findVal) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == findVal) {
                return i;
            }
        }

        return -1;
    }


}
