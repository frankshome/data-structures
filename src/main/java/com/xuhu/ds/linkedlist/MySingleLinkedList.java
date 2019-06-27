package com.xuhu.ds.linkedlist;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class MySingleLinkedList {

    private int size;

    private Node head = new Node();

    public Node getHead(){
        return head;
    }


    public void add(Node node) {
        node.setNext(null);
        size++;
        if (head.getNext() == null) {
            head.setNext(node);
            return;
        }

        Node temp = head.getNext();
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(node);
    }

    public void show(){
        if (head.getNext() == null) {
            System.out.println("队列为空...");
        }

        Node temp = head.getNext();
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public int size(){
        return size;
    }

    public void addByOrder(Node node){
        size++;
        node.setNext(null);
        if (head.getNext() == null) {
            head.setNext(node);
            return;
        }

        Node temp = head.getNext();

        while (temp.getNext() != null) {
            if (temp.getNext().getNo() > node.getNo()) {
                break;
            }
            temp = temp.getNext();
        }

        node.setNext(temp.getNext());
        temp.setNext(node);
    }

    public Node remove(Node node) {
        if (head.getNext() == null) {
            return null;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.getNext().getNo() == node.getNo()) {
                size--;
                temp.setNext(temp.getNext().getNext());
                return temp.getNext();
            }

            temp = temp.getNext();
        }

        return null;
    }

    public void reverse() {

        Node head = getHead();
        if (head.getNext() == null || head.getNext().getNext() == null) {
            return;
        }

        Node newHead = new Node();

        Node temp = head.getNext();
        while (temp != null) {
            Node origNext = temp.getNext();
            temp.setNext(newHead.getNext());
            newHead.setNext(temp);
            temp = origNext;
        }

        this.head = newHead;
    }

}


@Getter
@Setter
@NoArgsConstructor
class Node {
    private int no;
    private String name;
    private String nickName;
    private Node next;

    public Node(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
