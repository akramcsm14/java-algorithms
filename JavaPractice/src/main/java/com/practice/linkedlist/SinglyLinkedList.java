package com.practice.linkedlist;

public class SinglyLinkedList {
    class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.next = null;
            this.value = value;
        }
    }

    public Node head = null;
    private Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value +" --> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNode(1);
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(6);
        singlyLinkedList.addNode(3);
        singlyLinkedList.addNode(2);
        singlyLinkedList.addNode(0);
        singlyLinkedList.display();
    }
}
