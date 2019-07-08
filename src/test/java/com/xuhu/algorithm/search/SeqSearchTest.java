package com.xuhu.algorithm.search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeqSearchTest {

    @Test
    public void seqSearch() {
        int[] arr = { 1, 9, 11, -1, 34, 89};
        Assert.assertEquals(-1, SeqSearch.seqSearch(arr, 99));
        Assert.assertEquals(0, SeqSearch.seqSearch(arr, 1));
        Assert.assertEquals(5, SeqSearch.seqSearch(arr, 89));
        Assert.assertEquals(1, SeqSearch.seqSearch(arr, 9));
    }
}