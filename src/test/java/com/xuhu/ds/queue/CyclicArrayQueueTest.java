package com.xuhu.ds.queue;

import org.junit.Assert;
import org.junit.Test;

public class CyclicArrayQueueTest {


    @Test
    public void testQueue(){
        CyclicArrayQueue queue = new CyclicArrayQueue(3);
        Assert.assertTrue(queue.isEmpty());
        Assert.assertFalse(queue.isFull());

        queue.add(1);
        queue.add(2);
        try {
            queue.add(3);
        } catch (RuntimeException e) {
            Assert.assertEquals(e.getMessage(), "队列已满，无法添加数据");
        }

        Assert.assertEquals(1, queue.get());

        Assert.assertFalse(queue.isEmpty());

        System.out.println("以下应只显示2~");
        queue.show();

        queue.add(3);

        Assert.assertEquals(2, queue.head());

        System.out.println("以下应显示2 3~");
        queue.show();

        Assert.assertTrue(queue.isFull());


        Assert.assertEquals(2, queue.get());
        Assert.assertEquals(3, queue.get());

        Assert.assertTrue(queue.isEmpty());

        queue.add(5);
        queue.add(6);

        System.out.println("以下应显示5 6~");
        queue.show();

        Assert.assertEquals(2, queue.size());

        queue.get();
        Assert.assertEquals(1, queue.size());
        queue.get();
        Assert.assertEquals(0, queue.size());





//        Assert.assertEquals(2, queue.get());
    }

}
