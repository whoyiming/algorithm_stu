package com.hym.algorithm;

import com.hym.leetcode.Node;
import com.hym.leetcode.Println;
import com.hym.leetcode.RemoveDuplicatesFromSortedList83;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {

    /**
     * Input: head = [1,1,2]
     * Output: [1,2]
     */
    @Test
    public void test1(){
        Node node = new Node(1);
        node.setNext(new Node(1));
        node.getNext().setNext(new Node(2));

        Println.out(RemoveDuplicatesFromSortedList83.deleteDuplicates(node));
    }

    /**
     * Input: head = [1,1,2,3,3]
     * Output: [1,2,3]
     */
    @Test
    public void test2(){
        Node node = new Node(1);
        node.setNext(new Node(1));
        node.getNext().setNext(new Node(2));
        node.getNext().getNext().setNext(new Node(3));
        node.getNext().getNext().getNext().setNext(new Node(3));

        Println.out(RemoveDuplicatesFromSortedList83.deleteDuplicates(node));
    }

    /**
     * Input: head = [1]
     * Output: [1]
     */
    @Test
    public void test3(){
        Node node = new Node(1);

        Println.out(RemoveDuplicatesFromSortedList83.deleteDuplicates(node));
    }

    /**
     * Input: head = []
     * Output: []
     */
    @Test
    public void test4(){
        Node node = null;

        Println.out(RemoveDuplicatesFromSortedList83.deleteDuplicates(node));
    }

    /**
     * Input: head = [1,1,2,3,3,4]
     * Output: [1,2,3,4]
     */
    @Test
    public void test5(){
        Node node = new Node(1);
        node.setNext(new Node(1));
        node.getNext().setNext(new Node(2));
        node.getNext().getNext().setNext(new Node(3));
        node.getNext().getNext().getNext().setNext(new Node(3));
        node.getNext().getNext().getNext().getNext().setNext(new Node(4));

        Println.out(RemoveDuplicatesFromSortedList83.deleteDuplicates(node));
    }
}
