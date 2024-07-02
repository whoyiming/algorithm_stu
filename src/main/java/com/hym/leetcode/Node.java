package com.hym.leetcode;

public class Node<T> {
    private T ele;
    private Node<T> next;

    public Node() {

    }

    public Node(T ele) {
        this.ele = ele;
    }

    public Node(T ele, Node<T> next) {
        this.ele = ele;
        this.next = next;
    }

    public T getEle() {
        return ele;
    }

    public void setEle(T ele) {
        this.ele = ele;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "ele=" + ele +
                '}';
    }
}
