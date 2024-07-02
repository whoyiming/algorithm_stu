package com.hym.leetcode;

/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 *
 * Example 1:
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 *
 * Example 2:
 *
 * Input: head = [], val = 1
 * Output: []
 *
 * Example 3:
 *
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 *
 */
public class RemoveLinkedListElements203 {
    public static Node removeElements(Node head, int val) {
        if (head == null) {return head;}

        Node dummyNode = new Node();
        Node node = dummyNode;
        dummyNode.setNext(head);

        while (dummyNode.getNext() != null) {
            if (dummyNode.getNext().getEle().equals(val)) {
                dummyNode.setNext(dummyNode.getNext().getNext());
            } else {
                dummyNode = dummyNode.getNext();
            }
        }

        return node.getNext();
    }
}
