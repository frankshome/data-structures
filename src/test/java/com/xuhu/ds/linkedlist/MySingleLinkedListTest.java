package com.xuhu.ds.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySingleLinkedListTest {

    @Test
    public void test1() {

        MySingleLinkedList myLinkedList = new MySingleLinkedList();

        Node node1 = new Node(1, "宋江", "及时雨");
        Node node2 = new Node(2, "卢俊义", "玉麒麟");
        Node node3 = new Node(3, "吴用", "智多星");
        Node node4 = new Node(4, "林冲", "豹子头");

        myLinkedList.add(node1);
        myLinkedList.add(node2);
        myLinkedList.add(node3);
        myLinkedList.add(node4);

        Assert.assertEquals(4, myLinkedList.size());
        myLinkedList.show();

        System.out.println("被删除的node=" + myLinkedList.remove(node2));
        System.out.println("删除后..." + myLinkedList.size());
        Assert.assertEquals(3, myLinkedList.size());
        myLinkedList.show();

        myLinkedList.remove(node1);
        myLinkedList.remove(node3);
        myLinkedList.remove(node4);
        System.out.println("删除后..." + myLinkedList.size());
        Assert.assertEquals(0, myLinkedList.size());
        myLinkedList.show();


        myLinkedList.addByOrder(node1);
        myLinkedList.addByOrder(node3);
        myLinkedList.addByOrder(node2);
        myLinkedList.addByOrder(node4);

        myLinkedList.show();


        Assert.assertEquals(4, MyLinkedLists.getByLastIndex(myLinkedList, 1).getNo());
        Assert.assertEquals(1, MyLinkedLists.getByLastIndex(myLinkedList, 4).getNo());
        Assert.assertEquals(null, MyLinkedLists.getByLastIndex(myLinkedList, 5));


        System.out.println("反转前~");
//        myLinkedList.show();
        System.out.println("反转后~");
//        myLinkedList.reverse();
        myLinkedList.show();

        System.out.println("反转打印....");
        System.out.println("===========================");
        MyLinkedLists.printByReverse(myLinkedList);



    }
}