package com.hym.algorithm;

import com.hym.leetcode.Node;
import com.hym.leetcode.Println;
import com.hym.leetcode.RemoveLinkedListElements203;
import org.junit.Test;

public class RemoveLinkedListElementsTest {

    @Test
    public void test1(){
        Node node = new Node(1);
        node.setNext(new Node(2));
        node.getNext().setNext(new Node(6));
        node.getNext().getNext().setNext(new Node(4));
        node.getNext().getNext().getNext().setNext(new Node(6));
        node.getNext().getNext().getNext().getNext().setNext(new Node(7));

        Println.out(RemoveLinkedListElements203.removeElements(node,6));
    }

    @Test
    public void test2(){
        Node node = new Node(6);
        node.setNext(new Node(6));
        node.getNext().setNext(new Node(6));
        node.getNext().getNext().setNext(new Node(6));
        node.getNext().getNext().getNext().setNext(new Node(6));

        Println.out(RemoveLinkedListElements203.removeElements(node,6));
    }

    @Test
    public void test3(){
        Node node = new Node(6);
        node.setNext(new Node(6));
        node.getNext().setNext(new Node(6));
        node.getNext().getNext().setNext(new Node(6));
        node.getNext().getNext().getNext().setNext(new Node(6));

        Println.out(RemoveLinkedListElements203.removeElements(node,5));
    }

    @Test
    public void test4(){
        Node node = null;
        Println.out(RemoveLinkedListElements203.removeElements(node,5));
    }

}
