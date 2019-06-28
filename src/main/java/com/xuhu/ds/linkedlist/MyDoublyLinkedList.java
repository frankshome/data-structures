package com.xuhu.ds.linkedlist;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class MyDoublyLinkedList {

    DoublyNode head = new DoublyNode();

    private int size = 0;

    public int getSize(){
        return size;
    }

    public DoublyNode getHead(){
        return head;
    }

    public void add(DoublyNode node) {
        node.setPre(null);
        node.setNext(null);

        if (head.getNext() == null) {
            node.setPre(head);
            head.setNext(node);
            return;
        }

        DoublyNode temp = head;

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        node.setPre(temp);
        temp.setNext(node);
    }

    public DoublyNode remove(DoublyNode doublyNode) {

        if (head.getNext() == null) {
            System.out.println("链表为空,无法删除元素");
            return null;
        }

        DoublyNode curr = head.getNext();
        while (curr != null) {
            if (curr.getNo() == doublyNode.getNo()) {
                curr.getPre().setNext(curr.getNext());
                if (curr.getNext() != null) {
                    curr.getNext().setPre(curr.getPre());
                }
                return curr;
            }

            curr = curr.getNext();
        }

        return null;
    }


    public void show(){
        if (head.getNext() == null) {
            System.out.println("队列为空...");
        }

        DoublyNode temp = head.getNext();
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }



}


@NoArgsConstructor
@Getter
@Setter
class DoublyNode {
    private int no;
    private String name;
    private String nickName;
    private DoublyNode pre;
    private DoublyNode next;

    public DoublyNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "DoublyNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
