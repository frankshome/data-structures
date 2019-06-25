package com.xuhu.ds.queue;

public class MyArrayQueue_v1 {

    private int maxSize;
    private int front;
    private int rear;
    private int[] data;

    public MyArrayQueue_v1(int maxSize) {
        this.maxSize = maxSize;
        data = new int[maxSize];
        front = rear = -1;
    }

    public boolean isFull(){
        return rear + 1 == maxSize;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public void add(int e) {
        if (isFull()) {
            System.out.println("队列已满，无法添加");
            return;
        }
        data[++rear] = e;
    }

    public int get(){
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法获取数据");
        }

        return data[++front];
    }

    public int head(){
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法获取头部数据");
        }
        return data[front + 1];
    }

    public void show(){
        if (isEmpty()) {
            return;
        }

        for (int i = front + 1; i <= rear; i++) {
            System.out.printf("%d ", data[i]);
        }
        System.out.println();
    }
}
