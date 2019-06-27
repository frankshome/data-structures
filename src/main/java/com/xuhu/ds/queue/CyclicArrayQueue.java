package com.xuhu.ds.queue;

public class CyclicArrayQueue {

    private int maxSize = 0;
    private int front = 0;
    private int rear = 0;
    private int[] data;

    public CyclicArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        data = new int[maxSize];
    }

    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public void add(int e){
        if (isFull()) {
            throw new RuntimeException("队列已满，无法添加数据");
        }

        data[rear] = e;
        rear = (rear + 1) % maxSize;
    }

    public int get(){
        if (isEmpty()) {
            throw new RuntimeException("队列已空，无法获取数据");
        }

        int e = data[front];
        front = (front + 1) % maxSize;
        return e;
    }

    public int head(){
        if (isEmpty()) {
            throw new RuntimeException("队列已空，无法获取数据");
        }

        return data[front];
    }

    public void show(){
        if (isEmpty()) {
            return;
        }

        int len = size();
        for (int i = front; i < front + len; i++) {
            System.out.printf("%d ", data[i % maxSize]);
        }
        System.out.println();
    }


    public int size(){
        return (rear + maxSize - front) % maxSize;
    }


}
