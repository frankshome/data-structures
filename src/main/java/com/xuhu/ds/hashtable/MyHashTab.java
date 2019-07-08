package com.xuhu.ds.hashtable;

import lombok.*;

public class MyHashTab<T> {

    private int size;
    private MyNode[] data;

    public MyHashTab(int size) {
        this.size = size;
        this.data = new MyNode[size];
    }

    public void put(Integer key, T t) {
        int idx = key % size;
        MyNode e = data[idx];
        MyNode node = new MyNode(key, t);
        if (e == null) {
            data[idx] = node;
            return;
        }

        while (e.getNext() != null) {
            e = e.getNext();
        }

        e.setNext(node);
    }

    public T get(int key) {
        int idx = key % size;
        MyNode node = data[idx];

        while (node != null) {
            if (node.getKey() == key) {
                return (T) node.getData();
            }
            node = node.getNext();
        }

        return null;
    }

    public void show(){
        for (int i = 0; i < data.length; i++) {
            System.out.println("数组index:" + i + ",开始遍历...");
            MyNode node = data[i];
            while (node != null) {
                System.out.println(node);
                node = node.getNext();
            }
            System.out.println("数组index:" + i + ",完成遍历.");
        }
    }

}



@Setter
@Getter
class MyNode{
    private Integer key;
    private Object data;
    private MyNode next;

    public MyNode(Integer key, Object data) {
        this.key = key;
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "key=" + key +
                ", data=" + data +
                '}';
    }
}


