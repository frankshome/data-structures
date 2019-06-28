package com.xuhu.ds.linkedlist;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class CircleSingleLinkedList {

    private int maxSize;


    private Child first = null;
    public void create(int maxSize){
        if (maxSize < 1) {
            return;
        }

        this.maxSize = maxSize;
        Child temp = null;
        for (int i = 0; i < maxSize; i++) {
            Child curr = new Child(i + 1);
            if (first == null) {
                first = curr;
                first.setNext(first);
                temp = first;
                continue;
            }

            temp.setNext(curr);
            curr.setNext(first);
            temp = curr;
        }
    }

    public void show(){

        if (first == null) {
            return;
        }

        Child temp = first;
        while (true) {
            System.out.println(temp);
            if (temp.getNext() == first) {
                return;
            }
            temp = temp.getNext();
        }
    }

    public void countByChild(int startNo, int countNum) {
        if (startNo < 1 || startNo > maxSize) {
            System.out.println("开始编号输入有误...");
            return;
        }

        if ((startNo + countNum - 1) > maxSize) {
            System.out.println("计数输入有误...");
            return;
        }


        // 使用一个临时节点，记录最后一个孩子信息
        Child helper = first;
        while (true) {
            if (helper.getNext() == first) {
                break;
            }

            helper = helper.getNext();
        }

        for (int i = 0; i < startNo - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }

        while (true) {
            if (helper == first) {
                break;
            }

            for (int i = 0; i < countNum - 1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }

            System.out.println("出圈孩子的信息为:" + first);
            first = first.getNext();
            helper.setNext(first);


        }
        System.out.println("最后出圈的孩子信息为:" + first);
        first = null;

    }


}


@NoArgsConstructor
@Setter
@Getter
class Child {
    private int no;
    private Child next;

    public Child(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Child{" +
                "no=" + no +
                '}';
    }
}
