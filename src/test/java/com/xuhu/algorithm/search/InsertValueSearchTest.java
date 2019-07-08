package com.xuhu.algorithm.search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertValueSearchTest {

    @Test
    public void search() {
        int[] arr = {1, 5, 8, 10, 12, 23, 996, 7856};
        int index = InsertValueSearch.search(arr, 0, arr.length - 1, 5);
        Assert.assertEquals(1, index);

        System.out.println();
        index = InsertValueSearch.search(arr, 0, arr.length - 1, 1);
        Assert.assertEquals(0, index);

        System.out.println();
        index = InsertValueSearch.search(arr, 0, arr.length - 1, 10);
        Assert.assertEquals(3, index);

        System.out.println();
        index = InsertValueSearch.search(arr, 0, arr.length - 1, 7856);
        Assert.assertEquals(7, index);

        System.out.println();
        index = InsertValueSearch.search(arr, 0, arr.length - 1, 7888);
        Assert.assertEquals(-1, index);

        System.out.println();
        index = InsertValueSearch.search(arr, 0, arr.length - 1, 9);
        Assert.assertEquals(-1, index);
    }
}