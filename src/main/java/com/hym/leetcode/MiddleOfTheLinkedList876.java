package com.hym.leetcode;

public class MiddleOfTheLinkedList876 {

    public ListNode middleNode(ListNode head) {
        ListNode dumpyNode = new ListNode();
        dumpyNode.next = head;
        ListNode slow = dumpyNode;
        ListNode fast = dumpyNode;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.next;
    }

}
