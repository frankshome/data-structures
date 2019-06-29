package com.xuhu.ds.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStack<T> {

    private int maxSize;
    private T[] data;
    private int top = -1;

    public int size(){
        return top + 1;
    }


    public ArrayStack(Class<T> clz, int maxSize) {
        this.maxSize = maxSize;
        data = (T[])Array.newInstance(clz, maxSize);
    }

    public void push(T e){
        if (top == maxSize - 1) {
            throw new RuntimeException("栈已满，无法添加数据");
        }
        top++;
        data[top] = e;
    }

    public T pop(){
        if (top < 0) {
            throw new RuntimeException("栈为空，无法获取数据");
        }
        T ret = data[top];
        top--;
        return ret;
    }

    public T peek(){
        if (top < 0) {
            throw new RuntimeException("栈为空，无法获取数据");
        }
        return data[top];
    }

    public boolean isEmpty(){
        return top < 0;
    }
}
