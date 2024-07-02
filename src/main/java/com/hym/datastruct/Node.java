package com.hym.datastruct;

public class Node<T> {

    private T ele;
    private Node next;

    public Node() {
    }

    public Node(T ele) {
        this.ele = ele;
    }

    public Node(T ele, Node next) {
        this.ele = ele;
        this.next = next;
    }

    public T getEle() {
        return ele;
    }

    public void setEle(T ele) {
        this.ele = ele;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "ele=" + ele +
                '}';
    }
}
