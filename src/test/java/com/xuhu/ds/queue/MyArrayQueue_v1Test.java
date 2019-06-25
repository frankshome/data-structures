package com.xuhu.ds.queue;

import org.junit.Assert;
import org.junit.Test;

public class MyArrayQueue_v1Test {

    @Test
    public void isFullOrEmpty() {
        MyArrayQueue_v1 queue = new MyArrayQueue_v1(1);
        Assert.assertFalse(queue.isFull());
        Assert.assertTrue(queue.isEmpty());
        queue.add(1);
        Assert.assertTrue(queue.isFull());
        Assert.assertFalse(queue.isEmpty());
    }

    @Test
    public void add() {
        MyArrayQueue_v1 queue = new MyArrayQueue_v1(1);
        queue.add(5);
        Assert.assertEquals(5, queue.head());
        Assert.assertEquals(5, queue.get());
    }

    @Test
    public void get() {
        MyArrayQueue_v1 queue = new MyArrayQueue_v1(1);
        queue.add(5);

        Assert.assertEquals(5, queue.get());

        try {
            queue.get();
        } catch (RuntimeException e) {
            Assert.assertEquals(e.getMessage(), "队列为空，无法获取数据");
        }
    }

    @Test
    public void head() {

        MyArrayQueue_v1 queue = new MyArrayQueue_v1(1);
        queue.add(5);

        Assert.assertEquals(5, queue.head());

        queue.get();
        try {
            queue.head();
        } catch (RuntimeException e) {
            Assert.assertEquals(e.getMessage(), "队列为空，无法获取头部数据");
        }

    }
}