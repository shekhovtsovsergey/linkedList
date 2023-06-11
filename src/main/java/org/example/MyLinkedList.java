package org.example;

public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
        head = null;
    }


    public void add(String value) {
        Node newNode = new Node(value);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }


    public void remove(String value) {
        Node current = head;
        Node prev = null;

        while (current.getNext() != null){
            if (current.getValue() == value){
                if (current == head){
                    head = current.getNext();
                } else {
                    prev.setNext(current.getNext());
                }
            }
            prev= current;
            current = current.getNext();
        }
    }
}
