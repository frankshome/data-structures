package com.xuhu.ds.queue;

public class Test {
    public static void main(String[] args) {
        MyArrayQueue_v1 myQueue = new MyArrayQueue_v1(3);
        System.out.println("开始队列添加测试..");
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(5);
        myQueue.add(8);

        myQueue.show();
        System.out.println("完成队列添加测试..");

        System.out.println("开始获取头部队列测试...");
        System.out.println(myQueue.head());
        System.out.println("开始获取队列测试....");
        System.out.println(myQueue.get());
        System.out.println("开始获取头部队列测试...");
        System.out.println(myQueue.head());

        myQueue.show();

        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
        System.out.println("显示队列");
        myQueue.show();

        try {
            System.out.println(myQueue.get());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            System.out.println(myQueue.head());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
