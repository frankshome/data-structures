package com.xuhu.ds.sort;

public class QuickSort {

    public static void sort(int[] data, int left, int right) {
        int l = left;
        int r = right;
        int pivot = data[(left + right) / 2];
        int temp = 0;

        // 比pivot大的值放在右边
        while (l < r) {
            // 在pivot左边一直找，找到>=pivot的才退出
            while (data[l] < pivot) {
                l++;
            }

            // 在pivot右边一直找，找到<=pivot才退出
            while (data[r] > pivot) {
                r--;
            }

            // l>=r 表示pivot左边都是最小值，右边都是最大值
            if (l >= r) {
                break;
            }

            temp = data[l];
            data[l] = data[r];
            data[r] = temp;

            // 交换后，左侧的交换值=中间值，需要将右下标左移
            if (data[l] == pivot) {
                r--;
            }

            // 交换后，右侧的交换值=中间值，需要将左下标右移
            if (data[r] == pivot) {
                l++;
            }
        }

        // 如果 l == r, 必须 l++, r--, 否则为出现栈溢出
        if (l == r) {
            l++;
            r--;
        }

        if (left < r) {
            sort(data, left, r);
        }

        if (right > l) {
            sort(data, l, right);
        }
    }
}
