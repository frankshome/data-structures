package com.xuhu.ds.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class ShellSortTest {

    @Test
    public void testAlgorithm() {
        int[] arr = getTestData(8);
        System.out.println("排序前:" + Arrays.toString(arr));
//        ShellSort.sort1(arr);
        ShellSort.sort2(arr);
        System.out.println("排序后:" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            Assert.assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    /**
     * 交换数据的方式
     */
    @Test
    public void testAlgorithmSpeed1() {
        int[] data = getTestData(80000);
        long start = System.currentTimeMillis();
        ShellSort.sort1(data);
        System.out.println("用时:" + (System.currentTimeMillis() - start) / 1000 + "s");
    }

    /**
     * 移位的方式
     */
    @Test
    public void testAlgorithmSpeed2() {
        int[] data = getTestData(80000);
        long start = System.currentTimeMillis();
        ShellSort.sort2(data);
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