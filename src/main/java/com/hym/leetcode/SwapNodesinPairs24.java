package com.hym.leetcode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 *
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 *
 * Input: head = []
 * Output: []
 *
 * Input: head = [1]
 * Output: [1]
 */
public class SwapNodesinPairs24 {
    public static Node swapPairs(Node head) {
        Node dummyNode = new Node();
        Node node = dummyNode;
        dummyNode.setNext(head);


        while (dummyNode.getNext() != null && dummyNode.getNext().getNext() != null) {
            Node swap1 = dummyNode.getNext();
            Node swap2 = dummyNode.getNext().getNext();

            swap1.setNext(swap2.getNext());
            swap2.setNext(swap1);
            dummyNode.setNext(swap2);

            dummyNode = dummyNode.getNext().getNext();

        }

        return node.getNext();
    }

    public static Node swapPairs2(Node head) {
        Node dummyNode = new Node();
        dummyNode.setNext(head);
        Node prev = dummyNode;

        while (head != null && head.getNext() != null) {
            Node next = head.getNext();
            prev.setNext(next);
            head.setNext(next.getNext());
            next.setNext(head);

            prev = head;
            head = head.getNext();
        }

        return dummyNode.getNext();
    }
}
