package com.xuhu.ds.linkedlist;

public class MyLinkedLists {

    public static Node getByLastIndex(MySingleLinkedList myLinkedList, int lastIndex) {
        if (lastIndex < 1 || lastIndex > myLinkedList.size()) {
            return null;
        }


        int offset = myLinkedList.size() - lastIndex;
        Node temp = myLinkedList.getHead().getNext();
        for (int i = 0; i < offset; i++) {
            temp = temp.getNext();
        }

        return temp;
    }

    public static void printByReverse(MySingleLinkedList myLinkedList){

        if (myLinkedList.getHead() == null) {
            return;
        }

        Node temp = myLinkedList.getHead();
        if (temp.getNext().getNext() == null) {
            System.out.println(temp);
            return;
        }

        Node[] nodes = new Node[myLinkedList.size()];
        int index = 0;
        while (temp.getNext() != null) {
            nodes[index] = temp.getNext();
            temp = temp.getNext();
            index++;
        }

        for (int i = nodes.length - 1; i >= 0; i--) {
            System.out.println(nodes[i]);
        }


    }



}
