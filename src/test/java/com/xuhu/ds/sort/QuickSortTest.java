package com.xuhu.ds.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;


public class QuickSortTest {

    @Test
    public void testAlgorithm() {
        int[] arr = getTestData(8);
        System.out.println("排序前:" + Arrays.toString(arr));
        QuickSort.sort(arr, 0, arr.length - 1);
        System.out.println("排序后:" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            Assert.assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    @Test
    public void testAlgorithmSpeed() {
        int[] data = getTestData(80000000);
        long start = System.currentTimeMillis();
        QuickSort.sort(data, 0, data.length - 1);
        System.out.println("用时:" + (System.currentTimeMillis() - start) / 1000 + "s");
    }



    private int[] getTestData(int len) {
        int[] data = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            data[i] = random.nextInt(len * 10);
        }

        return data;
    }
}