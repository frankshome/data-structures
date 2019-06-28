package com.xuhu.ds.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyDoublyLinkedListTest {

    @Test
    public void test01() {

        MyDoublyLinkedList linkedList = new MyDoublyLinkedList();

        DoublyNode node1 = new DoublyNode(1, "宋江", "及时雨");
        DoublyNode node2 = new DoublyNode(2, "卢俊义", "玉麒麟");
        DoublyNode node3 = new DoublyNode(3, "吴用", "智多星");
        DoublyNode node4 = new DoublyNode(4, "林冲", "豹子头");

        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);

        linkedList.show();


        System.out.println("被删除元素:" + linkedList.remove(node4));
        System.out.println("删除后~");
        linkedList.show();
    }
}