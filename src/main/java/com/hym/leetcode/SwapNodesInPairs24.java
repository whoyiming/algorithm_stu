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
public class SwapNodesInPairs24 {

    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode prev = dummyNode;

        while (head != null && head.next != null) {
            ListNode next = head.next;
            prev.next = next;
            head.next = next.next;
            next.next = head;

            prev = head;
            head = head.next;
        }
        return dummyNode.next;
    }


//    public ListNode swapPairs(ListNode head) {
//        if ((head == null)||(head.next == null))
//            return head;
//        ListNode n = head.next;
//        head.next = swapPairs(head.next.next);
//        n.next = head;
//        return n;
//    }

}
